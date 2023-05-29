package com.proyecto.proyecto.services;

import com.proyecto.proyecto.models.AvionModel;
import com.proyecto.proyecto.repositories.AvionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvionService {
    @Autowired
    AvionRepository avionRepository;

    public List<AvionModel> obtenerAviones(){ return avionRepository.findAll();}
    public AvionModel getAvion(int id){
        return avionRepository.findById(id).get();
    }
    public boolean existById(int id){
        return avionRepository.existsById(id);
    }
    public AvionModel guardarAvion(AvionModel avion){
        return avionRepository.save(avion);
    }
    public void deteleById(int id){
        avionRepository.deleteById(id);
    }

}
