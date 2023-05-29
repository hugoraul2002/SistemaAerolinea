package com.proyecto.proyecto.models;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "factura")
@Data
public class FacturaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "boleto_facturado", nullable = false)
    private String boletoFacturado;

    @Column(name = "fecha", nullable = false)
    private LocalDateTime fecha;

    @Column(name = "metodo_pago", nullable = false)
    private String metodoPago;

    @Column(name = "total", nullable = false)
    private float total;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reservacion_id", nullable = false)
    private ReservacionModel reservacion;

}

