  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import com.mycompany.pizzeria.comandas.Estado;
import static com.mycompany.pizzeria.comandas.Estado.ANULADA;
import static com.mycompany.pizzeria.comandas.Estado.ENTREGADA;
import static com.mycompany.pizzeria.comandas.Estado.EN_PROCESO;
import static com.mycompany.pizzeria.comandas.Estado.FINALIZADA;
import static com.mycompany.pizzeria.comandas.Estado.PEDIDA;
import static com.mycompany.pizzeria.comandas.Estado.PREPARADA;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Faby
 */
public class BuscarComandaPorEstado extends javax.swing.JPanel {

    private JFrame parentFrame;
     private DefaultTableModel tabla;
  

    public BuscarComandaPorEstado(JFrame parentFrame) {
        this.parentFrame = parentFrame;
        initComponents();
        inicializarRadioButtons();
        setupBuscarButton();
        
        // Configurar la tabla solo una vez
        tabla = new DefaultTableModel(new Object[]{"ID", "Pedido", "Mesa", "Mozo", "Estado", "Precio Final", "Comentario", "Fecha Creación"}, 0);
        JTable table = new JTable(tabla);
        JScrollPane scrollPane = new JScrollPane(table);
        this.add(scrollPane);
    }

    private void setupBuscarButton() {
        // Configuramos el listener para el botón "Buscar"
        Buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarComandasPorEstado();
            }
        });
        atras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                volverAtras();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        atras = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        pedida = new javax.swing.JRadioButton();
        en_proceso = new javax.swing.JRadioButton();
        preparada = new javax.swing.JRadioButton();
        entregada = new javax.swing.JRadioButton();
        finalizada = new javax.swing.JRadioButton();
        anulada = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(97, 97, 97));
        setFocusCycleRoot(true);
        setPreferredSize(new java.awt.Dimension(400, 300));

        jLabel1.setBackground(new java.awt.Color(97, 97, 97));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingrese el estado de la comanda");

        atras.setBackground(new java.awt.Color(218, 180, 111));
        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-left-50.png"))); // NOI18N
        atras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Buscar.setBackground(new java.awt.Color(210, 180, 111));
        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-buscar-32.png"))); // NOI18N
        Buscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        pedida.setBackground(new java.awt.Color(97, 97, 97));
        pedida.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        pedida.setForeground(new java.awt.Color(255, 255, 255));
        pedida.setText("PEDIDA");
        pedida.setBorder(null);
        pedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidaActionPerformed(evt);
            }
        });

        en_proceso.setBackground(new java.awt.Color(97, 97, 97));
        en_proceso.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        en_proceso.setForeground(new java.awt.Color(255, 255, 255));
        en_proceso.setText("EN PROCESO");
        en_proceso.setBorder(null);
        en_proceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                en_procesoActionPerformed(evt);
            }
        });

        preparada.setBackground(new java.awt.Color(97, 97, 97));
        preparada.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        preparada.setForeground(new java.awt.Color(255, 255, 255));
        preparada.setText("PREPARADA");
        preparada.setBorder(null);

        entregada.setBackground(new java.awt.Color(97, 97, 97));
        entregada.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        entregada.setForeground(new java.awt.Color(255, 255, 255));
        entregada.setText("ENTREGADA");
        entregada.setBorder(null);

        finalizada.setBackground(new java.awt.Color(97, 97, 97));
        finalizada.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        finalizada.setForeground(new java.awt.Color(255, 255, 255));
        finalizada.setText("FINALIZADA");
        finalizada.setBorder(null);

        anulada.setBackground(new java.awt.Color(97, 97, 97));
        anulada.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        anulada.setForeground(new java.awt.Color(255, 255, 255));
        anulada.setText("ANULADA");
        anulada.setBorder(null);
        anulada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anuladaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(anulada)
                    .addComponent(finalizada)
                    .addComponent(entregada)
                    .addComponent(preparada)
                    .addComponent(en_proceso)
                    .addComponent(pedida))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(atras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Buscar)
                .addGap(92, 92, 92))
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pedida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(en_proceso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(preparada)
                        .addGap(18, 18, 18)
                        .addComponent(entregada)
                        .addGap(18, 18, 18)
                        .addComponent(finalizada)
                        .addGap(18, 18, 18)
                        .addComponent(anulada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void en_procesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_en_procesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_en_procesoActionPerformed

    private void anuladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anuladaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anuladaActionPerformed

    private void pedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pedidaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JRadioButton anulada;
    private javax.swing.JButton atras;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton en_proceso;
    private javax.swing.JRadioButton entregada;
    private javax.swing.JRadioButton finalizada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton pedida;
    private javax.swing.JRadioButton preparada;
    // End of variables declaration//GEN-END:variables
private javax.swing.JPanel panel;

    private void inicializarRadioButtons() {
        buttonGroup1 = new ButtonGroup();
        
        buttonGroup1.add(anulada);
        buttonGroup1.add(entregada);
        buttonGroup1.add(en_proceso);
        buttonGroup1.add(finalizada);
        buttonGroup1.add(pedida);
        buttonGroup1.add(preparada);

       
    }

// Método para obtener el estado seleccionado y buscar comandas
    private void buscarComandasPorEstado() {
        

        Estado estadoSeleccionado = null;
        if (anulada.isSelected()) {
            estadoSeleccionado = ANULADA;
        } else if (entregada.isSelected()) {
            estadoSeleccionado = ENTREGADA;
        } else if (en_proceso.isSelected()) {
            estadoSeleccionado = EN_PROCESO;
        } else if (finalizada.isSelected()) {
            estadoSeleccionado = FINALIZADA;
        } else if (pedida.isSelected()) {
            estadoSeleccionado = PEDIDA;
        } else if (preparada.isSelected()) {
            estadoSeleccionado = PREPARADA;
        }

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("http://localhost:8080/comandas/estado?estado=" + estadoSeleccionado))
                    .header("Accept", "application/json")
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == HttpURLConnection.HTTP_OK) {
                JSONArray contentArray = new JSONArray(response.body());

                if (contentArray.length() > 0) {
                    // Construye un mensaje con la información de todas las comandas encontradas
                    StringBuilder mensaje = new StringBuilder("El estado de la comanda es " + estadoSeleccionado + ":\n\n");
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
                    mostrarMensaje("No se encontraron comandas con el estado " + estadoSeleccionado, "Información", JOptionPane.INFORMATION_MESSAGE);
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
    private void volverAtras() {
        OpcionesComanda volver = new OpcionesComanda(parentFrame);
        parentFrame.getContentPane().removeAll();  // Elimina el contenido actual del JFrame
        parentFrame.getContentPane().add(volver);  // Añade el nuevo JPanel (OpcionesComanda)
        parentFrame.getContentPane().revalidate();  // Revalida el JFrame para actualizar la UI
        parentFrame.getContentPane().repaint();     // Repinta el JFrame para asegurarse de que se vea correctamente
        parentFrame.pack();
        parentFrame.setLocationRelativeTo(null);
        System.out.println("atras");
    }


}
