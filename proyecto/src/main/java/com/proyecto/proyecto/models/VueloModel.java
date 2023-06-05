package com.proyecto.proyecto.models;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import java.time.LocalDateTime;

@Entity
@Table(name = "vuelo")
@Data
public class VueloModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "destino", nullable = false)
    private String destino;

    @Column(name = "llegada", nullable = false)
    private LocalDateTime llegada;

    @Column(name = "origen", nullable = false)
    private String origen;

    @Column(name = "salida", nullable = false)
    private LocalDateTime salida;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "avion_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private AvionModel avion;

    public VueloModel(int id, String destino, LocalDateTime llegada, String origen, LocalDateTime salida, AvionModel avion) {
        this.id = id;
        this.destino = destino;
        this.llegada = llegada;
        this.origen = origen;
        this.salida = salida;
        this.avion = avion;
    }
}

