/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzeria.controlGastos;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;


/**
 *
 * @author Faby
 */
@Entity
public class Compras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    
    @NotNull
    String descripcion;
    
    @NotNull
    double monto;
    
    @CreationTimestamp
    private LocalDate fecha; 
    
    @NotNull
    String responsable;

    public Compras() {
    }

    public Compras(Long id, String descripcion, double monto, LocalDate fecha, String responsable) {
        this.id = id;
        this.descripcion = descripcion;
        this.monto = monto;
        this.fecha = fecha;
        this.responsable = responsable;
    }

    public Long getId() {
        return id;
    }

    

    public String getDescripcion() {
        return descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    
    
}
