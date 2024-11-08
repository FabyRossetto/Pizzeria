/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.ControlDeGastos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Faby
 */
public class Opciones extends javax.swing.JPanel {

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IngresarCompra = new javax.swing.JButton();
        IngresarVenta = new javax.swing.JButton();
        VerCompras = new javax.swing.JButton();
        VerVentas = new javax.swing.JButton();
        Balance = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setBackground(new java.awt.Color(97, 97, 97));
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(1123, 755));

        IngresarCompra.setBackground(new java.awt.Color(210, 180, 111));
        IngresarCompra.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        IngresarCompra.setForeground(new java.awt.Color(255, 255, 255));
        IngresarCompra.setText("INGRESAR UNA COMPRA");
        IngresarCompra.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        IngresarCompra.setFocusPainted(false);

        IngresarVenta.setBackground(new java.awt.Color(210, 180, 111));
        IngresarVenta.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        IngresarVenta.setForeground(new java.awt.Color(255, 255, 255));
        IngresarVenta.setText("INGRESAR UNA VENTA");
        IngresarVenta.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        IngresarVenta.setFocusPainted(false);

        VerCompras.setBackground(new java.awt.Color(210, 180, 111));
        VerCompras.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        VerCompras.setForeground(new java.awt.Color(255, 255, 255));
        VerCompras.setText("VER TODAS LA COMPRAS");
        VerCompras.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        VerCompras.setFocusPainted(false);

        VerVentas.setBackground(new java.awt.Color(210, 180, 111));
        VerVentas.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        VerVentas.setForeground(new java.awt.Color(255, 255, 255));
        VerVentas.setText("VER TODAS LAS VENTAS");
        VerVentas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        VerVentas.setFocusPainted(false);

        Balance.setBackground(new java.awt.Color(210, 180, 111));
        Balance.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Balance.setForeground(new java.awt.Color(255, 255, 255));
        Balance.setText("BALANCE DIARIO");
        Balance.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        Balance.setFocusPainted(false);

        jButton7.setBackground(new java.awt.Color(210, 180, 111));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-left-50.png"))); // NOI18N
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.setFocusPainted(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IngresarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(VerCompras, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                    .addComponent(Balance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IngresarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(VerVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(375, 375, 375))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(16, Short.MAX_VALUE)
                        .addComponent(IngresarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(VerCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(Balance, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(IngresarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(VerVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Balance;
    private javax.swing.JButton IngresarCompra;
    private javax.swing.JButton IngresarVenta;
    private javax.swing.JButton VerCompras;
    private javax.swing.JButton VerVentas;
    private javax.swing.JButton jButton7;
    // End of variables declaration//GEN-END:variables

 private JFrame parentFrame;

    // Constructor que toma un JFrame como referencia
    public Opciones(JFrame parentFrame) {
        this.parentFrame = parentFrame;  // Mantiene una referencia al JFrame principal
        initComponents();
        setupActionListeners();
    }
    
     private void setupActionListeners() {
        IngresarCompra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ingresarCompra();
            }
        });
        IngresarVenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               ingresarVenta();
            }
        });
        VerCompras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listarCompras();
            }
        });
        VerVentas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listarVentas();
            }
        });
        Balance.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                balanceDiario();
            }
        });
}
     
     private void ingresarCompra() {
        IngresarCompra compra = new IngresarCompra(parentFrame);
        parentFrame.getContentPane().removeAll();
        parentFrame.getContentPane().add(compra);

        parentFrame.setSize(1300, 800);  // Tamaño grande
        parentFrame.setLocationRelativeTo(null);  // Centra la ventana
        parentFrame.revalidate();
        parentFrame.repaint();
        System.out.println("Pantalla ingresar compra");
    }

    public void listarCompras() {
        ListarCompras lista = new ListarCompras(parentFrame);
        parentFrame.getContentPane().removeAll();
        parentFrame.getContentPane().add(lista);

        parentFrame.setSize(1300, 800);  // Tamaño pequeño
        parentFrame.setLocationRelativeTo(null);
        parentFrame.revalidate();
        parentFrame.repaint();
        System.out.println("Pantalla de listar compras");
    }
     private void ingresarVenta() {
        IngresarVenta venta = new IngresarVenta(parentFrame);
        parentFrame.getContentPane().removeAll();
        parentFrame.getContentPane().add(venta);

        parentFrame.setSize(1300, 800);  // Tamaño grande
        parentFrame.setLocationRelativeTo(null);  // Centra la ventana
        parentFrame.revalidate();
        parentFrame.repaint();
        System.out.println("Pantalla ingresar compra");
    }

    public void listarVentas() {
        ListarVentas lista = new ListarVentas(parentFrame);
        parentFrame.getContentPane().removeAll();
        parentFrame.getContentPane().add(lista);

        parentFrame.setSize(1300, 800);  // Tamaño pequeño
        parentFrame.setLocationRelativeTo(null);
        parentFrame.revalidate();
        parentFrame.repaint();
        System.out.println("Pantalla de listar compras");
    }
     public void balanceDiario() {
        Balance balance = new Balance(parentFrame);
        parentFrame.getContentPane().removeAll();
        parentFrame.getContentPane().add(balance);

        parentFrame.setSize(1300, 800);  // Tamaño pequeño
        parentFrame.setLocationRelativeTo(null);
        parentFrame.revalidate();
        parentFrame.repaint();
        System.out.println("Pantalla de listar compras");
    }
}
