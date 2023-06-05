package com.proyecto.proyecto.models;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "avion")
@Data
public class AvionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "asientos", nullable = false)
    private int asientos;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    public AvionModel() {
    }

    public AvionModel(int id, int asientos, String nombre) {
        this.id = id;
        this.asientos = asientos;
        this.nombre = nombre;
    }
}
