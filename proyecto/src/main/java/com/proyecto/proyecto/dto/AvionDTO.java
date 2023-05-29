package com.proyecto.proyecto.dto;

public class AvionDTO {
    private int id;
    private int asientos;
    private String nombre;

    // Constructores, getters y setters

    // Constructor vacío
    public AvionDTO() {
    }

    // Constructor con todos los atributos
    public AvionDTO(int id, int asientos, String nombre) {
        this.id = id;
        this.asientos = asientos;
        this.nombre = nombre;
    }

    // Getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

