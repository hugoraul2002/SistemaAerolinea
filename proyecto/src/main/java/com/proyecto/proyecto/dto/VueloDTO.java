package com.proyecto.proyecto.dto;

import java.time.LocalDateTime;

public class VueloDTO {
    private int id;
    private String destino;
    private LocalDateTime llegada;
    private String origen;
    private LocalDateTime salida;
    private int avionId;

    // Constructores, getters y setters

    // Constructor vacío
    public VueloDTO() {
    }

    // Constructor con todos los atributos
    public VueloDTO(int id, String destino, LocalDateTime llegada, String origen, LocalDateTime salida, int avionId) {
        this.id = id;
        this.destino = destino;
        this.llegada = llegada;
        this.origen = origen;
        this.salida = salida;
        this.avionId = avionId;
    }

    // Getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDateTime getLlegada() {
        return llegada;
    }

    public void setLlegada(LocalDateTime llegada) {
        this.llegada = llegada;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public LocalDateTime getSalida() {
        return salida;
    }

    public void setSalida(LocalDateTime salida) {
        this.salida = salida;
    }

    public int getAvionId() {
        return avionId;
    }

    public void setAvionId(int avionId) {
        this.avionId = avionId;
    }
}

