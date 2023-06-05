package com.proyecto.proyecto.controllers;

import com.proyecto.proyecto.dto.AvionDTO;
import com.proyecto.proyecto.dto.MensajeDTO;
import com.proyecto.proyecto.models.AvionModel;
import com.proyecto.proyecto.services.AvionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avion")
public class AvionController {
    @Autowired
    AvionService avionService;

    @GetMapping
    public ResponseEntity<List<AvionModel>> obtenerAviones(){
        List<AvionModel> lista =  avionService.obtenerAviones();
        return new ResponseEntity(lista, HttpStatus.OK);
    }

    @GetMapping("/detalle/{id}")
    public ResponseEntity<AvionModel> getAvion(@PathVariable("id") int id){
        if(!avionService.existById(id)){
            return new ResponseEntity(new MensajeDTO("El avion no existe."), HttpStatus.NOT_FOUND);
        }
        AvionModel avionModel = avionService.getAvion(id);
        return new ResponseEntity<>(avionModel, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> guardarAvion(@RequestBody AvionDTO avion){
        AvionModel avionModel = new AvionModel(avion.getId(),avion.getAsientos(),avion.getNombre());
        avionService.guardarAvion(avionModel);
        return new ResponseEntity(new MensajeDTO("Registro guardado."), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateAvion(@PathVariable("id") int id, @RequestBody AvionDTO avion){
        if(!avionService.existById(id)){
            return new ResponseEntity(new MensajeDTO("El avion no existe."), HttpStatus.NOT_FOUND);
        }

        AvionModel avionModel = avionService.getAvion(id);
        avionModel.setAsientos(avion.getAsientos());
        avionModel.setNombre(avion.getNombre());
        avionService.guardarAvion(avionModel);
        return new ResponseEntity(new MensajeDTO("Actualización satisfactoria."), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> eliminarAvion(@PathVariable("id") int id){
        if(!avionService.existById(id)){
            return new ResponseEntity(new MensajeDTO("El avion no existe."), HttpStatus.NOT_FOUND);
        }
        avionService.deteleById(id);
        return new ResponseEntity(new MensajeDTO("El avion fue eliminado."), HttpStatus.OK);
    }
}
