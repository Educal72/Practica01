/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.practica01.service;

import com.practica01.domain.Estado;
import java.util.List;

public interface EstadoService {
    
     public List<Estado> getEstados();
    
    public Estado getEstados(Estado estado);
    
    public void save(Estado estado);
    
    public void delete(Estado estado);
    
}
//Practica 01adad
