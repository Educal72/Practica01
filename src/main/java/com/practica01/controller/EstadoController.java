
package com.practica01.controller;

import com.practica01.domain.Estado;
import com.practica01.service.EstadoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class EstadoController {
    @Autowired
    private EstadoService estadoService;
    
    @GetMapping("/estado/nuevo")
    public String estadoNuevo(Estado estado){
        return "modificarEstado";
    }
    
    @PostMapping("/estado/guardar")
    public String estadoGuardar(Estado estado){
        estadoService.save(estado);
        return "redirect:/";
    }
    
    @GetMapping("/estado/modificar/{idPais}")
    public String estadoModificar(Estado estado, Model model){
        estado=estadoService.getEstados(estado);
        model.addAttribute("estado", estado);
        return "modificarEstado";
    }
    
    @GetMapping("/estado/eliminar/{idPais}")
    public String estadoEliminar(Estado estado){
        estadoService.delete(estado);
        return "redirect:/";
    }
}
