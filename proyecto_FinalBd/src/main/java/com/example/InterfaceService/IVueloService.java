package com.example.InterfaceService;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.example.models.vuelo;

public interface IVueloService {

	List<vuelo> findAll();

	Optional<vuelo> findById(Integer id);

	vuelo save(vuelo vuelo);

	Boolean delete(Integer id);

	List<vuelo> obtenerVuelosPorRangoDeFechas(LocalDateTime startDate, LocalDateTime endDate);
	
    //Información de los vuelos y aviones que tuvieron  origen:
	  List<vuelo> obtenerVuelosPorOrigenBogota();
	 
	 //Información de los vuelos y aviones que tuvieron  desitno:
	   List<vuelo> obtenerVuelosPorDestinoNeiva();
	   
	  
	  List<Object[]> obtenerDestinoConMasVuelosEnMes(int mes, int ano);
}
