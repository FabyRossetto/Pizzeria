/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;


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
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.Date;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
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
public class ListarComandasPorFecha extends javax.swing.JPanel {

    private JFrame parentFrame;
    private DefaultTableModel tabla;
    

    public ListarComandasPorFecha(JFrame parentFrame) {
        this.parentFrame = parentFrame;
        initComponents(); 
        setupBuscarButton(); 
        // Configurar la tabla solo una vez
        tabla = new DefaultTableModel(new Object[]{"ID", "Pedido", "Mesa", "Mozo", "Estado", "Precio Final", "Comentario", "Fecha Creación"}, 0);
        JTable table = new JTable(tabla);
        JScrollPane scrollPane = new JScrollPane(table);
        this.add(scrollPane);
        
        
        setupEnterKeyAction();
        setupEscapeKeyAction();
    }
    

    

    private void setupBuscarButton() {
        Buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarComandasPorFecha();
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
                buscarComandasPorFecha();
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

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jCalendar2 = new com.toedter.calendar.JCalendar();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        atras = new javax.swing.JButton();
        Calendario = new com.toedter.calendar.JCalendar();
        Buscar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(97, 97, 97));
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));

        jLabel1.setBackground(new java.awt.Color(97, 97, 97));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingrese una fecha");

        atras.setBackground(new java.awt.Color(210, 180, 111));
        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-left-50.png"))); // NOI18N
        atras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Calendario.setBackground(new java.awt.Color(210, 180, 111));
        Calendario.setDecorationBackgroundColor(new java.awt.Color(210, 180, 111));
        Calendario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Calendario.setSundayForeground(new java.awt.Color(97, 97, 97));
        Calendario.setTodayButtonText("Hoy");
        Calendario.setTodayButtonVisible(true);
        Calendario.setWeekOfYearVisible(false);
        Calendario.setWeekdayForeground(new java.awt.Color(97, 97, 97));

        Buscar.setBackground(new java.awt.Color(210, 180, 111));
        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-buscar-32.png"))); // NOI18N
        Buscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(Calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(459, 459, 459)
                        .addComponent(Buscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(atras)
                        .addGap(222, 222, 222)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 323, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(Calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Buscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
    private javax.swing.JButton Buscar;
    private com.toedter.calendar.JCalendar Calendario;
    private javax.swing.JButton atras;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JCalendar jCalendar2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    // End of variables declaration//GEN-END:variables

    private void buscarComandasPorFecha() {
        Date selectedDate = Calendario.getDate();
        if (selectedDate == null) {
        mostrarMensaje("Por favor, selecciona una fecha.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = dateFormat.format(selectedDate);

        

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("http://localhost:8080/comandas/por-fecha?fecha=" + formattedDate))
                    .header("Accept", "application/json")
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == HttpURLConnection.HTTP_OK) {
                JSONArray contentArray = new JSONArray(response.body());
                   // Limpia la tabla antes de añadir nuevas filas
            tabla.setRowCount(0);

                if (contentArray.length() > 0) {
                    // Construye un mensaje con la información de todas las comandas encontradas
                    StringBuilder mensaje = new StringBuilder("Las comandas del dia  " + formattedDate + ":\n\n");
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
                    mostrarMensaje("No se encontraron comandas en la fecha " + formattedDate, "Información", JOptionPane.INFORMATION_MESSAGE);
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
        parentFrame.pack();
        parentFrame.setLocationRelativeTo(null); // Esto lo centra en la pantalla
        parentFrame.getContentPane().revalidate();  // Revalida el JFrame para actualizar la UI
        parentFrame.getContentPane().repaint();     // Repinta el JFrame para asegurarse de que se vea correctamente
        parentFrame.pack();
        parentFrame.setLocationRelativeTo(null);
        System.out.println("atras");
    }

}
