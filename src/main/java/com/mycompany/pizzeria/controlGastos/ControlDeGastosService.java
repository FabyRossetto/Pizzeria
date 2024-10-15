/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzeria.controlGastos;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ControlDeGastosService {
 

    @Autowired
    private VentasRepository ventasRepository;

    @Autowired
    private ComprasRepository comprasRepository;

    // Método para calcular la ganancia de un día específico
    public double calcularGananciaDiaria(LocalDate fecha) {
        // Obtener todas las ventas del día
        List<Ventas> ventasDelDia = ventasRepository.findByFecha(fecha);
        
        // Obtener todas las compras del día
        List<Compras> comprasDelDia = comprasRepository.findByFecha(fecha);

        // Sumar el total de ventas 
        double totalVentas = 0;
        for (Ventas venta : ventasDelDia) {
            totalVentas += venta.getMonto();
            System.out.println("entra al for de ventas");
        }
 
        // Sumar el total de compras 
        double totalCompras = 0;
        for (Compras compra : comprasDelDia) {
            totalCompras += compra.getMonto();
            System.out.println("entra al for de compras");
        }

        // Calcular la ganancia: total de ventas - total de compras
        return totalVentas - totalCompras;
    }
}


