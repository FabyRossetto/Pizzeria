/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import com.mycompany.pizzeria.comandas.Comanda;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import javax.swing.AbstractAction;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Faby
 */
public class ListarTodasLasComandas extends javax.swing.JPanel {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        atras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(97, 97, 97));
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        Tabla.setBackground(new java.awt.Color(210, 180, 111));
        Tabla.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Tabla.setForeground(new java.awt.Color(255, 255, 255));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Numero", "Pedido", "Mesa", "Camarero", "Estado", "Precio", "Comentario", "Fecha", "Buscar", "Editar", "Borrar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        Tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Tabla.setRowHeight(30);
        Tabla.setSelectionBackground(new java.awt.Color(0, 0, 0));
        Tabla.setSelectionForeground(new java.awt.Color(255, 255, 255));
        Tabla.setShowGrid(true);
        jScrollPane1.setViewportView(Tabla);

        atras.setBackground(new java.awt.Color(210, 180, 111));
        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-left-50.png"))); // NOI18N
        atras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setBackground(new java.awt.Color(97, 97, 97));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Listado de comandas");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(atras)
                        .addGap(303, 303, 303)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))))
            .addGroup(layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 370, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        getAccessibleContext().setAccessibleName("");
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
    private javax.swing.JTable Tabla;
    private javax.swing.JButton atras;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
  private JFrame parentFrame;
    private DefaultTableModel tableModel;
    EditarComanda editarPanel = new EditarComanda(parentFrame);

    public ListarTodasLasComandas(JFrame parentFrame) {
        this.parentFrame = parentFrame;
        initComponents();
        configurarTabla();
        cargarComandas();
        setupActionListeners();
        setupEscapeKeyAction();
    }

    private void setupActionListeners() {

        atras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                atras();
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
        // tableModel = (DefaultTableModel) Tabla.getModel();
        // Configurar modelo de la tabla con columnas personalizadas
        tableModel = new DefaultTableModel(new Object[]{"ID", "Pedido", "Mesa", "Mozo", "Estado", "Precio Final", "Comentario", "Fecha Creación", "Buscar", "Editar", "Borrar"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Permitir edición solo en las columnas de acción
                return column >= 8;
            }
        };
        Tabla.setModel(tableModel);

        // Configurar renderizador y editor para botones
        agregarBotonBuscar(8, "/Imagenes/icons8-buscar-32.png");
        agregarBotonEditar(9, "/Imagenes/icons8-editar-24.png");
        agregarBotonBorrar(10, "/Imagenes/icons8-basura-16.png");
    }

    private void agregarBotonBuscar(int columnIndex, String iconPath) {
        // Crear un JButton con el ícono
        JButton boton = new JButton(new ImageIcon(getClass().getResource(iconPath)));
        boton.setBorderPainted(false);
        boton.setContentAreaFilled(false);
        boton.setFocusPainted(false);

        // Renderizador para mostrar el botón
        Tabla.getColumnModel().getColumn(columnIndex).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                return boton;
            }
        });

        // Editor para capturar eventos de clic, boton buscar
        Tabla.getColumnModel().getColumn(columnIndex).setCellEditor(new DefaultCellEditor(new JCheckBox()) {
            @Override
            public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
                // Crear una nueva instancia para cada clic y adjuntar el listener
                JButton botonClickeado = new JButton(new ImageIcon(getClass().getResource(iconPath)));
                botonClickeado.setBorderPainted(false);
                botonClickeado.setContentAreaFilled(false);
                botonClickeado.setFocusPainted(false);

                botonClickeado.addActionListener(e -> {
                    // Obtener el ID de la fila seleccionada
                    Long comandaId = (Long) table.getValueAt(row, 0); 

                    // Llamar al método para buscar la comanda
                    buscarComanda(comandaId);
                });

                return botonClickeado;
            }
        });
    }
        
         private void agregarBotonBorrar(int columnIndex, String iconPath) {
        // Crear un JButton con el ícono
        JButton boton = new JButton(new ImageIcon(getClass().getResource(iconPath)));
        boton.setBorderPainted(false);
        boton.setContentAreaFilled(false);
        boton.setFocusPainted(false);

        // Renderizador para mostrar el botón
        Tabla.getColumnModel().getColumn(columnIndex).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                return boton;
            }
        });

        // Editor para el botón "Borrar"
        Tabla.getColumnModel().getColumn(columnIndex).setCellEditor(new DefaultCellEditor(new JCheckBox()) {
            @Override
            public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
                JButton botonBorrar = new JButton(new ImageIcon(getClass().getResource(iconPath)));
                botonBorrar.setBorderPainted(false);
                botonBorrar.setContentAreaFilled(false);
                botonBorrar.setFocusPainted(false);

                botonBorrar.addActionListener(e -> {
                    Long idComanda = (Long) table.getValueAt(row, 0); 
                    int confirm = JOptionPane.showConfirmDialog(parentFrame,
                            "¿Estás seguro de que deseas borrar la comanda con ID " + idComanda + "?",
                            "Confirmar borrado",
                            JOptionPane.YES_NO_OPTION);

                    if (confirm == JOptionPane.YES_OPTION) {
                        borrarComanda(idComanda);
                    }
                });

                return botonBorrar;
            }
        });
         }
         
          private void agregarBotonEditar(int columnIndex, String iconPath) {
        // Crear un JButton con el ícono
        JButton boton = new JButton(new ImageIcon(getClass().getResource(iconPath)));
        boton.setBorderPainted(false);
        boton.setContentAreaFilled(false);
        boton.setFocusPainted(false);

        // Renderizador para mostrar el botón
        Tabla.getColumnModel().getColumn(columnIndex).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                return boton;
            }
        });
// Editor para el botón "Editar"
        Tabla.getColumnModel().getColumn(columnIndex).setCellEditor(new DefaultCellEditor(new JCheckBox()) {
            @Override
            public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
                JButton botonEditar = new JButton(new ImageIcon(getClass().getResource(iconPath)));
                botonEditar.setBorderPainted(false);
                botonEditar.setContentAreaFilled(false);
                botonEditar.setFocusPainted(false);

                botonEditar.addActionListener(e -> {
                    Long idComanda = (Long) table.getValueAt(row, 0); 
                    // Redirigir al panel de edición
                    abrirPanelEdicion(idComanda);
                });

                return botonEditar;
            }
        });
    }

    // Método para volver a la ventana anterior
    private void atras() {
        OpcionesComanda op = new OpcionesComanda(parentFrame);
        parentFrame.getContentPane().removeAll();

        parentFrame.setResizable(false);  // Evitar el redimensionamiento de la ventana

//  fijar el tamaño preferido del panel para evitar que se ajuste
        op.setPreferredSize(new Dimension(1000, 600));
        parentFrame.add(op, BorderLayout.CENTER);
        parentFrame.pack();
        parentFrame.setLocationRelativeTo(null); // Esto lo centra en la pantalla
        parentFrame.getContentPane().revalidate();
        parentFrame.getContentPane().repaint();
    }

    public ListarTodasLasComandas(JFrame parentFrame, List<Comanda> comandasFiltradas) {
        this.parentFrame = parentFrame;
        initComponents();
        configurarTabla();

        if (comandasFiltradas == null || comandasFiltradas.isEmpty()) {
            cargarComandas(); // Cargar todas las comandas
        } else {
            cargarComandasFiltradas(comandasFiltradas); // Cargar solo las filtradas
        }
        setupActionListeners();
    }

    //sirve para cargar las comandas por cualquier tipo de filtro
    private void cargarComandasFiltradas(List<Comanda> comandasFiltradas) {
        // Formateador para las fechas
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy, HH:mm");

        tableModel.setRowCount(0);
        for (Comanda comanda : comandasFiltradas) {
            String fechaFormateada = dateFormatter.format(comanda.getFechaCreacion());
            Object[] rowData = {
                comanda.getId(),
                comanda.getPedido(),
                comanda.getMesa(),
                comanda.getMozo(),
                comanda.getEstado(),
                comanda.getPrecioFinal(),
                comanda.getComentario(),
                fechaFormateada
            };
            tableModel.addRow(rowData);
        }
    }

    private void cargarComandas() {
        String apiUrl = "http://localhost:8080/comandas";
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy, HH:mm");
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
                    JSONObject comanda = contentArray.getJSONObject(i);

                    // Parsear y formatear la fecha
                    String fechaRaw = comanda.getString("fechaCreacion");
                    String fechaFormateada = dateFormatter.format(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(fechaRaw));

                    Object[] rowData = {
                        comanda.getLong("id"),
                        comanda.getString("pedido"),
                        comanda.getInt("mesa"),
                        comanda.getString("mozo"),
                        comanda.getString("estado"),
                        comanda.getDouble("precioFinal"),
                        comanda.optString("comentario", ""), // En caso de que sea null
                        fechaFormateada,
                        "Buscar",
                        "Editar",
                        "Borrar"
                    };
                    tableModel.addRow(rowData);
                }
            } else {
                mostrarMensaje("Error al cargar las comandas: " + responseCode, "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (IOException e) {
            mostrarMensaje("Error al conectar con el servidor", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (JSONException e) {
            mostrarMensaje("Error al procesar JSON: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        } catch (ParseException e) {
            mostrarMensaje("Error al formatear la fecha: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void buscarComanda(Long comandaId) {
        // Enviar una solicitud HTTP GET al servidor
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("http://localhost:8080/comandas/" + comandaId))
                    .header("Accept", "application/json")
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == HttpURLConnection.HTTP_OK) {
                JSONObject comanda = new JSONObject(response.body());

                // Construye un mensaje con la información de la comanda encontrada
                StringBuilder mensaje = new StringBuilder("La comanda buscada es:\n");
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

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

                // Muestra el mensaje en un JOptionPane
                mostrarMensaje(mensaje.toString(), "Comanda", JOptionPane.INFORMATION_MESSAGE);
            } else {
                mostrarMensaje("Error al cargar la comanda: " + response.statusCode(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            mostrarMensaje("Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(" " + e.getMessage());
        }
    }

    private void mostrarMensaje(String mensaje, String titulo, int messageType) {
        UIManager.put("OptionPane.background", new Color(210, 180, 111));
        UIManager.put("Panel.background", new Color(97, 97, 97));
        UIManager.put("OptionPane.messageForeground", new Color(210, 180, 111));
        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 14));

        JOptionPane.showMessageDialog(parentFrame, mensaje, titulo, messageType);
    }

    private void borrarComanda(Long comandaId) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("http://localhost:8080/comandas/" + comandaId))
                    .DELETE()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                mostrarMensaje("La comanda fue eliminada con exito","Exito", JOptionPane.INFORMATION_MESSAGE);
                cargarComandas(); // Refrescar tabla
            } else {
                mostrarMensaje("Error al eliminar la comanda: " + response.statusCode(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            mostrarMensaje("Error de conexion al servidor " , "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void abrirPanelEdicion(Long idComanda) {
    try {
        Comanda comanda =editarPanel.obtenerComandaOriginal(idComanda);
        EditarComanda editarPanel = new EditarComanda(parentFrame, idComanda, comanda.getPedido(), comanda);

        // Configuración del panel en el JFrame
        parentFrame.getContentPane().removeAll();
        parentFrame.setResizable(false);
        editarPanel.setPreferredSize(new Dimension(1000, 600));
        parentFrame.add(editarPanel, BorderLayout.CENTER);
        parentFrame.pack();
        parentFrame.setLocationRelativeTo(null);
        parentFrame.getContentPane().revalidate();
        parentFrame.getContentPane().repaint();
    } catch (Exception e) {
        mostrarMensaje("Error al querer editar la comanda", "Error", JOptionPane.ERROR_MESSAGE);
    }
}



}
