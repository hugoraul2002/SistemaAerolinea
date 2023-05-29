package com.proyecto.proyecto.controllers;

import com.proyecto.proyecto.models.VueloModel;
import com.proyecto.proyecto.services.AvionService;
import com.proyecto.proyecto.services.VueloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vuelo")
public class VueloController {
    @Autowired
    VueloService vueloService;
    @GetMapping
    public ResponseEntity<List<VueloModel>> obtenerVuelos(){
        List<VueloModel> lista = vueloService.obtenerVuelos();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }
}
