/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzeria.comandas;

import com.mycompany.pizzeria.controlGastos.Compras;
import jakarta.transaction.Transactional;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Faby
 */
@RestController
@RequestMapping("/comandas")
public class ComandasControlador {

    @Autowired
    ComandaRepository cr;

    @PostMapping
    @Transactional
    public ResponseEntity<Comanda> generar(@RequestBody Comanda comanda) {
        Comanda savedComanda = cr.save(comanda);
        return ResponseEntity.ok(savedComanda);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Comanda> obtenerPorId(@PathVariable Long id) {
        return cr.findById(id)
                .map(comanda -> ResponseEntity.ok(comanda))
                .orElse(ResponseEntity.notFound().build());
    }
    
    

    @GetMapping
    public ResponseEntity<List<Comanda>> listar() {
        List<Comanda> comandas = cr.findAll();
        return ResponseEntity.ok(comandas);
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<Comanda> actualizar(@PathVariable Long id, @RequestBody Comanda comandaActualizada) {
        Optional<Comanda> original = cr.findById(id);

        return original.map(comanda -> {
            if (!comandaActualizada.getPedido().equals(comanda.getPedido())) {
                comanda.setPedido(comandaActualizada.getPedido());
            }
            if (comandaActualizada.getMesa() != comanda.getMesa()) {
                comanda.setMesa(comandaActualizada.getMesa());
            }
            if (!comandaActualizada.getMozo().equals(comanda.getMozo())) {
                comanda.setMozo(comandaActualizada.getMozo());
            }
            if (!comandaActualizada.getEstado().equals(comanda.getEstado())) {
                comanda.setEstado(comandaActualizada.getEstado());
            }
            if (!comandaActualizada.getPrecioFinal().equals(comanda.getPrecioFinal())) {
                comanda.setPrecioFinal(comandaActualizada.getPrecioFinal());
            }
            if (!comandaActualizada.getComentario().equals(comanda.getComentario())) {
                comanda.setComentario(comandaActualizada.getComentario());
            }

            Comanda comandaGuardada = cr.save(comanda);
            return ResponseEntity.ok(comandaGuardada);
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<Object> eliminar(@PathVariable Long id) {
        return cr.findById(id)
                .map(comanda -> {
                    cr.delete(comanda);
                    return ResponseEntity.ok().build();
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/estado")
    public ResponseEntity<List<Comanda>> buscarPorEstado(@RequestParam Estado estado) {

        List<Comanda> comandas = cr.findAll(); // Cargar todas las comandas desde el repositorio
        List<Comanda> filtradas = new ArrayList<>(); // Lista para las comandas filtradas

        // Filtrar las comandas por el estado pasado por parámetro
        for (Comanda comanda : comandas) {
            if (comanda.getEstado().equals(estado)) {
                filtradas.add(comanda);
            }
        }

        return ResponseEntity.ok(filtradas);
    }

}
