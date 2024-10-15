/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pizzeria;

import java.io.File;

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

