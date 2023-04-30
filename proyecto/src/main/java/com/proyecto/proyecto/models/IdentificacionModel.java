package com.proyecto.proyecto.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "identificacion")
public class IdentificacionModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",unique = true,nullable = false)
    private int id;
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "identificacion_id", referencedColumnName = "id")
    private List<PersonaModel> personaModel;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
