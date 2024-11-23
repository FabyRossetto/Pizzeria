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
import org.springframework.format.annotation.DateTimeFormat;
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
    public ResponseEntity<List<Comanda>> obtenerTodasLasComandas() {
        List<Comanda> todasLasComandas = cr.findAll();
        return ResponseEntity.ok(todasLasComandas);
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<Comanda> actualizar(@RequestBody Comanda comandaActualizada) {
        Optional<Comanda> original = cr.findById(comandaActualizada.getId());

        return original.map(comanda -> {
            // Solo actualizar si el campo no es nulo o no está vacío
            if (comandaActualizada.getPedido() != null && !comandaActualizada.getPedido().isEmpty()) {
                comanda.setPedido(comandaActualizada.getPedido());
            }
            if (comandaActualizada.getMesa() != 0) { // Asumimos que mesa tiene un valor 0 si no se actualiza
                comanda.setMesa(comandaActualizada.getMesa());
            }
            if (comandaActualizada.getMozo() != null ) {
                comanda.setMozo(comandaActualizada.getMozo());
            }
            if (comandaActualizada.getEstado() != null) {
                comanda.setEstado(comandaActualizada.getEstado());
            }
            if (comandaActualizada.getPrecioFinal() != null) {
                comanda.setPrecioFinal(comandaActualizada.getPrecioFinal());
            }
            if (comandaActualizada.getComentario() != null && !comandaActualizada.getComentario().isEmpty()) {
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
    
    @GetMapping("/por-fecha")
    public List<Comanda> listarComandasPorFecha(@RequestParam @DateTimeFormat(pattern = "dd/MM/yyyy") LocalDate fecha) {
        LocalDateTime inicioDelDia = fecha.atTime(8, 0);      // 8:00 am del día seleccionado
        LocalDateTime finDelDia = fecha.plusDays(1).atTime(3, 0); // 3:00 am del día siguiente
        return cr.findAllByFechaCreacionBetween(inicioDelDia, finDelDia);
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
    
    @GetMapping("/mesa")
    public ResponseEntity<List<Comanda>> buscarPorMesa(@RequestParam int mesa) {

       List<Comanda> comandas = cr.findByMesa(mesa);


        return ResponseEntity.ok(comandas);
    }
    
    @GetMapping("/mozo")
    public ResponseEntity<List<Comanda>> buscarPorMozo(@RequestParam Mozo mozo) {

        List<Comanda> comandas = cr.findAll(); // Cargar todas las comandas desde el repositorio
        List<Comanda> filtradas = new ArrayList<>(); // Lista para las comandas filtradas

        // Filtrar las comandas por el mozo pasado por parámetro
        for (Comanda comanda : comandas) {
            if (comanda.getMozo().equals(mozo)){
                filtradas.add(comanda);
            }
        }

        return ResponseEntity.ok(filtradas);
    }



}
