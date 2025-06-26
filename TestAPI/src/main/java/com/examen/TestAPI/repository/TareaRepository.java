package com.examen.TestAPI.repository;

import com.examen.TestAPI.entity.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TareaRepository extends JpaRepository<Tarea, Integer> {

    List<Tarea> findByEstado(Tarea.TareaEstado estado);

    List<Tarea> findByPrioridad(Tarea.TareaPrioridad prioridad);

    List<Tarea> findByFechaVenc(LocalDate fecha_venc);

    @Query("SELECT t FROM tarea t WHERE t.proyecto = :proyecto_id")
    List<Tarea> findAllTareasProyecto(@Param("proyecto_id") Integer proyecto_id);

    @Query("SELECT t FROM tarea t WHERE t.usuario = :usuario_id")
    List<Tarea> findAllTareasUsuario(@Param("usuario_id") Integer usuario_id);
}
