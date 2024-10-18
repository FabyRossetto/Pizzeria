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
import java.util.List;

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
    public ResponseEntity<List<Compras>> obtenerPorFecha(@RequestParam LocalDate fecha) {

        List<Compras> comprasPorFecha = cr.findByFecha(fecha);
        return ResponseEntity.ok(comprasPorFecha);
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
                    if (!compraActualizada.getFecha().equals(compra.getFecha())) {
                        compra.setFecha(compraActualizada.getFecha());
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
