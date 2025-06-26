package com.examen.TestAPI.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
    public enum UsuarioRol {
        ADMINISTRADOR("Administrador"),
        COLABORADOR("Colaborador");

        private final String displayName;

        UsuarioRol(String displayName) {
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

    @Column(unique = true, nullable = false)
    private String correo;

    @Column(nullable = false)
    private String contrasena; // Encriptada con BCrypt

    @Enumerated(EnumType.STRING)
    @Column(name = "rol", nullable = false)
    private Usuario.UsuarioRol rol = UsuarioRol.COLABORADOR;

    public Usuario() {
    }

    public Usuario(Integer id, String nombre, String correo, String contrasena, UsuarioRol rol) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public UsuarioRol getRol() {
        return rol;
    }

    public void setRol(UsuarioRol rol) {
        this.rol = rol;
    }
}
