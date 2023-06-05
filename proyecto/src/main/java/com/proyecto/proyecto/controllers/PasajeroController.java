package com.proyecto.proyecto.controllers;

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

}
