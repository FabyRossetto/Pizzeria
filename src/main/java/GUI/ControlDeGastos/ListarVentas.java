/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.ControlDeGastos;


import com.mycompany.pizzeria.controlGastos.Ventas;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Faby
 */
public class ListarVentas extends javax.swing.JPanel {

    private JFrame parentFrame;
    private DefaultTableModel tableModel;

    public ListarVentas(JFrame parentFrame) {
        this.parentFrame = parentFrame;
        initComponents();
        configurarTabla();
        cargarVentas();
        setupActionListeners();
        setupEnterKeyAction();
        setupEscapeKeyAction();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        borrar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        calendar = new com.toedter.calendar.JCalendar();
        atras = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(97, 97, 97));
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        tabla.setBackground(new java.awt.Color(210, 180, 111));
        tabla.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tabla.setForeground(new java.awt.Color(255, 255, 255));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Numero", "Monto", "Descripcion", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla.setRowHeight(30);
        tabla.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tabla.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tabla.setShowGrid(true);
        jScrollPane1.setViewportView(tabla);

        borrar.setBackground(new java.awt.Color(210, 180, 111));
        borrar.setForeground(new java.awt.Color(255, 255, 255));
        borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-basura-16.png"))); // NOI18N
        borrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        borrar.setRequestFocusEnabled(false);

        editar.setBackground(new java.awt.Color(210, 180, 111));
        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-editar-24.png"))); // NOI18N
        editar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(97, 97, 97));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Buscar por fecha :");
        jLabel1.setToolTipText("");

        buscar.setBackground(new java.awt.Color(210, 180, 111));
        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-buscar-32.png"))); // NOI18N
        buscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setBackground(new java.awt.Color(97, 97, 97));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Listado de todas las ventas");

        calendar.setBackground(new java.awt.Color(210, 180, 111));
        calendar.setDecorationBackgroundColor(new java.awt.Color(210, 180, 111));
        calendar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        calendar.setSundayForeground(new java.awt.Color(97, 97, 97));
        calendar.setTodayButtonText("Hoy");
        calendar.setTodayButtonVisible(true);
        calendar.setWeekOfYearVisible(false);
        calendar.setWeekdayForeground(new java.awt.Color(97, 97, 97));

        atras.setBackground(new java.awt.Color(210, 180, 111));
        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-left-50.png"))); // NOI18N
        atras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setBackground(new java.awt.Color(57, 57, 57));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(calendar, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(buscar)
                        .addGap(434, 434, 434))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(editar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(253, 253, 253))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(atras)
                        .addGap(97, 97, 97)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(443, 443, 443)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editar)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(299, 299, 299)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calendar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buscar)
                        .addGap(55, 55, 55)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editarActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked

        // Abre el enlace en el navegador predeterminado al hacer clic
        try {
            Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/fabyrossetto/"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel10MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JButton borrar;
    private javax.swing.JButton buscar;
    private com.toedter.calendar.JCalendar calendar;
    private javax.swing.JButton editar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
 private void setupActionListeners() {

        atras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                atras();
            }
        });
        borrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                borrarVenta();
            }

        });
        editar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                editarVenta();
            }

        });
        buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                buscarVentaPorFecha();
            }
        });
    }

    private void setupEnterKeyAction() {
        // Mapa de entradas y acciones para el panel actual
        this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "buscarComandas");
        this.getActionMap().put("buscar", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarVentaPorFecha();
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

    private void configurarTabla() {
        // Asignar el modelo de la tabla existente
        tableModel = (DefaultTableModel) tabla.getModel();
    }

    // Método para volver a la ventana anterior
    private void atras() {
        Opciones volver = new Opciones(parentFrame);
        parentFrame.getContentPane().removeAll();  // Elimina el contenido actual del JFrame
        parentFrame.setResizable(false);  // Evitar el redimensionamiento de la ventana

//  fijar el tamaño preferido del panel para evitar que se ajuste
        volver.setPreferredSize(new Dimension(1300, 800));
        parentFrame.add(volver, BorderLayout.CENTER);
        parentFrame.pack();
        parentFrame.setLocationRelativeTo(null); // Esto lo centra en la pantalla
        parentFrame.getContentPane().revalidate();  // Revalida el JFrame para actualizar la UI
        parentFrame.getContentPane().repaint();     // Repinta el JFrame para asegurarse de que se vea correctamente
        System.out.println("atras");
    }

    public ListarVentas(JFrame parentFrame, List<Ventas> Filtradas) {
        this.parentFrame = parentFrame;
        initComponents();
        configurarTabla();

        if (Filtradas == null || Filtradas.isEmpty()) {
            cargarVentas(); // Cargar todas las comandas
        } else {
            cargarVentasFiltradas(Filtradas); // Cargar solo las filtradas
        }
        setupActionListeners();
    }

    //sirve para cargar las comandas por cualquier tipo de filtro
    private void cargarVentasFiltradas(List<Ventas> Filtradas) {
        tableModel.setRowCount(0);
        for (Ventas venta : Filtradas) {
            Object[] rowData = {
                venta.getId(),
                venta.getDescripcion(),
                venta.getMonto(),
                venta.getFecha(),};
            tableModel.addRow(rowData);
        }
    }

    private void cargarVentas() {
        String apiUrl = "http://localhost:8080/ventas";
        try {
            // Crear conexión HTTP
            HttpURLConnection connection = (HttpURLConnection) new URL(apiUrl).openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                StringBuilder response = new StringBuilder();
                try (Scanner scanner = new Scanner(connection.getInputStream())) {
                    while (scanner.hasNext()) {
                        response.append(scanner.nextLine());
                    }
                }

                // Parsear respuesta JSON como un array directamente
                JSONArray contentArray = new JSONArray(response.toString());

                // Limpiar tabla antes de cargar nuevos datos
                tableModel.setRowCount(0);

                // Cargar datos en la tabla
                for (int i = 0; i < contentArray.length(); i++) {
                    JSONObject compra = contentArray.getJSONObject(i);
                    Object[] rowData = {
                        compra.getLong("id"),
                        compra.getString("descripcion"),
                        compra.getDouble("monto"),
                        compra.getString("fecha"),};
                    tableModel.addRow(rowData);
                }
            } else {
                mostrarMensaje("Error al cargar las ventas: " + responseCode, "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (IOException e) {
            mostrarMensaje("Error al conectar con el servidor", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (JSONException e) {
            mostrarMensaje("Error al procesar JSON: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void mostrarMensaje(String mensaje, String titulo, int messageType) {
        UIManager.put("OptionPane.background", new Color(210, 180, 111));
        UIManager.put("Panel.background", new Color(97, 97, 97));
        UIManager.put("OptionPane.messageForeground", new Color(210, 180, 111));
        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 14));

        JOptionPane.showMessageDialog(parentFrame, mensaje, titulo, messageType);
    }

    private void borrarVenta() {
        try {
            BorrarVenta borrada = new BorrarVenta(parentFrame);
            parentFrame.getContentPane().removeAll();  // Elimina el contenido actual del JFrame
            parentFrame.setResizable(false);  // Evitar el redimensionamiento de la ventana

//  fijar el tamaño preferido del panel para evitar que se ajuste
            borrada.setPreferredSize(new Dimension(500, 400));
            parentFrame.add(borrada, BorderLayout.CENTER);
            parentFrame.setSize(500, 400);
            parentFrame.setLocationRelativeTo(null);

            parentFrame.getContentPane().revalidate();  // Revalida el JFrame para actualizar la UI
            parentFrame.getContentPane().repaint();     // Repinta el JFrame para asegurarse de que se vea correctamente
            System.out.println("Pantalla de Borrar Compra");
        } catch (Exception e) {
            mostrarMensaje("Error al querer borrar la compra", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void editarVenta() {
        try {
            EditarVenta editar = new EditarVenta(parentFrame);
            parentFrame.getContentPane().removeAll();  // Elimina el contenido actual del JFrame
            parentFrame.setResizable(false);  // Evitar el redimensionamiento de la ventana

//  fijar el tamaño preferido del panel para evitar que se ajuste
            editar.setPreferredSize(new Dimension(1300, 800));
            parentFrame.add(editar, BorderLayout.CENTER);
            parentFrame.pack();
            parentFrame.setLocationRelativeTo(null);
            parentFrame.getContentPane().revalidate();  // Revalida el JFrame para actualizar la UI
            parentFrame.getContentPane().repaint();     // Repinta el JFrame para asegurarse de que se vea correctamente
            System.out.println("Pantalla de editar venta");
        } catch (Exception e) {
            mostrarMensaje("Error al querer editar la venta", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void buscarVentaPorFecha() {
        Date selectedDate = calendar.getDate();
        if (selectedDate == null) {
            mostrarMensaje("Por favor, selecciona una fecha.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = dateFormat.format(selectedDate);

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("http://localhost:8080/ventas/fecha?fecha=" + formattedDate))
                    .header("Accept", "application/json")
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == HttpURLConnection.HTTP_OK) {
                JSONArray contentArray = new JSONArray(response.body());
                // Limpia la tabla antes de añadir nuevas filas
                tableModel.setRowCount(0);

                if (contentArray.length() > 0) {
                    // Recorrer el JSON y añadir filas a la tabla
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

                    for (int i = 0; i < contentArray.length(); i++) {
                        JSONObject compra = contentArray.getJSONObject(i);

                        LocalDateTime fechaCreacion = LocalDateTime.parse(compra.getString("fecha"));
                        String fechaFormateada = fechaCreacion.format(formatter);

                        Object[] rowData = {
                            compra.getLong("id"),
                            compra.getDouble("monto"),
                            compra.getString("descripcion"),
                            fechaFormateada,};

                        tableModel.addRow(rowData);
                    }
                } else {
                    mostrarMensaje("No se encontraron ventas en la fecha " + formattedDate, "Información", JOptionPane.INFORMATION_MESSAGE);
                }

            } else {
                mostrarMensaje("Error al cargar ventas: " + response.statusCode(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            mostrarMensaje("Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
