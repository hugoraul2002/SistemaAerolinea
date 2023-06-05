package com.proyecto.proyecto.services;

import com.proyecto.proyecto.models.AvionModel;
import com.proyecto.proyecto.models.FacturaModel;
import com.proyecto.proyecto.repositories.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaService {
    @Autowired
    FacturaRepository facturaRepository;

    public List<FacturaModel> getFacturas(){
        return facturaRepository.findAll();
    }

    public boolean existById(int id){
        return facturaRepository.existsById(id);
    }
    public FacturaModel save(FacturaModel factura){
        return facturaRepository.save(factura);
    }
    public FacturaModel get(int id){ return facturaRepository.getById(id);}
    public void deteleById(int id){
        facturaRepository.deleteById(id);
    }


}
