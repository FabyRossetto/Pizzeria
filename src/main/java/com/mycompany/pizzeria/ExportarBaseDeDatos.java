/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzeria;

import java.io.File;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author Faby
 */
@Component
public class ExportarBaseDeDatos {

    private final JdbcTemplate jdbcTemplate;
    private java.awt.Component parentFrame;

    public ExportarBaseDeDatos(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<String> obtenerNombresDeTablas() {
        String sql = "SHOW TABLES";
        return jdbcTemplate.query(sql, (rs, rowNum) -> rs.getString(1));
    }

   public void exportarDatos(String rutaArchivo) {
        List<String> tablas = obtenerNombresDeTablas();
        Workbook workbook = new XSSFWorkbook();

        for (String tabla : tablas) {
            // Crear una hoja para cada tabla
            Sheet sheet = workbook.createSheet(tabla);

            // Obtener los datos de la tabla
            List<Map<String, Object>> filas = jdbcTemplate.queryForList("SELECT * FROM " + tabla);

            // Agregar encabezados
            if (!filas.isEmpty()) {
                Row encabezado = sheet.createRow(0);
                int columna = 0;
                for (String columnaNombre : filas.get(0).keySet()) {
                    encabezado.createCell(columna++).setCellValue(columnaNombre);
                }

                // Agregar datos
                int filaNum = 1;
                for (Map<String, Object> fila : filas) {
                    Row dataRow = sheet.createRow(filaNum++);
                    columna = 0;
                    for (Object valor : fila.values()) {
                        dataRow.createCell(columna++).setCellValue(valor != null ? valor.toString() : "");
                    }
                }
            }
        }
         // Verificar si el archivo ya existe
        File archivo = new File(rutaArchivo);
        if (archivo.exists()) {
            mostrarMensaje("El archivo ya existe y será sobrescrito.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

        // Guardar el archivo Excel en la ruta especificada
        try (FileOutputStream fos = new FileOutputStream(rutaArchivo)) {
            workbook.write(fos);
            mostrarMensaje("Archivo Excel generado exitosamente en: " + rutaArchivo, "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            mostrarMensaje("Error al guardar el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    private void mostrarMensaje(String mensaje, String titulo, int messageType) {
        UIManager.put("OptionPane.background", new Color(210, 180, 111));
        UIManager.put("Panel.background", new Color(97, 97, 97));
        UIManager.put("OptionPane.messageForeground", new Color(210, 180, 111));
        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 14));
        JOptionPane.showMessageDialog(parentFrame, mensaje, titulo, messageType);
    }
}
   
  


