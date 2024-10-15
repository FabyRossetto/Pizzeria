/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzeria.controlGastos;

import java.time.LocalDate;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/control")
public class ControlDeGastosControlador {
   

    @Autowired
    private ControlDeGastosService cs;

    
    @GetMapping("/diaria")
    public ResponseEntity<Double> obtenerGananciaDiaria(@RequestParam("fecha") @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate fecha) {
        double ganancia = cs.calcularGananciaDiaria(fecha);
        return ResponseEntity.ok(ganancia);
    }
}


