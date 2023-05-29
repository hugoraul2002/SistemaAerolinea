package com.proyecto.proyecto.dto;
import java.time.LocalDateTime;

public class ReservacionDTO {
    private int id;
    private String asiento;
    private String clase;
    private LocalDateTime fecha;
    private LocalDateTime horaEmbarque;
    private String puertaEmbarque;
    private int pasajeroId;
    private int vueloId;

    // Constructores, getters y setters

    // Constructor vacío
    public ReservacionDTO() {
    }

    // Constructor con todos los atributos
    public ReservacionDTO(int id, String asiento, String clase, LocalDateTime fecha, LocalDateTime horaEmbarque,
                      String puertaEmbarque, int pasajeroId, int vueloId) {
        this.id = id;
        this.asiento = asiento;
        this.clase = clase;
        this.fecha = fecha;
        this.horaEmbarque = horaEmbarque;
        this.puertaEmbarque = puertaEmbarque;
        this.pasajeroId = pasajeroId;
        this.vueloId = vueloId;
    }

    // Getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public LocalDateTime getHoraEmbarque() {
        return horaEmbarque;
    }

    public void setHoraEmbarque(LocalDateTime horaEmbarque) {
        this.horaEmbarque = horaEmbarque;
    }

    public String getPuertaEmbarque() {
        return puertaEmbarque;
    }

    public void setPuertaEmbarque(String puertaEmbarque) {
        this.puertaEmbarque = puertaEmbarque;
    }

    public int getPasajeroId() {
        return pasajeroId;
    }

    public void setPasajeroId(int pasajeroId) {
        this.pasajeroId = pasajeroId;
    }

    public int getVueloId() {
        return vueloId;
    }

    public void setVueloId(int vueloId) {
        this.vueloId = vueloId;
    }
}

