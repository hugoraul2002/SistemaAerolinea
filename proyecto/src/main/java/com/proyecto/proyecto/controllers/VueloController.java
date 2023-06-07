package com.proyecto.proyecto.controllers;

import com.proyecto.proyecto.dto.AvionDTO;
import com.proyecto.proyecto.dto.MensajeDTO;
import com.proyecto.proyecto.dto.VueloDTO;
import com.proyecto.proyecto.models.AvionModel;
import com.proyecto.proyecto.models.VueloModel;
import com.proyecto.proyecto.services.AvionService;
import com.proyecto.proyecto.services.VueloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vuelo")
@CrossOrigin("*")
public class VueloController {
    @Autowired
    VueloService vueloService;
    @GetMapping
    public ResponseEntity<List<VueloModel>> obtenerVuelos(){
        List<VueloModel> lista = vueloService.obtenerVuelos();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> eliminarVuelo(@PathVariable("id") int id){
        if(!vueloService.existById(id)){
            return new ResponseEntity(new MensajeDTO("El registro no existe."), HttpStatus.NOT_FOUND);
        }
        vueloService.deteleById(id);
        return new ResponseEntity(new MensajeDTO("El registro fue eliminado."), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody VueloModel vuelo){
        vueloService.guardar(vuelo);
        return new ResponseEntity(new MensajeDTO("Registro guardado."), HttpStatus.OK);
    }


}
