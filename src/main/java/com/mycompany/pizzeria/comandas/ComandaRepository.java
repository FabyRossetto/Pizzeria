/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzeria.comandas;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Faby
 */
@Repository
public interface ComandaRepository extends JpaRepository<Comanda, Long> {

    public List<Comanda> findAllByFechaCreacionBetween(LocalDateTime inicioDiaLaboral, LocalDateTime finDiaLaboral);

    List<Comanda> findByMesa(int mesa);

  
}
