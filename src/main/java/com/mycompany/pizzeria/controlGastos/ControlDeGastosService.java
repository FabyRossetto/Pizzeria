/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzeria.controlGastos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ControlDeGastosService {

    @Autowired
    private VentasRepository ventasRepository;

    @Autowired
    private ComprasRepository comprasRepository;

    // Método para calcular la ganancia de un "día laboral"
    public double calcularGananciaDiaria(LocalDate fecha) {
        // Definir el inicio y fin del día laboral
        LocalDateTime inicioDiaLaboral = fecha.atTime(8, 0); // 08:00 AM del día
        LocalDateTime finDiaLaboral = fecha.plusDays(1).atTime(3, 30); // 03:30 AM del día siguiente
        
        // Obtener todas las ventas del rango
        List<Ventas> ventasDelDia = ventasRepository.findAllByFechaBetween(inicioDiaLaboral, finDiaLaboral);
        
        // Obtener todas las compras del rango
        List<Compras> comprasDelDia = comprasRepository.findAllByFechaBetween(inicioDiaLaboral, finDiaLaboral);

        // Sumar el total de ventas 
        double totalVentas = 0;
        for (Ventas venta : ventasDelDia) {
            totalVentas += venta.getMonto();
        }

        // Sumar el total de compras 
        double totalCompras = 0;
        for (Compras compra : comprasDelDia) {
            totalCompras += compra.getMonto();
        }

        // Calcular la ganancia: total de ventas - total de compras
        return totalVentas - totalCompras;
    }
}



