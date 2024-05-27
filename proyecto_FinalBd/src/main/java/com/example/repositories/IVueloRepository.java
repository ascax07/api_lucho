package com.example.repositories;


import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.models.vuelo;


@Repository
public interface IVueloRepository  extends CrudRepository<vuelo, Integer>{
    
    // Metodo para obtener Información de los pilotos y aviones que volaron en un rango de fechas específicas
	@Query("SELECT v FROM vuelo v WHERE v.fecha_hora BETWEEN :startDate AND :endDate")
    List<vuelo> findVuelosByFechaHoraBetween(@Param("startDate") LocalDateTime startDate, @Param("endDate") LocalDateTime endDate);
}



