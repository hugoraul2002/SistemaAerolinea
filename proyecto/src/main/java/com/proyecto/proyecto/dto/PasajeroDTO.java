package com.proyecto.proyecto.dto;

import java.time.LocalDateTime;

public class PasajeroDTO {
    private int id;
    private LocalDateTime nacimiento;
    private String nacionalidad;
    private String nombre;
    private String sexo;
    private String telefono;
    private String tipoIdentificacion;
    private String numIdentificacion;
    private String trato;

    // Constructores, getters y setters

    // Constructor vacío
    public PasajeroDTO() {
    }

    // Constructor con todos los atributos
    public PasajeroDTO(int id, LocalDateTime nacimiento, String nacionalidad, String nombre, String sexo,
                       String telefono, String tipoIdentificacion, String numIdentificacion, String trato) {
        this.id = id;
        this.nacimiento = nacimiento;
        this.nacionalidad = nacionalidad;
        this.nombre = nombre;
        this.sexo = sexo;
        this.telefono = telefono;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numIdentificacion = numIdentificacion;
        this.trato = trato;
    }

    // Getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDateTime nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getNumIdentificacion() {
        return numIdentificacion;
    }

    public void setNumIdentificacion(String numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }

    public String getTrato() {
        return trato;
    }

    public void setTrato(String trato) {
        this.trato = trato;
    }
}

