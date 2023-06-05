package com.proyecto.proyecto.services;

import com.proyecto.proyecto.models.AvionModel;
import com.proyecto.proyecto.models.VueloModel;
import com.proyecto.proyecto.repositories.VueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VueloService {
    @Autowired
    VueloRepository vueloRepository;
    @Autowired
    AvionService avionService;

    public List<VueloModel> obtenerVuelos(){
        return vueloRepository.findAll();
    }

    public VueloModel getAvion(int id){
        return vueloRepository.findById(id).get();
    }
    public boolean existById(int id){
        return vueloRepository.existsById(id);
    }
    public VueloModel guardar(VueloModel vuelo){
        return vueloRepository.save(vuelo);
    }
    public void deteleById(int id){
        vueloRepository.deleteById(id);
    }
}
