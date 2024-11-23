/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import java.net.HttpURLConnection;
import java.net.URI;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;

import org.json.JSONObject;

/**
 *
 * @author Faby
 */
public class BuscarComandaPorMozo extends javax.swing.JPanel {

    private JFrame parentFrame;
    private DefaultTableModel tabla;
    
    public BuscarComandaPorMozo(JFrame parentFrame) {
         this.parentFrame = parentFrame;
        initComponents(); 
        setupBuscarButton(); 
        
        // Configurar la tabla solo una vez
        tabla = new DefaultTableModel(new Object[]{"ID", "Pedido", "Mesa", "Mozo", "Estado", "Precio Final", "Comentario", "Fecha Creación"}, 0);
        JTable table = new JTable(tabla);
        JScrollPane scrollPane = new JScrollPane(table);
        this.add(scrollPane);
        
        // Configurar InputMap y ActionMap para Enter
        setupEnterKeyAction();
        setupEscapeKeyAction();
    }
    
 private void setupBuscarButton() {
      
        Buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarComandasPorMozo();
            }
        });
        atras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                atras();
            }
        });
        
    }
 
  private void setupEnterKeyAction() {
        // Mapa de entradas y acciones para el panel actual
        this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "buscarComandas");
        this.getActionMap().put("buscarComandas", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarComandasPorMozo();
            }
        });
  }
  private void setupEscapeKeyAction() {
    // Mapa de entradas y acciones para el panel actual
    this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "volverAtras");
    this.getActionMap().put("volverAtras", new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            atras();
        }
    });
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        atras = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        Camarero = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(97, 97, 97));
        setFocusCycleRoot(true);

        jLabel1.setBackground(new java.awt.Color(97, 97, 97));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingrese el nombre del camarer@");

        atras.setBackground(new java.awt.Color(218, 180, 111));
        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-left-50.png"))); // NOI18N
        atras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Buscar.setBackground(new java.awt.Color(210, 180, 111));
        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-buscar-32.png"))); // NOI18N
        Buscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Camarero.setBackground(new java.awt.Color(97, 97, 97));
        Camarero.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Camarero.setForeground(new java.awt.Color(255, 255, 255));
        Camarero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TAMARA", "MIRIAM", "EZEQUIEL", "CAMILA", "MANUELA", "GASTON", "LILI", "OTRO" }));
        Camarero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(atras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Buscar)
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(Camarero, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(Camarero, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JComboBox<String> Camarero;
    private javax.swing.JButton atras;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
 private void buscarComandasPorMozo() {
        String camareroString = (String) Camarero.getSelectedItem();

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("http://localhost:8080/comandas/mozo?mozo=" + camareroString))
                    .header("Accept", "application/json")
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == HttpURLConnection.HTTP_OK) {
                JSONArray contentArray = new JSONArray(response.body());

                if (contentArray.length() > 0) {
                    // Construye un mensaje con la información de todas las comandas encontradas
                    StringBuilder mensaje = new StringBuilder("Las comandas de  " + camareroString + ":\n\n");
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

                    for (int i = 0; i < contentArray.length(); i++) {
                        JSONObject comanda = contentArray.getJSONObject(i);

                        // Parseamos y formateamos la fecha de creación
                        LocalDateTime fechaCreacion = LocalDateTime.parse(comanda.getString("fechaCreacion"));
                        String fechaFormateada = fechaCreacion.format(formatter);

                        mensaje.append("ID: ").append(comanda.getLong("id")).append("\n")
                                .append("Pedido: ").append(comanda.getString("pedido")).append("\n")
                                .append("Mesa: ").append(comanda.getInt("mesa")).append("\n")
                                .append("Mozo: ").append(comanda.getString("mozo")).append("\n")
                                .append("Estado: ").append(comanda.getString("estado")).append("\n")
                                .append("Precio Final: $").append(comanda.getDouble("precioFinal")).append("\n")
                                .append("Comentario: ").append(comanda.optString("comentario", "")).append("\n")
                                .append("Fecha Creación: ").append(fechaFormateada).append("\n\n");
                    }

                    // Muestra el mensaje en un JOptionPane
                    mostrarMensaje(mensaje.toString(), "Comandas", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    mostrarMensaje("No se encontraron comandas para " + camareroString, "Información", JOptionPane.INFORMATION_MESSAGE);
                }

            } else {
                mostrarMensaje("Error al cargar comandas: " + response.statusCode(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            mostrarMensaje("Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void mostrarMensaje(String mensaje, String titulo, int messageType) {
        UIManager.put("OptionPane.background", new Color(210, 180, 111));
        UIManager.put("Panel.background", new Color(97, 97, 97));
        UIManager.put("OptionPane.messageForeground", new Color(210, 180, 111));
        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 14));
        JOptionPane.showMessageDialog(parentFrame, mensaje, titulo, messageType);
    }

    // Método para volver a la ventana anterior
    private void atras() {
        OpcionesComanda volver = new OpcionesComanda(parentFrame);
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
