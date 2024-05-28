package com.example.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InterfaceService.IVueloService;
import com.example.models.vuelo;
import com.example.repositories.IVueloRepository;

@Service
public class VueloServiceImpl implements IVueloService {
	@Autowired
	IVueloRepository repository;

	@Override
	public List<vuelo> findAll() {
		return (List<vuelo>) repository.findAll();
	}

	@Override
	public Optional<vuelo> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public vuelo save(vuelo vuelo) {
		return repository.save(vuelo);
	}

	@Override
	public Boolean delete(Integer id) {
		try {
			repository.deleteById(id);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	// Metodo para obtener Información de los pilotos y aviones que volaron en un
	// rango de fechas específicas

	@Override
	public List<vuelo> obtenerVuelosPorRangoDeFechas(LocalDateTime startDate, LocalDateTime endDate) {
		return repository.findVuelosByFechaHoraBetween(startDate, endDate);
	}

	// Información de los vuelos y aviones que tuvieron origen:
	@Override
	public List<vuelo> obtenerVuelosPorOrigenBogota() {
		return repository.findVuelosByOrigenBogota();
	}

	// Información de los vuelos y aviones que tuvieron desitno:
	@Override
	public List<vuelo> obtenerVuelosPorDestinoNeiva() {
		return repository.findVuelosByDestinoNeiva();
	}

	
	@Override
	public List<Object[]> obtenerDestinoConMasVuelosEnMes(int mes, int ano) {
		return repository.findDestinoConMasVuelosEnMes(mes, ano);
	}

}
