package com.proyecto.proyecto.services;

import com.proyecto.proyecto.models.PasajeroModel;
import com.proyecto.proyecto.repositories.PasajeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasajeroService {
    @Autowired
    PasajeroRepository pasajeroRepository;

    public List<PasajeroModel> obtenerPersonas(){
        return pasajeroRepository.findAll();
    }

    public PasajeroModel savePasajero(PasajeroModel pasajero){
        return pasajeroRepository.save(pasajero);
    }
}
