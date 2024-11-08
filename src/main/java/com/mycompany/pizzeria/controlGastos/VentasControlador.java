/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzeria.controlGastos;

/**
 *
 * @author Faby
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;

@RestController
@RequestMapping("/ventas")
public class VentasControlador {

    @Autowired
    private VentasRepository vr;

    @PostMapping
    @Transactional
    public ResponseEntity<Ventas> crearVenta(@Valid @RequestBody Ventas venta) {
        Ventas ventaGuardada = vr.save(venta);
        return ResponseEntity.ok(ventaGuardada);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ventas> obtenerVentaPorId(@PathVariable Long id) {
        return vr.findById(id)
                .map(venta -> ResponseEntity.ok(venta))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/fecha")
    public List<Ventas> listarVentasPorFecha(@RequestParam @DateTimeFormat(pattern = "dd/MM/yyyy") LocalDate fecha) {
        LocalDateTime inicioDelDia = fecha.atTime(8, 0);      // 8:00 am del día seleccionado
        LocalDateTime finDelDia = fecha.plusDays(1).atTime(3, 0); // 3:00 am del día siguiente
        return vr.findAllByFechaBetween(inicioDelDia, finDelDia);
    }

    @GetMapping
    public ResponseEntity<List<Ventas>> listarVentas() {
        List<Ventas> ventas = vr.findAll();
        return ResponseEntity.ok(ventas);
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<Ventas> actualizarVenta(@PathVariable Long id, @RequestBody Ventas ventaActualizada) {
        return vr.findById(id)
                .map(venta -> {
                    if (!ventaActualizada.getDescripcion().equals(venta.getDescripcion())) {
                        venta.setDescripcion(ventaActualizada.getDescripcion());
                    }
                    if (ventaActualizada.getMonto() != venta.getMonto()) {
                        venta.setMonto(ventaActualizada.getMonto());
                    }
                    Ventas ventaGuardada = vr.save(venta);
                    return ResponseEntity.ok(ventaGuardada);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<Void> eliminarVenta(@PathVariable Long id) {
        if (vr.existsById(id)) {
            vr.deleteById(id);
            return ResponseEntity.ok().build();  // Retorna 200 OK si la venta fue eliminada
        } else {
            return ResponseEntity.notFound().build();  // Retorna 404 si no encuentra la venta
        }
    }
}
