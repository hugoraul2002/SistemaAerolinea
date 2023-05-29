package com.proyecto.proyecto.controllers;

import com.proyecto.proyecto.models.FacturaModel;
import com.proyecto.proyecto.models.ReservacionModel;
import com.proyecto.proyecto.services.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/factura")
public class FacturaController {
    @Autowired
    FacturaService facturaService;

    @GetMapping
    public ResponseEntity<List<FacturaModel>> getFacturas(){
        List<FacturaModel> lista =  facturaService.getFacturas();
        return new ResponseEntity(lista, HttpStatus.OK);
    }
}
