/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.ControlDeGastos;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.mycompany.pizzeria.controlGastos.Ventas;
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
public class EditarVenta extends javax.swing.JPanel {

    private JFrame parentFrame;
    private Ventas venta;

    public EditarVenta(JFrame parentFrame) {
        this.parentFrame = parentFrame;
        initComponents();
        setupActionListeners();
        setupEnterKeyAction();
        setupEscapeKeyAction();
    }
    EditarVenta(JFrame parentFrame, Long idVenta) throws Exception {
        this.parentFrame = parentFrame;
        this.venta=obtenerVentaOriginal(idVenta);
        initComponents();
        setupActionListeners();
        setupEnterKeyAction();
        setupEscapeKeyAction();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Ok = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        atras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        monto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(97, 97, 97));
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        jLabel3.setBackground(new java.awt.Color(97, 97, 97));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Descripcion:");

        jLabel4.setBackground(new java.awt.Color(97, 97, 97));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Editar una venta");

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

        atras.setBackground(new java.awt.Color(210, 180, 111));
        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-left-50.png"))); // NOI18N
        atras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        descripcion.setColumns(20);
        descripcion.setRows(5);
        jScrollPane1.setViewportView(descripcion);

        jLabel2.setBackground(new java.awt.Color(97, 97, 97));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Monto:");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 149, Short.MAX_VALUE)
                .addComponent(atras)
                .addGap(97, 97, 97)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(296, 296, 296))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(monto)
                                .addComponent(jSeparator1)
                                .addComponent(jSeparator2)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
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
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Ok;
    private javax.swing.JButton atras;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField monto;
    // End of variables declaration//GEN-END:variables

private void setupActionListeners() {
        Ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editarVenta(venta.getId());
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
    }

 private void setupEnterKeyAction() {
        // Mapa de entradas y acciones para el panel actual
        this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "buscarComandas");
        this.getActionMap().put("editarVenta", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editarVenta(venta.getId());
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

    private void editarVenta(Long idVenta) {
        try {
            
            System.out.println("id: " + idVenta);

            // Recuperar la venta original desde el servidor antes de editarla
            // (Este paso es importante para poder mantener los valores originales si algún campo está vacío)
            Ventas ventaOriginal = obtenerVentaOriginal(idVenta);

            // Obtener los datos ingresados en la interfaz y verificar si están vacíos
           
            String detalle = descripcion.getText().isEmpty() ? ventaOriginal.getDescripcion() : descripcion.getText();

            double precio = monto.getText().isEmpty() ? ventaOriginal.getMonto() : Double.parseDouble(monto.getText());

            // Crear un objeto ventas con los datos actualizados
           Ventas venta = new Ventas(ventaOriginal.getId(), precio,detalle);

            // Enviar la venta editada al servidor usando una solicitud HTTP PUT
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("http://localhost:8080/ventas/" + venta.getId()))
                    .header("Content-Type", "application/json")
                    .PUT(HttpRequest.BodyPublishers.ofString(convertToJson(venta))) // Serializar a JSON
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                 mostrarMensaje("La venta fue actualizada con exito","Exito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                mostrarMensaje("Error al actualizar la venta: " , "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            mostrarMensaje("Error de conexion al servidor " , "Error", JOptionPane.ERROR_MESSAGE);
             
        }
    }

// Método para obtener la venta original desde el servidor
    private Ventas obtenerVentaOriginal(Long id) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("http://localhost:8080/ventas/" + id ))
                .header("Content-Type", "application/json")
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            return convertFromJson(response.body()); // Método que convierte el JSON en un objeto Ventas
        } else {
            throw new Exception("No se pudo obtener la venta original");
        }
    }
    
    private void mostrarMensaje(String mensaje, String titulo, int messageType) {
        UIManager.put("OptionPane.background", new Color(210, 180, 111));
        UIManager.put("Panel.background", new Color(97, 97, 97));
        UIManager.put("OptionPane.messageForeground", new Color(210, 180, 111));
        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 14));

        JOptionPane.showMessageDialog(parentFrame, mensaje, titulo, messageType);
    }

    private Ventas convertFromJson(String json) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objectMapper.readValue(json, Ventas.class);
    }

// Método para convertir la venta a JSON (igual que en el anterior)
    private String convertToJson(Ventas venta) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        return objectMapper.writeValueAsString(venta);
    }

// Método para volver a la ventana anterior
    private void volverAtras() {
        ListarVentas volver = new ListarVentas(parentFrame);
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


