package com.proyecto.proyecto.services;

import com.proyecto.proyecto.models.AvionModel;
import com.proyecto.proyecto.models.PasajeroModel;
import com.proyecto.proyecto.repositories.PasajeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasajeroService {
    @Autowired
    PasajeroRepository pasajeroRepository;

    public List<PasajeroModel> obtenerPasajeros(){
        return pasajeroRepository.findAll();
    }

    public PasajeroModel savePasajero(PasajeroModel pasajero){
        return pasajeroRepository.save(pasajero);
    }

    public PasajeroModel getPasajero(int id){
        return pasajeroRepository.findById(id).get();
    }
    public boolean existById(int id){
        return pasajeroRepository.existsById(id);
    }
    public PasajeroModel save(PasajeroModel pasajero){
        return pasajeroRepository.save(pasajero);
    }
    public void deteleById(int id){
        pasajeroRepository.deleteById(id);
    }
}
