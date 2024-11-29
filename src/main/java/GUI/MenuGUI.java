/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import GUI.ControlDeGastos.Opciones;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.net.URI;
import java.util.ArrayList;
import javax.swing.JComboBox;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Faby
 */
public class MenuGUI extends javax.swing.JPanel {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        empanadas = new javax.swing.JLabel();
        Pizzas = new javax.swing.JComboBox<>();
        pizzas1 = new javax.swing.JLabel();
        Empanadas = new javax.swing.JComboBox<>();
        SuperEmpanadas = new javax.swing.JComboBox<>();
        EmpanadasEspeciales = new javax.swing.JComboBox<>();
        Salsas = new javax.swing.JComboBox<>();
        Faina = new javax.swing.JComboBox<>();
        Milanesas = new javax.swing.JComboBox<>();
        Guarniciones = new javax.swing.JComboBox<>();
        Picoteo = new javax.swing.JComboBox<>();
        Sandwiches = new javax.swing.JComboBox<>();
        niños = new javax.swing.JComboBox<>();
        cantidad = new javax.swing.JComboBox<>();
        Pastas = new javax.swing.JComboBox<>();
        Licuados = new javax.swing.JComboBox<>();
        Postres = new javax.swing.JComboBox<>();
        sinTacc = new javax.swing.JComboBox<>();
        pastasText = new javax.swing.JLabel();
        salsasText = new javax.swing.JLabel();
        GuarniText = new javax.swing.JLabel();
        SandwichText = new javax.swing.JLabel();
        licuadosText = new javax.swing.JLabel();
        postresText = new javax.swing.JLabel();
        PicoteoText = new javax.swing.JLabel();
        InfantilText = new javax.swing.JLabel();
        bebidas = new javax.swing.JLabel();
        cantidadText = new javax.swing.JLabel();
        Mila = new javax.swing.JLabel();
        Mila11 = new javax.swing.JLabel();
        Cervezas = new javax.swing.JComboBox<>();
        Gaseosas = new javax.swing.JComboBox<>();
        Ok = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(97, 97, 97));
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1000, 600));

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

        empanadas.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        empanadas.setForeground(new java.awt.Color(255, 255, 255));
        empanadas.setText("Empanadas");

        Pizzas.setBackground(new java.awt.Color(97, 97, 97));
        Pizzas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Pizzas.setForeground(new java.awt.Color(255, 255, 255));
        Pizzas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Muzzarella", "Napolitana", "Napolitana Especial", "Jamon", "Jamon Especial", "Fugazza", "Fugazza especial", "Fugazzetta", "Palmitos", "Calabresa", "Primavera", "Panceta", "Jamon Crudo", "Jamon Crudo Especial", "Anana", "Anchoas", "Romana", "Ajo al oleo", "Camarones", "The Eluneys", "Espinaca", "Champignon", "Roquefort", "Provolone", "Provolone Especial", "Provolone Ahumado", "Albahaca", "Albahaca Especial", "Provenzal", "4 Quesos", "De cancha", "Doble Muzza", "Berenjenas", "Atún" }));
        Pizzas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        pizzas1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pizzas1.setForeground(new java.awt.Color(255, 255, 255));
        pizzas1.setText("Pizzas");

        Empanadas.setBackground(new java.awt.Color(97, 97, 97));
        Empanadas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Empanadas.setForeground(new java.awt.Color(255, 255, 255));
        Empanadas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JyQ", "Cebolla", "Carne", "Pollo", "Espinada", "Albahaca", "Roquefort", "Humita" }));
        Empanadas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        SuperEmpanadas.setBackground(new java.awt.Color(97, 97, 97));
        SuperEmpanadas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        SuperEmpanadas.setForeground(new java.awt.Color(255, 255, 255));
        SuperEmpanadas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S. Morron", "S. Humita", "S. Espinaca", "S. Albahaca", "S. Panceta", "S. Anana", "S. JYQ" }));
        SuperEmpanadas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        EmpanadasEspeciales.setBackground(new java.awt.Color(97, 97, 97));
        EmpanadasEspeciales.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        EmpanadasEspeciales.setForeground(new java.awt.Color(255, 255, 255));
        EmpanadasEspeciales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carne Cortada a Cuchillo", "Arabes", "Cubana", "Anana", "Judia", "Calabresa" }));
        EmpanadasEspeciales.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        Salsas.setBackground(new java.awt.Color(97, 97, 97));
        Salsas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Salsas.setForeground(new java.awt.Color(255, 255, 255));
        Salsas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Crema", "Salsa rosa", "Salsa Fileto", "Salsa Blanca", "Salsa Estofado", "Salsa Bolognesa" }));
        Salsas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        Faina.setBackground(new java.awt.Color(97, 97, 97));
        Faina.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Faina.setForeground(new java.awt.Color(255, 255, 255));
        Faina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Faina", "Faina con muzzarella y jamon o cebolla" }));
        Faina.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        Milanesas.setBackground(new java.awt.Color(97, 97, 97));
        Milanesas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Milanesas.setForeground(new java.awt.Color(255, 255, 255));
        Milanesas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "De Carne", "De Pollo", "Napolitana", "A caballo" }));
        Milanesas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        Guarniciones.setBackground(new java.awt.Color(97, 97, 97));
        Guarniciones.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Guarniciones.setForeground(new java.awt.Color(255, 255, 255));
        Guarniciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pure de Papa", "Pure de Calabaza", "Papas Fritas", "E. Lechuga, Pollo,Tomate y Huevo", "E. Choclo, Palmitos, Jamon, y Muzzarella", "E. Tomate, Lechuga, Choclo, Atún y Huevo", "E. Rucula, Parmesano, Cherry y Champignon", "E.Cherry, Lechuga, Palmitos ,Aceitunas y Albahaca" }));
        Guarniciones.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        Picoteo.setBackground(new java.awt.Color(97, 97, 97));
        Picoteo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Picoteo.setForeground(new java.awt.Color(255, 255, 255));
        Picoteo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rabas", "Nuggets de Pollo", "Papas fritas con verdeo", "Papas fritas con cheddar", "Papas fritas a la provenzal" }));
        Picoteo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        Sandwiches.setBackground(new java.awt.Color(97, 97, 97));
        Sandwiches.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Sandwiches.setForeground(new java.awt.Color(255, 255, 255));
        Sandwiches.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "De milanesa o pollo", "Completo", "Adicional" }));
        Sandwiches.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        niños.setBackground(new java.awt.Color(97, 97, 97));
        niños.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        niños.setForeground(new java.awt.Color(255, 255, 255));
        niños.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Salchichas", "Patitas de pollo", "Ñoquis con salsa rosa o fileto", "Tallarines con salsa rosa o fileto" }));
        niños.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        cantidad.setBackground(new java.awt.Color(97, 97, 97));
        cantidad.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cantidad.setForeground(new java.awt.Color(255, 255, 255));
        cantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));
        cantidad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        Pastas.setBackground(new java.awt.Color(97, 97, 97));
        Pastas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Pastas.setForeground(new java.awt.Color(255, 255, 255));
        Pastas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ñoquis", "Tallarines", "Tallarines de Espinaca", "Sorrentinos", "Ravioles de ricota,verdura o calabaza" }));
        Pastas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        Pastas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PastasActionPerformed(evt);
            }
        });

        Licuados.setBackground(new java.awt.Color(97, 97, 97));
        Licuados.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Licuados.setForeground(new java.awt.Color(255, 255, 255));
        Licuados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Banana", "Frutilla", "Durazno", "Anana", "Naranja" }));
        Licuados.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        Postres.setBackground(new java.awt.Color(97, 97, 97));
        Postres.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Postres.setForeground(new java.awt.Color(255, 255, 255));
        Postres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Flan casero", "Bombon helado", "Helado Almendrado", "Mousse de Chocolate", "Adicional Crema o DDL" }));
        Postres.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        sinTacc.setBackground(new java.awt.Color(97, 97, 97));
        sinTacc.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        sinTacc.setForeground(new java.awt.Color(255, 255, 255));
        sinTacc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "P. Muzzarella", "P. Jamón", "P. Napolitana", "P. Fugazzetta", "P. Roquefort", "P. Provolone", "E. JYQ", "E. Carne", "E. Pollo", "E. Albahaca", "E. Cebolla", "Milanesa de Carne", "Faina", "Faina con muzzarella y cebolla", "Fritas", "Calzone", "Bastones de Muzzarella", "Cerveza IPA", "Cerveza APA", "Cerveza KÖLSH" }));
        sinTacc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        pastasText.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pastasText.setForeground(new java.awt.Color(255, 255, 255));
        pastasText.setText("Pastas");

        salsasText.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        salsasText.setForeground(new java.awt.Color(255, 255, 255));
        salsasText.setText("Salsas");

        GuarniText.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        GuarniText.setForeground(new java.awt.Color(255, 255, 255));
        GuarniText.setText("Guarniciones");

        SandwichText.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        SandwichText.setForeground(new java.awt.Color(255, 255, 255));
        SandwichText.setText("Sandwiches");

        licuadosText.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        licuadosText.setForeground(new java.awt.Color(255, 255, 255));
        licuadosText.setText("Licuados");

        postresText.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        postresText.setForeground(new java.awt.Color(255, 255, 255));
        postresText.setText("Postres");

        PicoteoText.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        PicoteoText.setForeground(new java.awt.Color(255, 255, 255));
        PicoteoText.setText("Picoteo");

        InfantilText.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        InfantilText.setForeground(new java.awt.Color(255, 255, 255));
        InfantilText.setText("Menu Infantil");

        bebidas.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bebidas.setForeground(new java.awt.Color(255, 255, 255));
        bebidas.setText("Bebidas");

        cantidadText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cantidadText.setForeground(new java.awt.Color(255, 255, 255));
        cantidadText.setText("CANTIDAD");

        Mila.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Mila.setForeground(new java.awt.Color(255, 255, 255));
        Mila.setText("Milanesas");

        Mila11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Mila11.setForeground(new java.awt.Color(255, 255, 255));
        Mila11.setText("MENU SIN TACC");

        Cervezas.setBackground(new java.awt.Color(97, 97, 97));
        Cervezas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Cervezas.setForeground(new java.awt.Color(255, 255, 255));
        Cervezas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Andes rubia LATA", "Andes roja LATA", "Andes IPA LATA", "Stella Artois LATA", "Stella noire LATA", "Stella artois LITRO", "Stella noire LITRO", "Andes LITRO", "Brahama LITRO", "Patagonia 710" }));
        Cervezas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        Gaseosas.setBackground(new java.awt.Color(97, 97, 97));
        Gaseosas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Gaseosas.setForeground(new java.awt.Color(255, 255, 255));
        Gaseosas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gaseosas", "Gaseosas 1,5 lts", "Agua mineral", "Agua Saborizada", "Agua Saborizada 1,5 lts" }));
        Gaseosas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        Ok.setBackground(new java.awt.Color(67, 160, 71));
        Ok.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Ok.setForeground(new java.awt.Color(255, 255, 255));
        Ok.setText("GUARDAR");
        Ok.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        Cancelar.setBackground(new java.awt.Color(229, 57, 53));
        Cancelar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        Cancelar.setText("CANCELAR");
        Cancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        atras.setBackground(new java.awt.Color(210, 180, 111));
        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-left-50.png"))); // NOI18N
        atras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        atras.setFocusPainted(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Elegí el pedido...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(383, 383, 383))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(pastasText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(173, 173, 173)
                                                .addComponent(SuperEmpanadas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(cantidadText, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(150, 150, 150)
                                                .addComponent(salsasText, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(pizzas1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(180, 180, 180))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(Pizzas, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                                                            .addComponent(Faina, 0, 0, Short.MAX_VALUE))
                                                        .addGap(105, 105, 105)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(GuarniText)
                                                        .addGap(0, 0, Short.MAX_VALUE))
                                                    .addComponent(Guarniciones, 0, 1, Short.MAX_VALUE)
                                                    .addComponent(Salsas, 0, 129, Short.MAX_VALUE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Mila)
                                                    .addComponent(Milanesas, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Pastas, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(105, 105, 105)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(empanadas)
                                                        .addGap(0, 0, Short.MAX_VALUE))
                                                    .addComponent(Empanadas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(EmpanadasEspeciales, 0, 1, Short.MAX_VALUE))))
                                        .addGap(73, 73, 73)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(InfantilText, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(SandwichText, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Sandwiches, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(PicoteoText, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Picoteo, 0, 1, Short.MAX_VALUE)
                                            .addComponent(niños, 0, 0, Short.MAX_VALUE)
                                            .addComponent(Mila11, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sinTacc, 0, 1, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(74, 74, 74)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(bebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(licuadosText, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Cervezas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Gaseosas, 0, 172, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(postresText, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Postres, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Licuados, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(atras)
                                .addGap(234, 234, 234)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(88, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salsasText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SandwichText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salsas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sandwiches, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gaseosas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Cervezas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(licuadosText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Licuados, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pizzas1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Pizzas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Faina, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Mila, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(empanadas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Milanesas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Empanadas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(GuarniText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PicoteoText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Guarniciones, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Picoteo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(InfantilText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(niños, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pastasText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SuperEmpanadas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Mila11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(postresText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Pastas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmpanadasEspeciales, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sinTacc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Postres, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(atras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
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

    private void PastasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PastasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PastasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JComboBox<String> Cervezas;
    private javax.swing.JComboBox<String> Empanadas;
    private javax.swing.JComboBox<String> EmpanadasEspeciales;
    private javax.swing.JComboBox<String> Faina;
    private javax.swing.JComboBox<String> Gaseosas;
    private javax.swing.JLabel GuarniText;
    private javax.swing.JComboBox<String> Guarniciones;
    private javax.swing.JLabel InfantilText;
    private javax.swing.JComboBox<String> Licuados;
    private javax.swing.JLabel Mila;
    private javax.swing.JLabel Mila11;
    private javax.swing.JComboBox<String> Milanesas;
    private javax.swing.JButton Ok;
    private javax.swing.JComboBox<String> Pastas;
    private javax.swing.JComboBox<String> Picoteo;
    private javax.swing.JLabel PicoteoText;
    private javax.swing.JComboBox<String> Pizzas;
    private javax.swing.JComboBox<String> Postres;
    private javax.swing.JComboBox<String> Salsas;
    private javax.swing.JLabel SandwichText;
    private javax.swing.JComboBox<String> Sandwiches;
    private javax.swing.JComboBox<String> SuperEmpanadas;
    private javax.swing.JButton atras;
    private javax.swing.JLabel bebidas;
    private javax.swing.JComboBox<String> cantidad;
    private javax.swing.JLabel cantidadText;
    private javax.swing.JLabel empanadas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel licuadosText;
    private javax.swing.JComboBox<String> niños;
    private javax.swing.JLabel pastasText;
    private javax.swing.JLabel pizzas1;
    private javax.swing.JLabel postresText;
    private javax.swing.JLabel salsasText;
    private javax.swing.JComboBox<String> sinTacc;
    // End of variables declaration//GEN-END:variables
 private JFrame parentFrame;
    private GenerarComanda generarComanda;
    // Lista para almacenar los pedidos
    private ArrayList<String> pedido;

    public MenuGUI(JFrame parentFrame, GenerarComanda generarComanda) {
        this.parentFrame = parentFrame;
        this.generarComanda = generarComanda;
        initComponents();
        // Inicializar lista de pedidos
        pedido = new ArrayList<>();

        // Agregar listeners
        addListeners();

    }

    private void addListeners() {

        Pizzas.addActionListener(e -> agregarItem("pizza", Pizzas));

        Faina.addActionListener(e -> agregarItem("faina", Faina));

        Milanesas.addActionListener(e -> agregarItem("milanesa", Milanesas));

        Pastas.addActionListener(e -> agregarItem("pasta", Pastas));

        Salsas.addActionListener(e -> agregarItem("salsa", Salsas));

        Guarniciones.addActionListener(e -> agregarItem("guarniciones", Guarniciones));

        Empanadas.addActionListener(e -> agregarItem("empanada", Empanadas));
        EmpanadasEspeciales.addActionListener(e -> agregarItem("empanada", EmpanadasEspeciales));
        SuperEmpanadas.addActionListener(e -> agregarItem("empanada", SuperEmpanadas));

        Sandwiches.addActionListener(e -> agregarItem("sandwich", Sandwiches));
        Picoteo.addActionListener(e -> agregarItem("picoteo", Picoteo));
        niños.addActionListener(e -> agregarItem("menu infantil", niños));

        Gaseosas.addActionListener(e -> agregarItem("gaseosa", Gaseosas));
        Cervezas.addActionListener(e -> agregarItem("cerveza", Cervezas));
        Licuados.addActionListener(e -> agregarItem("licuado", Licuados));

        Postres.addActionListener(e -> agregarItem("postres", Postres));
        sinTacc.addActionListener(e -> agregarItem("menu sin tacc ", sinTacc));

        // Listener para el botón Ok 
        Ok.addActionListener(e -> guardarPedido());

        // Listener para el botón cancelar
        Cancelar.addActionListener(e -> volverAtras());
    }

    private void agregarItem(String categoria, JComboBox<String> comboBox) {
        // Obtener cantidad seleccionada
        String cantidadSeleccionada = (String) cantidad.getSelectedItem();

        // Obtener el ítem seleccionado
        String itemSeleccionado = (String) comboBox.getSelectedItem();

        // Asegurarse de que ambos valores sean válidos
        if (cantidadSeleccionada != null && itemSeleccionado != null) {
            // Construir el texto para este ítem
            String textoItem =  "categoria: " + categoria + " : " + cantidadSeleccionada + " " +  itemSeleccionado;

            // Agregarlo a la lista de pedidos
            pedido.add(textoItem);

            // Actualizar el área de texto
            actualizarTextoPedido();
        }
    }

    private void actualizarTextoPedido() {
        // Usar StringBuilder para concatenar todos los elementos del pedido
        StringBuilder pedidoBuilder = new StringBuilder();

        for (String item : pedido) {
            pedidoBuilder.append(item).append("\n");
        }

    }

    private void guardarPedido() {
        StringBuilder pedidoFinal = new StringBuilder();

        for (String item : pedido) {
            pedidoFinal.append(item).append("; ");
        }

        if (pedidoFinal.length() > 0) {
            pedidoFinal.setLength(pedidoFinal.length() - 2);
        }
        
        // Mostrar mensaje al usuario con el estilo personalizado
    if (pedidoFinal.length() > 0) {
        mostrarMensaje("Su pedido fue: " + pedidoFinal, "Pedido Confirmado", JOptionPane.INFORMATION_MESSAGE);
    } else {
        mostrarMensaje("No se ha seleccionado ningún pedido.", "Error", JOptionPane.ERROR_MESSAGE);
    }

        // Pasar el pedido generado a GenerarComanda
        GenerarComanda generarComanda = new GenerarComanda(parentFrame, pedidoFinal.toString());
        parentFrame.getContentPane().removeAll();
        generarComanda.setPreferredSize(new Dimension(1000, 600));
        parentFrame.add(generarComanda, BorderLayout.CENTER);
        parentFrame.pack();
        parentFrame.setLocationRelativeTo(null);
        parentFrame.getContentPane().revalidate();
        parentFrame.getContentPane().repaint();
    }


private void volverAtras() {
        GenerarComanda gc= new GenerarComanda(parentFrame);  // Pasamos el objeto GenerarComanda al constructor
        parentFrame.getContentPane().removeAll();
        gc.setPreferredSize(new Dimension(1000, 600));
        parentFrame.add(gc, BorderLayout.CENTER);
        parentFrame.pack();
        parentFrame.setLocationRelativeTo(null);
        parentFrame.getContentPane().revalidate();
        parentFrame.getContentPane().repaint();
    }

private void mostrarMensaje(String mensaje, String titulo, int messageType) {
    // Personalizar el estilo del JOptionPane
    UIManager.put("OptionPane.background", new Color(210, 180, 111));
    UIManager.put("Panel.background", new Color(97, 97, 97));
    UIManager.put("OptionPane.messageForeground", new Color(210, 180, 111));
    UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 14));

    // Mostrar el mensaje
    JOptionPane.showMessageDialog(parentFrame, mensaje, titulo, messageType);

   
}

}
