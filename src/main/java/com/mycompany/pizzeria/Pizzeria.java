/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pizzeria;

import GUI.Principal;
import java.awt.BorderLayout;
import java.io.File;
import javax.swing.JFrame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author Faby
 */
@SpringBootApplication
public class Pizzeria {


    public static void main(String[] args) {
        // Crea el directorio para la base de datos si no existe
        ensureDataDirectoryExists();

        // Desactiva el modo headless
        System.setProperty("java.awt.headless", "false");

        // Inicia la aplicación Spring Boot
        SpringApplication.run(Pizzeria.class, args);
        // Abre la ventana de Principal en un nuevo hilo
        java.awt.EventQueue.invokeLater(() -> {
            JFrame frame = new JFrame("Pizzeria"); // Crea un JFrame con título
            frame.setLayout(new BorderLayout()); // Asegura que se usa BorderLayout para el JFrame
            Principal ppal = new Principal(frame); // Pasa el JFrame al constructor de Principal
            frame.add(ppal, BorderLayout.CENTER); // Añade el JPanel Principal al centro
            frame.setSize(1123, 755); 
            frame.setLocationRelativeTo(null); // Esto lo centra en la pantalla
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
            frame.setVisible(true); // Muestra la ventana
        });
    }

    // Método para asegurar que el directorio 'data/db' existe
    private static void ensureDataDirectoryExists() {
        File dataDir = new File("D:/Documents/NetBeansProjects/Pizzeria/data/db");
        if (!dataDir.exists()) {
            boolean created = dataDir.mkdirs(); // Crea los directorios necesarios
            if (created) {
                System.out.println("Directorio 'data/db' creado con éxito.");
            } else {
                System.err.println("No se pudo crear el directorio 'data/db'.");
            }
        }
    }
}

