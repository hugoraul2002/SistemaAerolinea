package com.proyecto.proyecto.services;

import com.proyecto.proyecto.models.PersonaModel;
import com.proyecto.proyecto.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {
    @Autowired
    PersonaRepository personaRepository;

    public List<PersonaModel> obtenerPersonas(){
        return personaRepository.findAll();
    }

    public PersonaModel guardarPersona(PersonaModel persona){
        return personaRepository.save(persona);
    }
}
