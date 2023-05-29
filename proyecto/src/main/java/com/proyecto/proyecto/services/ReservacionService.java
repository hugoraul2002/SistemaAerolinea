package com.proyecto.proyecto.services;

import com.proyecto.proyecto.models.PasajeroModel;
import com.proyecto.proyecto.models.ReservacionModel;
import com.proyecto.proyecto.repositories.ReservacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservacionService {
    @Autowired
    ReservacionRepository reservacionRepository;

    public List<ReservacionModel> getReservaciones(){
        return reservacionRepository.findAll();
    }

    public ReservacionModel saveReservacion(ReservacionModel reservacion){
        return reservacionRepository.save(reservacion);
    }
}
