/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import GUI.ControlDeGastos.Opciones;

import java.awt.BorderLayout;

import java.awt.Desktop;
import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.net.URI;

import javax.swing.JFrame;

/**
 *
 * @author Faby
 */
public class Principal extends javax.swing.JPanel {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gastos = new javax.swing.JButton();
        comanda = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(97, 97, 97));
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1000, 600));

        gastos.setBackground(new java.awt.Color(210, 180, 111));
        gastos.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        gastos.setForeground(new java.awt.Color(51, 51, 51));
        gastos.setText("CONTROL DE GASTOS");
        gastos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gastos.setFocusPainted(false);

        comanda.setBackground(new java.awt.Color(210, 180, 111));
        comanda.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        comanda.setForeground(new java.awt.Color(51, 51, 51));
        comanda.setText("COMANDAS");
        comanda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        comanda.setFocusPainted(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO-modified.2.png"))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(57, 57, 57));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<html><a href='' style='color: white;'>Hecho por: Faby Rossetto</a></html>");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(57, 57, 57));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Version 1.1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel1)
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gastos, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(comanda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(158, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(comanda, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(gastos, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

        // Abre el enlace en el navegador predeterminado al hacer clic
        try {
            Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/fabyrossetto/"));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_jLabel3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comanda;
    private javax.swing.JButton gastos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
 private JFrame parentFrame;

    // Constructor que toma un JFrame como referencia
    public Principal(JFrame parentFrame) {
        this.parentFrame = parentFrame;  // Mantiene una referencia al JFrame principal

        initComponents();
        setupActionListeners();
    }

    // Inicialización de los ActionListeners
    private void setupActionListeners() {
        comanda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarOpcionesComandas();
            }
        });
        gastos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarOpciones();
            }
        });
    }

    public void mostrarOpcionesComandas() {
        OpcionesComanda comanda = new OpcionesComanda(parentFrame);

        parentFrame.getContentPane().removeAll();

        parentFrame.setResizable(false);  // Evitar el redimensionamiento de la ventana

//  fijar el tamaño preferido del panel para evitar que se ajuste
        comanda.setPreferredSize(new Dimension(1000, 600));
        parentFrame.add(comanda, BorderLayout.CENTER);
        parentFrame.pack();
        parentFrame.setLocationRelativeTo(null);
        parentFrame.revalidate();
        parentFrame.repaint();

        System.out.println("Pantalla de Comandas mostrada");
    }

    // Método para mostrar el panel Opciones
    public void mostrarOpciones() {
        Opciones gastos = new Opciones(parentFrame);

        parentFrame.getContentPane().removeAll();

        parentFrame.setResizable(false);  // Evitar el redimensionamiento de la ventana

//  fijar el tamaño preferido del panel para evitar que se ajuste
        gastos.setPreferredSize(new Dimension(1000, 600));
        parentFrame.add(gastos, BorderLayout.CENTER);
        parentFrame.pack();
        parentFrame.setLocationRelativeTo(null);
        parentFrame.revalidate();
        parentFrame.repaint();
        System.out.println("Pantalla de gastos mostrada");
    }

    public void inicio() {
        Principal ppal = new Principal(parentFrame);
        parentFrame.getContentPane().removeAll();

        parentFrame.setResizable(false);  // Evitar el redimensionamiento de la ventana

//  fijar el tamaño preferido del panel para evitar que se ajuste
        ppal.setPreferredSize(new Dimension(1000, 600));
        parentFrame.add(ppal, BorderLayout.CENTER);
        parentFrame.pack();
        parentFrame.setLocationRelativeTo(null);
        parentFrame.revalidate();
        parentFrame.repaint();
        System.out.println("volviendo al inicio");
    }

}
