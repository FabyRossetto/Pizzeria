/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzeria.controlGastos;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;

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
    private LocalDateTime fecha;  
    
    @Enumerated(EnumType.STRING)
    ResponsableDeCompra responsable;

    public Compras() {
    }

    public Compras( String descripcion, double monto, ResponsableDeCompra responsable) {
        
        this.descripcion = descripcion;
        this.monto = monto;
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

    public LocalDateTime getFecha() {
        return fecha;
    }

    public ResponsableDeCompra getResponsable() {
        return responsable;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setResponsable(ResponsableDeCompra responsable) {
        this.responsable = responsable;
    }
  
}
