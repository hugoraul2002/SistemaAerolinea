package com.proyecto.proyecto.controllers;

import com.proyecto.proyecto.models.IdentificacionModel;
import com.proyecto.proyecto.services.IdentificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/identificacion")
public class IdentificacionController {
    @Autowired
    IdentificacionService identificacionService;

    @GetMapping
    public List<IdentificacionModel> obtenerIdentificaciones(){
        return identificacionService.getAll();
    }

    @PostMapping
    public IdentificacionModel guardarIdentificacion(@RequestBody IdentificacionModel identificacion){
        return identificacionService.guardar(identificacion);
    }
}
