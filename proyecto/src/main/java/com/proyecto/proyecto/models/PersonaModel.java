package com.proyecto.proyecto.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "persona")
public class PersonaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String telefono;
    private String trato;
    private String nacionalidad;
    private Date nacimiento;
    private String sexo;

    public PersonaModel(int id, String nombre, String telefono, String trato, String nacionalidad, Date nacimiento, String sexo) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.trato = trato;
        this.nacionalidad = nacionalidad;
        this.nacimiento = nacimiento;
        this.sexo = sexo;
    }

    public PersonaModel() {
    }

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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTrato() {
        return trato;
    }

    public void setTrato(String trato) {
        this.trato = trato;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
