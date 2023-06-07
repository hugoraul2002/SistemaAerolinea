package com.proyecto.proyecto.controllers;

import com.proyecto.proyecto.dto.MensajeDTO;
import com.proyecto.proyecto.models.FacturaModel;
import com.proyecto.proyecto.models.ReservacionModel;
import com.proyecto.proyecto.models.VueloModel;
import com.proyecto.proyecto.services.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/factura")
@CrossOrigin("*")
public class FacturaController {
    @Autowired
    FacturaService facturaService;



    @GetMapping
    public ResponseEntity<List<FacturaModel>> getFacturas(){
        List<FacturaModel> lista =  facturaService.getFacturas();
        return new ResponseEntity(lista, HttpStatus.OK);
    }

   @GetMapping("/detalle/{id}")
    public ResponseEntity<FacturaModel> getOne(@PathVariable("id") int id){
        if(!facturaService.existById(id)){
            return new ResponseEntity(new MensajeDTO("El registro no existe."), HttpStatus.NOT_FOUND);
        }
        FacturaModel facturaModel = facturaService.get(id);
        return new ResponseEntity<>(facturaModel, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> eliminar(@PathVariable("id") int id){
        if(!facturaService.existById(id)){
            return new ResponseEntity(new MensajeDTO("El registro no existe."), HttpStatus.NOT_FOUND);
        }
        facturaService.deteleById(id);
        return new ResponseEntity(new MensajeDTO("El registro fue eliminado."), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody FacturaModel factura){
        facturaService.save(factura);
        return new ResponseEntity(new MensajeDTO("Registro guardado."), HttpStatus.OK);
    }
}
