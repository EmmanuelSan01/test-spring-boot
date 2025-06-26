package com.examen.TestAPI.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "proyecto")
public class Proyecto {
    enum EstadoProyecto {
        ACTIVO("Activo"),
        FINALIZADO("Finalizado"),
        CANCELADO("Cancelado");

        private final String displayName;

        EstadoProyecto(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return displayName;
        }
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String descripcion;

    @Column(nullable = false)
    private LocalDate fecha_inicio;

    @Column(nullable = false)
    private LocalDate fecha_fin;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false)
    private EstadoProyecto estado = EstadoProyecto.ACTIVO;
}
