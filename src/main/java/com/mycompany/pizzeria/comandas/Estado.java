/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzeria.comandas;

/**
 *
 * @author Faby
 */
public enum Estado {
     /**
     * La comanda ha sido recien pedoda por el cliente.
     */
    PEDIDA,

    /**
     * La comanda está siendo procesada en la cocina.
     */
    EN_PROCESO,

    /**
     * La comanda ya ha sido preparada y está lista para ser entregada al cliente.
     */
    PREPARADA,

    /**
     * La comanda ha sido entregada al cliente en la mesa.
     */
    ENTREGADA,

    /**
     * El cliente ha pagado
     * 
     */
    FINALIZADA,

    /**
     * La comanda ha sido anulada por alguna razón (cancelación por el cliente o error).
     */
    ANULADA
}


