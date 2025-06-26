package com.examen.TestAPI.entity;

import jakarta.persistence.*;
import net.minidev.json.annotate.JsonIgnore;

@Entity
@Table(name = "usuario_proyecto")
public class UsuarioProyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "proyecto_id", nullable = false)
    private Proyecto proyecto;
}
