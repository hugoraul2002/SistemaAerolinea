package com.proyecto.proyecto.controllers;

import com.proyecto.proyecto.models.IdentificacionModel;
import com.proyecto.proyecto.models.PersonaModel;
import com.proyecto.proyecto.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {
    @Autowired
    PersonaService personaService;

    @GetMapping
    public List<PersonaModel> obtenerPersonas(){
        return personaService.obtenerPersonas();
    }

    @PostMapping
    public PersonaModel guardarPersona(@RequestBody PersonaModel persona){
        return personaService.guardarPersona(persona);
    }

}
