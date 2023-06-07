package com.proyecto.proyecto.controllers;

import com.proyecto.proyecto.models.AvionModel;
import com.proyecto.proyecto.models.PasajeroModel;
import com.proyecto.proyecto.models.ReservacionModel;
import com.proyecto.proyecto.services.PasajeroService;
import com.proyecto.proyecto.services.ReservacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservacion")
@CrossOrigin("*")
public class ReservacionController {
    @Autowired
    ReservacionService reservacionService;

    @GetMapping
    public ResponseEntity<List<ReservacionModel>> getReservaciones(){
        List<ReservacionModel> lista =  reservacionService.getReservaciones();
        return new ResponseEntity(lista, HttpStatus.OK);
    }

    @PostMapping
    public ReservacionModel saveReservacion(@RequestBody ReservacionModel reservacion){
        return reservacionService.saveReservacion(reservacion);
    }
}
