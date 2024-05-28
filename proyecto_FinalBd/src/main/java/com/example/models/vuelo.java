package com.example.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "vuelo")
public class vuelo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "numero_vuelo", nullable = false, length = 50)
	private Integer numero;

	@Column(name = "origen", nullable = false, length = 45)
	private String origen;

	@ManyToOne
	@JoinColumn(name = "ciudad_destino_id", referencedColumnName = "id")
	private ciudades ciudades;

	@Column(name = "fecha_hora", nullable = false)
	private LocalDateTime fecha_hora;

	@ManyToOne
	@JoinColumn(name = "piloto_id", referencedColumnName = "id")
	private piloto piloto;

	@ManyToOne
	@JoinColumn(name = "tripulacion_id", referencedColumnName = "id")
	private tripulacion tripulacion;

	@ManyToOne
	@JoinColumn(name = "avion_id", referencedColumnName = "id")
	private avion avion;

	public vuelo() {
		super();
	}

	public vuelo(Integer id, Integer numero, String origen, ciudades ciudades, LocalDateTime fecha_hora,
			com.example.models.piloto piloto, com.example.models.tripulacion tripulacion,
			com.example.models.avion avion) {
		super();
		this.id = id;
		this.numero = numero;
		this.origen = origen;
		this.ciudades = ciudades;
		this.fecha_hora = fecha_hora;
		this.piloto = piloto;
		this.tripulacion = tripulacion;
		this.avion = avion;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public ciudades getcCiudades() {
		return ciudades;
	}

	public void setCiudades(ciudades ciudades) {
		this.ciudades = ciudades;
	}

	public LocalDateTime getFecha_hora() {
		return fecha_hora;
	}

	public void setFecha_hora(LocalDateTime fecha_hora) {
		this.fecha_hora = fecha_hora;
	}

	public piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(piloto piloto) {
		this.piloto = piloto;
	}

	public tripulacion getTripulacion() {
		return tripulacion;
	}

	public void setTripulacion(tripulacion tripulacion) {
		this.tripulacion = tripulacion;
	}

	public avion getAvion() {
		return avion;
	}

	public void setAvion(avion avion) {
		this.avion = avion;
	}

}
