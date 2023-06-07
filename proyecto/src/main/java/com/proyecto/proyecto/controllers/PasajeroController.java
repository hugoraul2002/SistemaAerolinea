package com.proyecto.proyecto.controllers;

import com.proyecto.proyecto.dto.MensajeDTO;
import com.proyecto.proyecto.models.AvionModel;
import com.proyecto.proyecto.models.PasajeroModel;
import com.proyecto.proyecto.services.PasajeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pasajero")
@CrossOrigin("*")
public class PasajeroController {
    @Autowired
    PasajeroService pasajeroService;

    @GetMapping
    public ResponseEntity<List<PasajeroModel>> obtenerPersonas(){
            List<PasajeroModel> lista =  pasajeroService.obtenerPasajeros();
        return new ResponseEntity(lista, HttpStatus.OK);
    }

    @PostMapping
    public PasajeroModel savePasajero(@RequestBody PasajeroModel pasajero){
        return pasajeroService.savePasajero(pasajero);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> eliminar(@PathVariable("id") int id){
        if(!pasajeroService.existById(id)){
            return new ResponseEntity(new MensajeDTO("El registro no existe."), HttpStatus.NOT_FOUND);
        }
        pasajeroService.deteleById(id);
        return new ResponseEntity(new MensajeDTO("El registro fue eliminado."), HttpStatus.OK);
    }

}
