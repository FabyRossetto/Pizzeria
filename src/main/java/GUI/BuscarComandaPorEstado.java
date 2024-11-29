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
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
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
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;

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
        setupEscapeKeyAction();

        // Configurar la tabla solo una vez
        tabla = new DefaultTableModel(new Object[]{"ID", "Pedido", "Mesa", "Mozo", "Estado", "Precio Final", "Comentario", "Fecha Creación"}, 0);
        JTable table = new JTable(tabla);
        JScrollPane scrollPane = new JScrollPane(table);
        this.add(scrollPane);

        // Configurar InputMap y ActionMap para Enter
        setupEnterKeyAction();

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

    private void setupEnterKeyAction() {
        // Mapa de entradas y acciones para el panel actual
        this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "buscarComandas");
        this.getActionMap().put("buscarComandas", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarComandasPorEstado();
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
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(97, 97, 97));
        setFocusCycleRoot(true);
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1000, 600));

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
        finalizada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizadaActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(atras)
                .addGap(209, 209, 209)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(316, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(preparada)
                    .addComponent(en_proceso)
                    .addComponent(pedida)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(entregada)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(anulada)
                            .addComponent(finalizada))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(331, 331, 331))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Buscar)
                        .addGap(304, 304, 304))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(pedida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(en_proceso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(preparada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entregada, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(finalizada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(anulada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                        .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
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

    private void finalizadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finalizadaActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked

        // Abre el enlace en el navegador predeterminado al hacer clic
        try {
            Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/fabyrossetto/"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel10MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JRadioButton anulada;
    private javax.swing.JButton atras;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton en_proceso;
    private javax.swing.JRadioButton entregada;
    private javax.swing.JRadioButton finalizada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JRadioButton pedida;
    private javax.swing.JRadioButton preparada;
    // End of variables declaration//GEN-END:variables

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
    // Crear un área de texto para mostrar el mensaje
    JTextArea textArea = new JTextArea(mensaje);
    textArea.setFont(new Font("Arial", Font.BOLD, 14)); // Fuente personalizada
    textArea.setLineWrap(true); // Ajuste automático de línea
    textArea.setWrapStyleWord(true); // Ajuste de palabras completas
    textArea.setEditable(false); // Deshabilitar edición
    textArea.setBackground(new Color(97, 97, 97)); // Fondo del área de texto
    textArea.setForeground(new Color(210, 180, 111)); // Color del texto

    // Envolver el área de texto en un JScrollPane
    JScrollPane scrollPane = new JScrollPane(textArea);
    scrollPane.setPreferredSize(new Dimension(1000, 700)); // Tamaño fijo del área de desplazamiento
    scrollPane.setBorder(BorderFactory.createEmptyBorder()); // Sin bordes adicionales

    // Estilo de las barras de desplazamiento
    scrollPane.getVerticalScrollBar().setUI(new javax.swing.plaf.basic.BasicScrollBarUI() {
        @Override
        protected void configureScrollBarColors() {
            this.thumbColor = new Color(210, 180, 111); // Color del deslizador
        }
    });

    // Aplicar estilos al JOptionPane
    UIManager.put("OptionPane.background", new Color(210, 180, 111));
    UIManager.put("Panel.background", new Color(97, 97, 97));
    UIManager.put("OptionPane.messageForeground", new Color(210, 180, 111));
    UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 14));

    // Mostrar el JScrollPane dentro de un JOptionPane
    JOptionPane.showMessageDialog(parentFrame, scrollPane, titulo, messageType);
}

    // Método para volver a la ventana anterior
    private void volverAtras() {
        OpcionesComanda volver = new OpcionesComanda(parentFrame);
        parentFrame.getContentPane().removeAll();  // Elimina el contenido actual del JFrame
        parentFrame.setResizable(false);  // Evitar el redimensionamiento de la ventana

//  fijar el tamaño preferido del panel para evitar que se ajuste
        volver.setPreferredSize(new Dimension(1000, 600));
        parentFrame.add(volver, BorderLayout.CENTER);

        parentFrame.getContentPane().revalidate();  // Revalida el JFrame para actualizar la UI
        parentFrame.getContentPane().repaint();     // Repinta el JFrame para asegurarse de que se vea correctamente
        parentFrame.pack();
        parentFrame.setLocationRelativeTo(null);
        System.out.println("atras");
    }

}
