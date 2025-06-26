package com.examen.TestAPI.repository;

import com.examen.TestAPI.entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioProyectoRepository extends JpaRepository<Proyecto, Integer> {

    @Query("SELECT u.nombre\n" +
            "FROM usuario_proyecto up\n" +
            "JOIN usuario u ON up.usuario_id = u.id\n" +
            "WHERE up.proyecto_id = :usuario_id")
    List<Proyecto> findAllUsuariosProyecto(@Param("usuario_id") Integer usuario_id);

    @Query("SELECT p.nombre\n" +
            "FROM usuario_proyecto up\n" +
            "JOIN proyecto p ON up.proyecto_id = p.id\n" +
            "WHERE up.usuario_id = :proyecto_id")
    List<Proyecto> findAllProyectosUsuario(@Param("proyecto_id") Integer proyecto_id);
}