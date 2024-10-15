/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzeria.comandas;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;
import org.hibernate.annotations.CreationTimestamp;


/**
 *
 * @author Faby
 */

@Entity
public class Comanda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id; 
    
    @Column(nullable = false)
    String pedido;
    
    @Column(nullable = false)
    int mesa;
    
    @Column(nullable = false)
    String mozo;
    
    Estado estado;
    
    @Column(nullable = false)
    Double precioFinal;
    
    String comentario;
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDate fechaCreacion;

    public Comanda() {
    }

    public Comanda(Long id, String pedido, int mesa, String mozo, Estado estado, Double precioFinal, String comentario, LocalDate fechaCreacion) {
        this.id = id;
        this.pedido = pedido;
        this.mesa = mesa;
        this.mozo = mozo;
        this.estado = estado;
        this.precioFinal = precioFinal;
        this.comentario = comentario;
        this.fechaCreacion = fechaCreacion;
    }

    

    

    

    public Long getId() {
        return id;
    }

    

    public int getMesa() {
        return mesa;
    }

    public String getPedido() {
        return pedido;
    }

    public String getMozo() {
        return mozo;
    }

    public Estado getEstado() {
        return estado;
    }

    public Double getPrecioFinal() {
        return precioFinal;
    }

    public String getComentario() {
        return comentario;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    
    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public void setMozo(String mozo) {
        this.mozo = mozo;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setPrecioFinal(Double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    
   
    
    
}
