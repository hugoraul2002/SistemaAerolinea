package com.proyecto.proyecto.services;

import com.proyecto.proyecto.models.IdentificacionModel;
import com.proyecto.proyecto.repositories.IdentificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdentificacionService {
    @Autowired
    IdentificacionRepository identificacionRepository;

    public List<IdentificacionModel> getAll(){
        return identificacionRepository.findAll();
    }

    public IdentificacionModel guardar(IdentificacionModel identificacion){
        return identificacionRepository.save(identificacion);
    }
}
