package com.proyecto.proyecto.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "reserva")
@Data
public class ReservacionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "asiento", nullable = false)
    private String asiento;

    @Column(name = "clase", nullable = false)
    private String clase;

    @Column(name = "fecha", nullable = false)
    private LocalDateTime fecha;

    @Column(name = "hora_embarque", nullable = false)
    private LocalTime horaEmbarque;

    @Column(name = "puerta_embarque", nullable = false)
    private String puertaEmbarque;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pasajero_id", nullable = false)
    private PasajeroModel pasajero;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vuelo_id", nullable = false)
    private VueloModel vuelo;

}
