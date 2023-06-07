package com.proyecto.proyecto.models;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "pasajero")
@Data
public class PasajeroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nacimiento", nullable = false)
    private Date nacimiento;

    @Column(name = "nacionalidad", nullable = false)
    private String nacionalidad;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "sexo", nullable = false)
    private String sexo;

    @Column(name = "telefono", nullable = false)
    private String telefono;

    @Column(name = "tipo_identificacion", nullable = false)
    private String tipoIdentificacion;

    @Column(name = "num_identificacion", nullable = false)
    private String numIdentificacion;

    @Column(name = "trato", nullable = false)
    private String trato;

}

