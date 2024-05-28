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
    
    // Consulta para obtener vuelos y aviones con origen Bogotá
    @Query("SELECT v FROM vuelo v WHERE v.origen = 'Bogotá'")
    List<vuelo> findVuelosByOrigenBogota();

    // Consulta para obtener vuelos y aviones con destino Neiva
    @Query("SELECT v FROM vuelo v WHERE v.ciudades.nombre = 'Neiva'")
    List<vuelo> findVuelosByDestinoNeiva();
    
    //método para obtener la cantidad de vuelos por destino en un mes específico:
    @Query("SELECT v.ciudades.nombre, COUNT(v) AS num_vuelos " +
            "FROM vuelo v " +
            "WHERE MONTH(v.fecha_hora) = :mes AND YEAR(v.fecha_hora) = :ano " +
            "GROUP BY v.ciudades.id " +
            "ORDER BY num_vuelos DESC")
     List<Object[]> findDestinoConMasVuelosEnMes(@Param("mes") int mes, @Param("ano") int ano);
    
    
}



