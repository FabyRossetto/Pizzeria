/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Faby
 */
public class OpcionesComanda extends javax.swing.JPanel {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GenerarComanda = new javax.swing.JButton();
        BuscarPorEstado = new javax.swing.JButton();
        verComandas = new javax.swing.JButton();
        BuscarPorFecha = new javax.swing.JButton();
        BuscarComandaPorMesa = new javax.swing.JButton();
        BuscarPorMozo = new javax.swing.JButton();
        atras = new javax.swing.JButton();

        setBackground(new java.awt.Color(97, 97, 97));
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(1123, 755));

        GenerarComanda.setBackground(new java.awt.Color(210, 180, 111));
        GenerarComanda.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        GenerarComanda.setForeground(new java.awt.Color(255, 255, 255));
        GenerarComanda.setText("GENERAR COMANDA");
        GenerarComanda.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        GenerarComanda.setFocusPainted(false);

        BuscarPorEstado.setBackground(new java.awt.Color(210, 180, 111));
        BuscarPorEstado.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        BuscarPorEstado.setForeground(new java.awt.Color(255, 255, 255));
        BuscarPorEstado.setText("BUSCAR COMANDA POR ESTADO");
        BuscarPorEstado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        BuscarPorEstado.setFocusPainted(false);

        verComandas.setBackground(new java.awt.Color(210, 180, 111));
        verComandas.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        verComandas.setForeground(new java.awt.Color(255, 255, 255));
        verComandas.setText("VER TODAS LAS COMANDAS");
        verComandas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        verComandas.setFocusPainted(false);
        verComandas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verComandasActionPerformed(evt);
            }
        });

        BuscarPorFecha.setBackground(new java.awt.Color(210, 180, 111));
        BuscarPorFecha.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        BuscarPorFecha.setForeground(new java.awt.Color(255, 255, 255));
        BuscarPorFecha.setText("BUSCAR COMANDA POR FECHA");
        BuscarPorFecha.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        BuscarPorFecha.setFocusPainted(false);

        BuscarComandaPorMesa.setBackground(new java.awt.Color(210, 180, 111));
        BuscarComandaPorMesa.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        BuscarComandaPorMesa.setForeground(new java.awt.Color(255, 255, 255));
        BuscarComandaPorMesa.setText("BUSCAR COMANDA POR MESA");
        BuscarComandaPorMesa.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        BuscarComandaPorMesa.setFocusPainted(false);

        BuscarPorMozo.setBackground(new java.awt.Color(210, 180, 111));
        BuscarPorMozo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        BuscarPorMozo.setForeground(new java.awt.Color(255, 255, 255));
        BuscarPorMozo.setText("BUSCAR COMANDA POR MOZO");
        BuscarPorMozo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        BuscarPorMozo.setFocusPainted(false);

        atras.setBackground(new java.awt.Color(210, 180, 111));
        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-left-50.png"))); // NOI18N
        atras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        atras.setFocusPainted(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(verComandas, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BuscarPorMozo, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BuscarPorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(GenerarComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BuscarPorEstado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BuscarComandaPorMesa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(112, 112, 112))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(atras)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verComandas, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(BuscarComandaPorMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(BuscarPorEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(GenerarComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(BuscarPorMozo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(BuscarPorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void verComandasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verComandasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verComandasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarComandaPorMesa;
    private javax.swing.JButton BuscarPorEstado;
    private javax.swing.JButton BuscarPorFecha;
    private javax.swing.JButton BuscarPorMozo;
    private javax.swing.JButton GenerarComanda;
    private javax.swing.JButton atras;
    private javax.swing.JButton verComandas;
    // End of variables declaration//GEN-END:variables

    private JFrame parentFrame;

    // Constructor que toma un JFrame como referencia
    public OpcionesComanda(JFrame parentFrame) {
        this.parentFrame = parentFrame;  // Mantiene una referencia al JFrame principal
        initComponents();
        setupActionListeners();
    }

    // Inicialización de los ActionListeners
    private void setupActionListeners() {
        GenerarComanda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generarComanda();
            }
        });
        BuscarComandaPorMesa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BuscarPorMesa();
            }
        });
        BuscarPorEstado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BuscarPorEstado();
            }
        });
        BuscarPorFecha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BuscarPorFecha();
            }
        });
        BuscarPorMozo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BuscarPorMozo();
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

    private void generarComanda() {
        GenerarComanda comanda = new GenerarComanda(parentFrame);
        parentFrame.getContentPane().removeAll();
        parentFrame.getContentPane().add(comanda);

        parentFrame.setSize(1300, 800);  // Tamaño grande
        parentFrame.setLocationRelativeTo(null);  // Centra la ventana
        parentFrame.revalidate();
        parentFrame.repaint();
        System.out.println("Pantalla de crear comanda");
    }

    public void BuscarPorMesa() {
        BuscarComandaPorMesa mesa = new BuscarComandaPorMesa(parentFrame);
        parentFrame.getContentPane().removeAll();
        parentFrame.getContentPane().add(mesa);

        parentFrame.setSize(500, 400);  // Tamaño pequeño
        parentFrame.setLocationRelativeTo(null);
        parentFrame.revalidate();
        parentFrame.repaint();
        System.out.println("Pantalla de buscar comanda por mesa");
    }

    private void BuscarPorEstado() {
        BuscarComandaPorEstado estado = new BuscarComandaPorEstado(parentFrame);
        parentFrame.getContentPane().removeAll();
        parentFrame.getContentPane().add(estado);

        parentFrame.setSize(500, 400);
        parentFrame.setLocationRelativeTo(null);
        parentFrame.revalidate();
        parentFrame.repaint();
        System.out.println("Pantalla de buscar por estado");
    }

    private void BuscarPorFecha() {
        ListarComandasPorFecha fecha = new ListarComandasPorFecha(parentFrame);
        parentFrame.getContentPane().removeAll();
        parentFrame.getContentPane().add(fecha);

        parentFrame.setSize(500, 400);
        parentFrame.setLocationRelativeTo(null);
        parentFrame.revalidate();
        parentFrame.repaint();
        System.out.println("Pantalla buscar por fecha");
    }

    private void BuscarPorMozo() {
        BuscarComandaPorMozo mozo = new BuscarComandaPorMozo(parentFrame);
        parentFrame.getContentPane().removeAll();
        parentFrame.getContentPane().add(mozo);

        parentFrame.setSize(500, 400);
        parentFrame.setLocationRelativeTo(null);
        parentFrame.revalidate();
        parentFrame.repaint();
        System.out.println("Pantalla de buscar por mozo");
    }

    private void TodasLasComandas() {
        ListarTodasLasComandas todas = new ListarTodasLasComandas(parentFrame);
        parentFrame.getContentPane().removeAll();
        parentFrame.getContentPane().add(todas);

        parentFrame.setSize(1300, 800);
        parentFrame.setLocationRelativeTo(null);
        parentFrame.revalidate();
        parentFrame.repaint();
        System.out.println("Pantalla de listar todas las comandas");
    }

    private void volver() {
        Principal volver = new Principal(parentFrame);
        parentFrame.getContentPane().removeAll();  // Elimina el contenido actual del JFrame
        parentFrame.getContentPane().add(volver);  // Añade el nuevo JPanel (OpcionesComanda)
        parentFrame.getContentPane().revalidate();  // Revalida el JFrame para actualizar la UI
        parentFrame.getContentPane().repaint();     // Repinta el JFrame para asegurarse de que se vea correctamente
        System.out.println("atras");
    }
}
