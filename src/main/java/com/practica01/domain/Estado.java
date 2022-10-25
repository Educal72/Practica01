/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica01.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="estado")

public class Estado implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPais;
    int poblacion;
    String nombre;
    String capital;
    int costas ;
    String continente;

   public Estado() {
    }

   public Estado(int poblacion,String nombre, String capital, int costas, String continente) {
        this.poblacion=poblacion;
        this.nombre = nombre;
        this.capital = capital;
        this.costas = costas;
        this.continente = continente;
    }
   //Practica 01dada
}
