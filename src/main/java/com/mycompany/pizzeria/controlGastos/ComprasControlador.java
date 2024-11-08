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
@RequestMapping("/compras")
public class ComprasControlador {

    @Autowired
    private ComprasRepository cr;

    @PostMapping
    @Transactional
    public ResponseEntity<Compras> crearCompra(@Valid @RequestBody Compras compra) {
        Compras compraGuardada = cr.save(compra);
        return ResponseEntity.ok(compraGuardada);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Compras> obtenerCompraPorId(@PathVariable Long id) {
        return cr.findById(id)
                .map(compra -> ResponseEntity.ok(compra))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/fecha")
    public List<Compras> listarComprasPorFecha(@RequestParam @DateTimeFormat(pattern = "dd/MM/yyyy") LocalDate fecha) {
        LocalDateTime inicioDelDia = fecha.atTime(8, 0);      // 8:00 am del día seleccionado
        LocalDateTime finDelDia = fecha.plusDays(1).atTime(3, 0); // 3:00 am del día siguiente
        return cr.findAllByFechaBetween(inicioDelDia, finDelDia);
    }


    @GetMapping
    public ResponseEntity<List<Compras>> listarCompras() {
        List<Compras> compras = cr.findAll();
        return ResponseEntity.ok(compras);
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<Compras> actualizarCompra(@PathVariable Long id, @RequestBody Compras compraActualizada) {
        return cr.findById(id)
                .map(compra -> {
                    if (!compraActualizada.getDescripcion().equals(compra.getDescripcion())) {
                        compra.setDescripcion(compraActualizada.getDescripcion());
                    }
                    if (compraActualizada.getMonto() != compra.getMonto()) {
                        compra.setMonto(compraActualizada.getMonto());
                    }
                    
                    if (!compraActualizada.getResponsable().equals(compra.getResponsable())) {
                        compra.setResponsable(compraActualizada.getResponsable());
                    }
                    Compras compraGuardada = cr.save(compra);
                    return ResponseEntity.ok(compraGuardada);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<Void> eliminarCompra(@PathVariable Long id) {
        if (cr.existsById(id)) {
            cr.deleteById(id);
            return ResponseEntity.ok().build();  // Retorna 200 OK si la compra fue eliminada
        } else {
            return ResponseEntity.notFound().build();  // Retorna 404 si no encuentra la compra
        }
    }
}
