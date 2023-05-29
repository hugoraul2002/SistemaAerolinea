package com.proyecto.proyecto.services;

import com.proyecto.proyecto.models.VueloModel;
import com.proyecto.proyecto.repositories.VueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VueloService {
    @Autowired
    VueloRepository vueloRepository;

    public List<VueloModel> obtenerVuelos(){
        return vueloRepository.findAll();
    }
}
