/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.URI;
import javax.swing.AbstractAction;

import javax.swing.JComponent;
import javax.swing.JFrame;

import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/**
 *
 * @author Faby
 */
public class OpcionesComanda extends javax.swing.JPanel {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buscar = new javax.swing.JPopupMenu();
        GenerarComanda = new javax.swing.JButton();
        verComandas = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        buscarButton = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(97, 97, 97));
        setToolTipText("");
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(1000, 600));

        GenerarComanda.setBackground(new java.awt.Color(210, 180, 111));
        GenerarComanda.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        GenerarComanda.setForeground(new java.awt.Color(51, 51, 51));
        GenerarComanda.setText("NUEVA COMANDA");
        GenerarComanda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        GenerarComanda.setFocusPainted(false);

        verComandas.setBackground(new java.awt.Color(210, 180, 111));
        verComandas.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        verComandas.setForeground(new java.awt.Color(51, 51, 51));
        verComandas.setText("VER TODAS ");
        verComandas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        verComandas.setFocusPainted(false);
        verComandas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verComandasActionPerformed(evt);
            }
        });

        atras.setBackground(new java.awt.Color(210, 180, 111));
        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-left-50.png"))); // NOI18N
        atras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        atras.setFocusPainted(false);

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

        buscarButton.setBackground(new java.awt.Color(210, 180, 111));
        buscarButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        buscarButton.setForeground(new java.awt.Color(51, 51, 51));
        buscarButton.setText("BUSCAR COMANDA");
        buscarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buscarButton.setFocusPainted(false);
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Menu Comanda");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(atras)
                        .addGap(263, 263, 263)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(verComandas, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GenerarComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(360, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GenerarComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(verComandas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(buscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void verComandasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verComandasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verComandasActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

        // Abre el enlace en el navegador predeterminado al hacer clic
        try {
            Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/fabyrossetto/"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jLabel3MouseClicked

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GenerarComanda;
    private javax.swing.JButton atras;
    private javax.swing.JPopupMenu buscar;
    private javax.swing.JButton buscarButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton verComandas;
    // End of variables declaration//GEN-END:variables

    private JFrame parentFrame;
    static Color color = new Color(210, 180, 111);

    // Constructor que toma un JFrame como referencia
    public OpcionesComanda(JFrame parentFrame) {
        this.parentFrame = parentFrame;  // Mantiene una referencia al JFrame principal
        initComponents();
        setupActionListeners();
        setupEscapeKeyAction();
        setupPopupMenu();

    }

    // Inicialización de los ActionListeners
    private void setupActionListeners() {
        GenerarComanda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generarComanda();
            }
        });
     
        verComandas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TodasLasComandas();
            }
        });
        atras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                volver();
            }
        });
    }

    private void setupEscapeKeyAction() {
        // Mapa de entradas y acciones para el panel actual
        this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "volverAtras");
        this.getActionMap().put("volverAtras", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                volver();
            }
        });
    }

    private void generarComanda() {
        GenerarComanda comanda = new GenerarComanda(parentFrame);
        parentFrame.getContentPane().removeAll();

        parentFrame.setResizable(false);  // Evitar el redimensionamiento de la ventana

//  fijar el tamaño preferido del panel para evitar que se ajuste
        comanda.setPreferredSize(new Dimension(1000, 600));
        parentFrame.add(comanda, BorderLayout.CENTER);
        parentFrame.pack();
        parentFrame.setLocationRelativeTo(null);  // Centra la ventana
        parentFrame.revalidate();
        parentFrame.repaint();
        System.out.println("Pantalla de crear comanda");
    }

    //  método para configurar el JPopupMenu
    private void setupPopupMenu() {

        // Crear opciones para el menú emergente
        JMenuItem buscarPorMesa = new JMenuItem("Buscar por Mesa");
        buscarPorMesa.setOpaque(true);
        buscarPorMesa.setBackground(color);
        buscarPorMesa.setForeground(Color.BLACK);
        JMenuItem buscarPorEstado = new JMenuItem("Buscar por Estado");
        buscarPorEstado.setOpaque(true);
        buscarPorEstado.setBackground(color);
        buscarPorEstado.setForeground(Color.BLACK);
        JMenuItem buscarPorMozo = new JMenuItem("Buscar por Mozo");
        buscarPorMozo.setOpaque(true);
        buscarPorMozo.setBackground(color);
        buscarPorMozo.setForeground(Color.BLACK);
        JMenuItem buscarPorFecha = new JMenuItem("Buscar por Fecha");
        buscarPorFecha.setOpaque(true);
        buscarPorFecha.setBackground(color);
        buscarPorFecha.setForeground(Color.BLACK);

        // Agregar los JMenuItem al JPopupMenu
        buscar.add(buscarPorMesa);
        buscar.add(buscarPorEstado);
        buscar.add(buscarPorMozo);
        buscar.add(buscarPorFecha);

        // Asignar ActionListeners a cada opción del menú
        buscarPorMesa.addActionListener(e -> BuscarPorMesa());
        buscarPorEstado.addActionListener(e -> BuscarPorEstado());
        buscarPorMozo.addActionListener(e -> BuscarPorMozo());
        buscarPorFecha.addActionListener(e -> BuscarPorFecha());

        // Mostrar el popup al hacer clic en el botón "Buscar"
        buscarButton.addActionListener(e -> buscar.show(buscarButton, buscarButton.getWidth() / 2, buscarButton.getHeight() / 2));

    }

    public void BuscarPorMesa() {
    
    BuscarComandaPorMesa mesa = new BuscarComandaPorMesa(parentFrame);

    // Configura el tamaño del JFrame y sus componentes
    parentFrame.getContentPane().removeAll();  // Limpia el contenido actual
    parentFrame.setResizable(false);          // Evita que la ventana sea redimensionable

    // Configuración explícita del tamaño
    mesa.setPreferredSize(new Dimension(1000, 600)); // Tamaño preferido del panel
    parentFrame.add(mesa, BorderLayout.CENTER);     // Agrega el panel al JFrame

   
    parentFrame.setSize(1000, 600);
    parentFrame.setLocationRelativeTo(null);        // Centra la ventana en la pantalla
    parentFrame.revalidate();                       // Actualiza el contenedor
    parentFrame.repaint();                          // Redibuja el contenedor

    System.out.println("Pantalla de buscar comanda por mesa");
}


    public void BuscarPorEstado() {
        BuscarComandaPorEstado estado = new BuscarComandaPorEstado(parentFrame);
        parentFrame.getContentPane().removeAll();
        parentFrame.setResizable(false);  // Evitar el redimensionamiento de la ventana

//  fijar el tamaño preferido del panel para evitar que se ajuste
        estado.setPreferredSize(new Dimension(500, 400));
        parentFrame.add(estado, BorderLayout.CENTER);
        
        parentFrame.setSize(1000, 600);
        parentFrame.setLocationRelativeTo(null);
        parentFrame.revalidate();
        parentFrame.repaint();
        System.out.println("Pantalla de buscar por estado");
    }

    public void BuscarPorFecha() {
        ListarComandasPorFecha fecha = new ListarComandasPorFecha(parentFrame);
        parentFrame.getContentPane().removeAll();
        parentFrame.setResizable(false);  // Evitar el redimensionamiento de la ventana

//  fijar el tamaño preferido del panel para evitar que se ajuste
        fecha.setPreferredSize(new Dimension(1000, 600));
        parentFrame.add(fecha, BorderLayout.CENTER);
        parentFrame.setSize(1000, 600);
        parentFrame.setLocationRelativeTo(null);
        parentFrame.revalidate();
        parentFrame.repaint();
        System.out.println("Pantalla buscar por fecha");
    }

    public void BuscarPorMozo() {
        BuscarComandaPorMozo mozo = new BuscarComandaPorMozo(parentFrame);
        parentFrame.getContentPane().removeAll();
        parentFrame.setResizable(false);  // Evitar el redimensionamiento de la ventana

//  fijar el tamaño preferido del panel para evitar que se ajuste
        mozo.setPreferredSize(new Dimension(1000, 600));
        parentFrame.add(mozo, BorderLayout.CENTER);
       parentFrame.setSize(1000, 600);
        parentFrame.setLocationRelativeTo(null);
        parentFrame.revalidate();
        parentFrame.repaint();
        System.out.println("Pantalla de buscar por mozo");
    }

    public void TodasLasComandas() {
        ListarTodasLasComandas todas = new ListarTodasLasComandas(parentFrame);
        parentFrame.getContentPane().removeAll();
        parentFrame.setResizable(false);  // Evitar el redimensionamiento de la ventana

//  fijar el tamaño preferido del panel para evitar que se ajuste
        todas.setPreferredSize(new Dimension(1000, 600));
        parentFrame.add(todas, BorderLayout.CENTER);
        parentFrame.pack();
        parentFrame.setLocationRelativeTo(null);
        parentFrame.revalidate();
        parentFrame.repaint();
        System.out.println("Pantalla de listar todas las comandas");
    }

    public void volver() {
        Principal volver = new Principal(parentFrame);
        parentFrame.getContentPane().removeAll();  // Elimina el contenido actual del JFrame
        parentFrame.setResizable(false);  // Evitar el redimensionamiento de la ventana
        
//  fijar el tamaño preferido del panel para evitar que se ajuste
        volver.setPreferredSize(new Dimension(1000, 600));
        parentFrame.add(volver, BorderLayout.CENTER);
        parentFrame.pack();
        parentFrame.setLocationRelativeTo(null); // Esto lo centra en la pantalla
        parentFrame.getContentPane().revalidate();  // Revalida el JFrame para actualizar la UI
        parentFrame.getContentPane().repaint();     // Repinta el JFrame para asegurarse de que se vea correctamente
        System.out.println("atras");
    }
}
