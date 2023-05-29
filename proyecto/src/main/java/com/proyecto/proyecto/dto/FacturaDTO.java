package com.proyecto.proyecto.dto;
import java.time.LocalDateTime;

public class FacturaDTO {
    private int id;
    private String boletoFacturado;
    private String identificacionFacturado;
    private String clienteFacturado;
    private LocalDateTime fecha;
    private String metodoPago;
    private float total;
    private int reservacionId;

    // Constructores, getters y setters

    // Constructor vacío
    public FacturaDTO() {
    }

    // Constructor con todos los atributos
    public FacturaDTO(int id, String boletoFacturado, String identificacionFacturado, String clienteFacturado,
                      LocalDateTime fecha, String metodoPago, float total, int reservacionId) {
        this.id = id;
        this.boletoFacturado = boletoFacturado;
        this.identificacionFacturado = identificacionFacturado;
        this.clienteFacturado = clienteFacturado;
        this.fecha = fecha;
        this.metodoPago = metodoPago;
        this.total = total;
        this.reservacionId = reservacionId;
    }

    // Getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBoletoFacturado() {
        return boletoFacturado;
    }

    public void setBoletoFacturado(String boletoFacturado) {
        this.boletoFacturado = boletoFacturado;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getReservacionId() {
        return reservacionId;
    }

    public void setReservacionId(int reservacionId) {
        this.reservacionId = reservacionId;
    }
}
