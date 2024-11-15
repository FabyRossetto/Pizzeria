  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.ControlDeGastos;

import GUI.Principal;
import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.URI;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.KeyStroke;

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
        atras = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(97, 97, 97));
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(1123, 755));

        IngresarCompra.setBackground(new java.awt.Color(210, 180, 111));
        IngresarCompra.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        IngresarCompra.setForeground(new java.awt.Color(255, 255, 255));
        IngresarCompra.setText("INGRESAR UNA COMPRA");
        IngresarCompra.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        IngresarCompra.setFocusPainted(false);
        IngresarCompra.setMaximumSize(new java.awt.Dimension(211, 31));
        IngresarCompra.setMinimumSize(new java.awt.Dimension(211, 31));
        IngresarCompra.setPreferredSize(new java.awt.Dimension(211, 31));
        IngresarCompra.setRequestFocusEnabled(false);

        IngresarVenta.setBackground(new java.awt.Color(210, 180, 111));
        IngresarVenta.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        IngresarVenta.setForeground(new java.awt.Color(255, 255, 255));
        IngresarVenta.setText("INGRESAR UNA VENTA");
        IngresarVenta.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        IngresarVenta.setFocusPainted(false);

        VerCompras.setBackground(new java.awt.Color(210, 180, 111));
        VerCompras.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        VerCompras.setForeground(new java.awt.Color(255, 255, 255));
        VerCompras.setText("VER TODAS LA COMPRAS");
        VerCompras.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        VerCompras.setFocusPainted(false);
        VerCompras.setMaximumSize(new java.awt.Dimension(211, 31));
        VerCompras.setMinimumSize(new java.awt.Dimension(211, 31));
        VerCompras.setPreferredSize(new java.awt.Dimension(211, 31));

        VerVentas.setBackground(new java.awt.Color(210, 180, 111));
        VerVentas.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        VerVentas.setForeground(new java.awt.Color(255, 255, 255));
        VerVentas.setText("VER TODAS LAS VENTAS");
        VerVentas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        VerVentas.setFocusPainted(false);

        Balance.setBackground(new java.awt.Color(210, 180, 111));
        Balance.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Balance.setForeground(new java.awt.Color(255, 255, 255));
        Balance.setText("BALANCE DIARIO");
        Balance.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        Balance.setFocusPainted(false);

        atras.setBackground(new java.awt.Color(210, 180, 111));
        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-left-50.png"))); // NOI18N
        atras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        atras.setFocusPainted(false);

        jLabel3.setBackground(new java.awt.Color(57, 57, 57));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<html><a href='' style='color: white;'>Hecho por: Faby Rossetto</a></html>");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IngresarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VerCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(157, 157, 157)
                        .addComponent(Balance, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IngresarVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VerVentas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(atras)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 892, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IngresarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IngresarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(VerVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VerCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Balance, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(231, 231, 231)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
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
    private javax.swing.JButton Balance;
    private javax.swing.JButton IngresarCompra;
    private javax.swing.JButton IngresarVenta;
    private javax.swing.JButton VerCompras;
    private javax.swing.JButton VerVentas;
    private javax.swing.JButton atras;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

 private JFrame parentFrame;

    // Constructor que toma un JFrame como referencia
    public Opciones(JFrame parentFrame) {
        this.parentFrame = parentFrame;  // Mantiene una referencia al JFrame principal
        initComponents();
        setupActionListeners();
        setupEscapeKeyAction();
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
        atras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                volverAtras();
            }
        });
}
      private void setupEscapeKeyAction() {
    // Mapa de entradas y acciones para el panel actual
    this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "volverAtras");
    this.getActionMap().put("volverAtras", new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            volverAtras();
        }
    });
    }
     
     private void ingresarCompra() {
        IngresarCompra compra = new IngresarCompra(parentFrame);
        parentFrame.getContentPane().removeAll();
        parentFrame.setResizable(false);  // Evitar el redimensionamiento de la ventana

//  fijar el tamaño preferido del panel para evitar que se ajuste
        compra.setPreferredSize(new Dimension(1300, 800));
        parentFrame.add(compra, BorderLayout.CENTER);
        parentFrame.pack();
        parentFrame.setLocationRelativeTo(null);  // Centra la ventana
        parentFrame.revalidate();
        parentFrame.repaint();
        System.out.println("Pantalla ingresar compra");
    }

    public void listarCompras() {
        ListarCompras lista = new ListarCompras(parentFrame);
        parentFrame.getContentPane().removeAll();
        parentFrame.setResizable(false);  // Evitar el redimensionamiento de la ventana

//  fijar el tamaño preferido del panel para evitar que se ajuste
        lista.setPreferredSize(new Dimension(1300, 800));
        parentFrame.add(lista, BorderLayout.CENTER);
        parentFrame.pack();
        parentFrame.setLocationRelativeTo(null);
        parentFrame.revalidate();
        parentFrame.repaint();
        System.out.println("Pantalla de listar compras");
    }
     private void ingresarVenta() {
        IngresarVenta venta = new IngresarVenta(parentFrame);
        parentFrame.getContentPane().removeAll();
       parentFrame.setResizable(false);  // Evitar el redimensionamiento de la ventana

//  fijar el tamaño preferido del panel para evitar que se ajuste
        venta.setPreferredSize(new Dimension(1300, 800));
        parentFrame.add(venta, BorderLayout.CENTER);
        parentFrame.pack();
        parentFrame.setLocationRelativeTo(null);  // Centra la ventana
        parentFrame.revalidate();
        parentFrame.repaint();
        System.out.println("Pantalla ingresar compra");
    }

    public void listarVentas() {
        ListarVentas lista = new ListarVentas(parentFrame);
        parentFrame.getContentPane().removeAll();
        parentFrame.setResizable(false);  // Evitar el redimensionamiento de la ventana

//  fijar el tamaño preferido del panel para evitar que se ajuste
        lista.setPreferredSize(new Dimension(1300, 800));
        parentFrame.add(lista, BorderLayout.CENTER);
        parentFrame.pack();
        parentFrame.setLocationRelativeTo(null);
        parentFrame.revalidate();
        parentFrame.repaint();
        System.out.println("Pantalla de listar compras");
    }
     public void balanceDiario() {
        Balance balance = new Balance(parentFrame);
        parentFrame.getContentPane().removeAll();
       parentFrame.setResizable(false);  // Evitar el redimensionamiento de la ventana

//  fijar el tamaño preferido del panel para evitar que se ajuste
        balance.setPreferredSize(new Dimension(500, 400));
        parentFrame.add(balance, BorderLayout.CENTER);
        parentFrame.setSize(500, 400);
        parentFrame.setLocationRelativeTo(null);
        parentFrame.revalidate();
        parentFrame.repaint();
        System.out.println("Pantalla de listar compras");
    }
     // Método para volver a la ventana anterior
    private void volverAtras() {
        Principal volver = new Principal(parentFrame);
        parentFrame.getContentPane().removeAll();  // Elimina el contenido actual del JFrame
        parentFrame.setResizable(false);  // Evitar el redimensionamiento de la ventana

//  fijar el tamaño preferido del panel para evitar que se ajuste
        volver.setPreferredSize(new Dimension(1300, 800));
        parentFrame.add(volver, BorderLayout.CENTER);
        parentFrame.getContentPane().revalidate();  // Revalida el JFrame para actualizar la UI
        parentFrame.getContentPane().repaint();     // Repinta el JFrame para asegurarse de que se vea correctamente
        parentFrame.pack();
        parentFrame.setLocationRelativeTo(null);
        System.out.println("atras");
      
    }
}
