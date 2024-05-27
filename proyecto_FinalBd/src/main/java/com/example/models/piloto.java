package com.example.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "piloto")
public class piloto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",unique = true, nullable = false)
    private Integer id;

	@Column(name="identificacion", nullable=false, length = 10)
	private String identificacion;
	
	@Column(name="nombre", nullable=false, length = 45)
	private String nombre;

    @Column(name="apellido", nullable=false, length = 45)
	private String apellido;

    @Column(name="horas", nullable=false)
	private Integer horas;

    @ManyToOne
	@JoinColumn(name = "base", referencedColumnName = "id" )
	private base base;


	public piloto() {
		super();
	}


	public piloto(Integer id, String identificacion, String nombre, String apellido, Integer horas,
			com.example.models.base base) {
		super();
		this.id = id;
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.apellido = apellido;
		this.horas = horas;
		this.base = base;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getIdentificacion() {
		return identificacion;
	}


	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public Integer getHoras() {
		return horas;
	}


	public void setHoras(Integer horas) {
		this.horas = horas;
	}


	public base getBase() {
		return base;
	}


	public void setBase(base base) {
		this.base = base;
	}

	

	

}
