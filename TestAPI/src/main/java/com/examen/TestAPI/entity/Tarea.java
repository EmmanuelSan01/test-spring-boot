package com.examen.TestAPI.entity;

import jakarta.persistence.*;
import net.minidev.json.annotate.JsonIgnore;

import java.time.LocalDate;

@Entity
@Table(name = "tarea")
public class Tarea {
    public enum TareaPrioridad {
        BAJA("Baja"),
        MEDIA("Media"),
        ALTA("Alta");

        private final String displayName;

        TareaPrioridad(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return displayName;
        }
    }

    public enum TareaEstado {
        PENDIENTE("Pendiente"),
        EN_PROGRESO("En Progreso"),
        COMPLETADA("Completada"),
        CANCELADA("Cancelada");

        private final String displayName;

        TareaEstado(String displayName) {
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

    @Enumerated(EnumType.STRING)
    @Column(name = "prioridad", nullable = false)
    private Tarea.TareaPrioridad prioridad = Tarea.TareaPrioridad.MEDIA;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false)
    private Tarea.TareaEstado estado = Tarea.TareaEstado.PENDIENTE;

    @Column(nullable = false)
    private LocalDate fecha_venc;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "proyecto_id", nullable = false)
    private Proyecto proyecto;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;
}
