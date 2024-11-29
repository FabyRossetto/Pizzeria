/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.mycompany.pizzeria.comandas.Comanda;
import com.mycompany.pizzeria.comandas.Estado;
import com.mycompany.pizzeria.comandas.Mozo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

/**
 *
 * @author Faby
 */
public class EditarComanda extends javax.swing.JPanel {

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Ok = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        EstadoComboBox = new javax.swing.JComboBox<>();
        Mesa = new javax.swing.JTextField();
        Precio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Comentario = new javax.swing.JTextArea();
        atras = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Camarero = new javax.swing.JComboBox<>();
        menu = new javax.swing.JButton();

        setBackground(new java.awt.Color(97, 97, 97));
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        jLabel1.setBackground(new java.awt.Color(97, 97, 97));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Mesa");

        jLabel3.setBackground(new java.awt.Color(97, 97, 97));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Pedido");

        jLabel4.setBackground(new java.awt.Color(97, 97, 97));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Editar una comanda");

        Ok.setBackground(new java.awt.Color(67, 160, 71));
        Ok.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Ok.setForeground(new java.awt.Color(255, 255, 255));
        Ok.setText("EDITAR");
        Ok.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        Cancelar.setBackground(new java.awt.Color(229, 57, 53));
        Cancelar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        Cancelar.setText("CANCELAR");
        Cancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel5.setBackground(new java.awt.Color(97, 97, 97));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Estado");

        jLabel6.setBackground(new java.awt.Color(97, 97, 97));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Monto");

        jLabel7.setBackground(new java.awt.Color(97, 97, 97));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Comentario");

        jLabel8.setBackground(new java.awt.Color(97, 97, 97));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Camarer@");

        EstadoComboBox.setBackground(new java.awt.Color(97, 97, 97));
        EstadoComboBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        EstadoComboBox.setForeground(new java.awt.Color(255, 255, 255));
        EstadoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PEDIDA", "EN_PROCESO", "PREPARADA", "ENTREGADA", "FINALIZADA", "ANULADA" }));
        EstadoComboBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        Comentario.setColumns(20);
        Comentario.setRows(5);
        jScrollPane1.setViewportView(Comentario);

        atras.setBackground(new java.awt.Color(210, 180, 111));
        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-left-50.png"))); // NOI18N
        atras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setBackground(new java.awt.Color(57, 57, 57));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("<html><a href='' style='color: white;'>Hecho por: Faby Rossetto</a></html>");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        Camarero.setBackground(new java.awt.Color(97, 97, 97));
        Camarero.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Camarero.setForeground(new java.awt.Color(255, 255, 255));
        Camarero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TAMARA", "MIRIAM", "EZEQUIEL", "CAMILA", "MANUELA", "GASTON", "LILI", "OTRO" }));
        Camarero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        menu.setBackground(new java.awt.Color(210, 180, 111));
        menu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        menu.setForeground(new java.awt.Color(51, 51, 51));
        menu.setText("MENU");
        menu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(361, 361, 361)
                                        .addComponent(EstadoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(238, 238, 238)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(jSeparator5)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Mesa, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Camarero, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(140, 140, 140))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(atras)
                                .addGap(160, 160, 160)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(344, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EstadoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Mesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Camarero, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)))
                .addGap(42, 42, 42)
                .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked

        // Abre el enlace en el navegador predeterminado al hacer clic
        try {
            Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/fabyrossetto/"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel10MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Camarero;
    private javax.swing.JButton Cancelar;
    private javax.swing.JTextArea Comentario;
    private javax.swing.JComboBox<String> EstadoComboBox;
    private javax.swing.JTextField Mesa;
    private javax.swing.JButton Ok;
    private javax.swing.JTextField Precio;
    private javax.swing.JButton atras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JButton menu;
    // End of variables declaration//GEN-END:variables
 private JFrame parentFrame;
    private String pedido;
    private Comanda comanda;
   

    public EditarComanda(JFrame parentFrame) {
        this.parentFrame = parentFrame;
        initComponents();
        setupActionListeners();
        setupEnterKeyAction();
        setupEscapeKeyAction();
    }
public EditarComanda(JFrame parentFrame, Long idComanda, String pedido, Comanda comandaOriginal) {
    this.parentFrame = parentFrame;
    this.comanda = comandaOriginal;
    this.pedido = pedido;
    initComponents();
    setupActionListeners();
    setupEnterKeyAction();
    setupEscapeKeyAction();
}

public EditarComanda(JFrame parentFrame, Long idComanda, String pedido) throws Exception {
    this.parentFrame = parentFrame;
    this.comanda = obtenerComandaOriginal(idComanda); // Inicializa la comanda
    this.pedido = pedido;
   
    initComponents();
    setupActionListeners();
    setupEnterKeyAction();
    setupEscapeKeyAction();
}
    private void setupActionListeners() {
        Ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editarComanda(comanda);
            }
        });

        Cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                volverAtras();
            }
        });

        atras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                volverAtras();
            }
        });
        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    abrirMenu();
                } catch (Exception ex) {
                    Logger.getLogger(EditarComanda.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    private void abrirMenu() throws Exception {
        Comanda comandaAlMenu = this.obtenerComandaOriginal(comanda.getId()); // Método que inicializa la comanda
        MenuActualizarGUI menuactGUI = new MenuActualizarGUI(parentFrame, this, comandaAlMenu);
       
        parentFrame.getContentPane().removeAll();
        menuactGUI.setPreferredSize(new Dimension(1000, 600));
        parentFrame.add(menuactGUI, BorderLayout.CENTER);
        parentFrame.pack();
        parentFrame.setLocationRelativeTo(null);
        parentFrame.getContentPane().revalidate();
        parentFrame.getContentPane().repaint();
    }

    private void setupEnterKeyAction() {
        // Mapa de entradas y acciones para el panel actual
        this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "buscarComandas");
        this.getActionMap().put("editarComandas", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editarComanda(comanda);
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

   
    public void editarComanda(Comanda comanda) {
        try {
          
            String camarero = (String) Camarero.getSelectedItem();
            Mozo mozoEnum = (camarero == null || camarero.isEmpty()) ? comanda.getMozo() : Mozo.valueOf(camarero.toUpperCase());

            String comentario = Comentario.getText().isEmpty() ? comanda.getComentario() : Comentario.getText();

            double precio = Precio.getText().isEmpty() ? comanda.getPrecioFinal() : Double.parseDouble(Precio.getText());


            int mesa = Mesa.getText().isEmpty() ? comanda.getMesa() : Integer.parseInt(Mesa.getText());

            // Verificar el campo Estado
            String estado = (String) EstadoComboBox.getSelectedItem();
            Estado estadoEnum = (estado == null || estado.isEmpty()) ? comanda.getEstado() : Estado.valueOf(estado.toUpperCase());

            // Crear un objeto Comanda con los datos actualizados
            Comanda comandaActualizada = new Comanda(comanda.getId(), pedido, mesa, mozoEnum, estadoEnum, precio, comentario);
           
            // Enviar la comanda editada al servidor usando una solicitud HTTP PUT
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("http://localhost:8080/comandas/" + comanda.getId()))
                    .header("Content-Type", "application/json")
                    .PUT(HttpRequest.BodyPublishers.ofString(convertToJson(comandaActualizada))) // Serializar a JSON
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                mostrarMensaje("La comanda fue actualizada con exito ", "Exito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                mostrarMensaje("Error al actualizar la comanda " + response.body(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            mostrarMensaje("Error del servidor ", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

// Método para obtener la comanda original desde el servidor
    public Comanda obtenerComandaOriginal(Long id) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("http://localhost:8080/comandas/" + id))
                .header("Content-Type", "application/json")
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            return convertFromJson(response.body()); // Método que convierte el JSON en un objeto Comanda
        } else {
            throw new Exception("No se pudo obtener la comanda original");
        }
    }

    private Comanda convertFromJson(String json) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objectMapper.readValue(json, Comanda.class);
    }

// Método para convertir la comanda a JSON (igual que en el anterior)
    private String convertToJson(Comanda comanda) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        return objectMapper.writeValueAsString(comanda);
    }

    private void mostrarMensaje(String mensaje, String titulo, int messageType) {
        UIManager.put("OptionPane.background", new Color(210, 180, 111));
        UIManager.put("Panel.background", new Color(97, 97, 97));
        UIManager.put("OptionPane.messageForeground", new Color(210, 180, 111));
        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 14));
        JOptionPane.showMessageDialog(parentFrame, mensaje, titulo, messageType);
    }

// Método para volver a la ventana anterior
    private void volverAtras() {
        ListarTodasLasComandas listar = new ListarTodasLasComandas(parentFrame);
        parentFrame.getContentPane().removeAll();
        parentFrame.setResizable(false);  // Evitar el redimensionamiento de la ventana

//  fijar el tamaño preferido del panel para evitar que se ajuste
        listar.setPreferredSize(new Dimension(1000, 600));
        parentFrame.add(listar, BorderLayout.CENTER);
        parentFrame.pack();
        parentFrame.setLocationRelativeTo(null); // Esto lo centra en la pantalla

        parentFrame.getContentPane().revalidate();
        parentFrame.getContentPane().repaint();
    }

}
