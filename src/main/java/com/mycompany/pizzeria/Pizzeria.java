/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pizzeria;

import GUI.ControlDeGastos.Opciones;
import GUI.OpcionesComanda;
import GUI.Principal;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author Faby
 */
@SpringBootApplication
public class Pizzeria {


    private static String logoControlGastos = "/Imagenes/calculadora.png";
    private static String logoComandas = "/Imagenes/notas.png";
    private static String logoBuscar = "/Imagenes/lupa.png";

    private static String logoDescargarDB = "/Imagenes/exportar.png";
    private static String logoInicio = "/Imagenes/casa.png";
    static Color colorBarra = new Color(210, 180, 111);

    public static void main(String[] args) {
        // Crea el directorio para la base de datos si no existe
        ensureDataDirectoryExists();

        // Desactiva el modo headless
        System.setProperty("java.awt.headless", "false");

        // Inicia la aplicación Spring Boot
        SpringApplication.run(Pizzeria.class, args);
        // Abre la ventana de Principal en un nuevo hilo
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Pizzeria"); // Crea un JFrame con título
                frame.setLayout(new BorderLayout()); // Asegura que se usa BorderLayout para el JFrame

                // Crear la barra de menú y configurarla en el JFrame
                JMenuBar barraMenu = new JMenuBar();

                //crea el item y lo decora
                //inicio
                JMenuItem inicio = new JMenuItem("Inicio", getIcono(logoInicio));
                inicio.setOpaque(true);
                inicio.setBackground(colorBarra);
                inicio.setForeground(Color.WHITE);

                //control de gastos
                JMenuItem controlGastos = new JMenuItem("Control de Gastos", getIcono(logoControlGastos));
                controlGastos.setOpaque(true);
                controlGastos.setBackground(colorBarra);
                controlGastos.setForeground(Color.WHITE);

                //comandas
                JMenuItem comandas = new JMenuItem("Comandas", getIcono(logoComandas));
                comandas.setOpaque(true);
                comandas.setBackground(colorBarra);
                comandas.setForeground(Color.WHITE);

                //buscar con menu desplegable
                JMenu menuOpciones = new JMenu("Buscar");
                menuOpciones.setIcon(getIcono(logoBuscar));
                menuOpciones.setOpaque(true);
                menuOpciones.setBackground(colorBarra);
                menuOpciones.setForeground(Color.WHITE);

                //el desplegable 
                JMenuItem buscarPorFecha = new JMenuItem("Buscar comandas por fecha");
                buscarPorFecha.setOpaque(true);
                buscarPorFecha.setBackground(colorBarra);
                buscarPorFecha.setForeground(Color.WHITE);

                JMenuItem buscarPorMozo = new JMenuItem("Buscar comandas por mozo");
                buscarPorMozo.setOpaque(true);
                buscarPorMozo.setBackground(colorBarra);
                buscarPorMozo.setForeground(Color.WHITE);

                JMenuItem buscarPorEstado = new JMenuItem("Buscar comandas por Estado");
                buscarPorEstado.setOpaque(true);
                buscarPorEstado.setBackground(colorBarra);
                buscarPorEstado.setForeground(Color.WHITE);

                JMenuItem buscarPorMesa = new JMenuItem("Buscar comandas por mesa");
                buscarPorMesa.setOpaque(true);
                buscarPorMesa.setBackground(colorBarra);
                buscarPorMesa.setForeground(Color.WHITE);

                JMenuItem todasComandas = new JMenuItem("Ver todas las comandas");
                todasComandas.setOpaque(true);
                todasComandas.setBackground(colorBarra);
                todasComandas.setForeground(Color.WHITE);

                JMenuItem TodasVentas = new JMenuItem("Ver todas las ventas");
                TodasVentas.setOpaque(true);
                TodasVentas.setBackground(colorBarra);
                TodasVentas.setForeground(Color.WHITE);

                JMenuItem TodasCompras = new JMenuItem("Ver todas las compras");
                TodasCompras.setOpaque(true);
                TodasCompras.setBackground(colorBarra);
                TodasCompras.setForeground(Color.WHITE);

                JMenuItem Balance = new JMenuItem("Balance");
                Balance.setOpaque(true);
                Balance.setBackground(colorBarra);
                Balance.setForeground(Color.WHITE);

                menuOpciones.add(buscarPorFecha);
                menuOpciones.add(buscarPorMozo);
                menuOpciones.add(buscarPorEstado);
                menuOpciones.add(buscarPorMesa);
                menuOpciones.add(todasComandas);
                menuOpciones.add(TodasVentas);
                menuOpciones.add(TodasCompras);
                menuOpciones.add(Balance);

                //exportar base de datos
                JMenuItem exportar = new JMenuItem("Exportar BD", getIcono(logoDescargarDB));
                exportar.setOpaque(true);
                exportar.setBackground(colorBarra);
                exportar.setForeground(Color.WHITE);

                //agregar el item a la barra
                barraMenu.add(inicio);
                barraMenu.add(controlGastos);
                barraMenu.add(comandas);
                barraMenu.add(exportar);//aun no lo hago
                barraMenu.add(menuOpciones);

                frame.setJMenuBar(barraMenu);  // Establece la barra de menú en el JFrame

                Principal ppal = new Principal(frame); // Pasa el JFrame al constructor de Principal
                frame.setResizable(false);  // Evitar el redimensionamiento de la ventana

//  fijar el tamaño preferido del panel para evitar que se ajuste
                ppal.setPreferredSize(new Dimension(1300, 800));
                frame.add(ppal, BorderLayout.CENTER);
                frame.pack();  // Esto ajusta el tamaño del frame según el tamaño preferido del contenido
                frame.setLocationRelativeTo(null); // Esto lo centra en la pantalla
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true); // Muestra la ventana
                // Configuración de los ActionListener en el menú
                OpcionesComanda metodosBuscar = new OpcionesComanda(frame);
                buscarPorFecha.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        metodosBuscar.BuscarPorFecha();
                    }
                });
                buscarPorEstado.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        metodosBuscar.BuscarPorEstado();
                    }
                });
                buscarPorMozo.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        metodosBuscar.BuscarPorMozo();
                    }
                });
                buscarPorMesa.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        metodosBuscar.BuscarPorMesa();
                    }
                });
                todasComandas.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        metodosBuscar.TodasLasComandas();
                    }
                });

                Opciones control = new Opciones(frame);

                TodasVentas.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        control.listarVentas();
                    }
                });
                TodasCompras.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        control.listarCompras();
                    }
                });
                Balance.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        control.balanceDiario();
                    }
                });
                inicio.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ppal.inicio();
                    }
                });
                controlGastos.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ppal.mostrarOpciones(); // Llama al método de Principal
                    }
                });

                comandas.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ppal.mostrarOpcionesComandas(); // Llama al método de Principal
                    }
                });

            }
        });
    }

    private static Icon getIcono(String ruta) {
        return new ImageIcon(new ImageIcon(Pizzeria.class.getResource(ruta)).getImage().getScaledInstance(30, 30, 0));
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
