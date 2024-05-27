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
@Table(name = "tripulacion")
public class tripulacion {

        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",unique = true, nullable = false)
    private Integer id;
    @Column(name="identificacion", nullable=false, length = 45)
	private String identificacion;

	@Column(name="nombre", nullable=false, length = 45)
	private String nombre;

    @Column(name="apellido", nullable=false, length = 45)
	private String apellido;

    
    @ManyToOne
	@JoinColumn(name = "base", referencedColumnName = "id")
	private base base;
    
	public tripulacion() {
		super();
	
    }

	public tripulacion(Integer id, String identificacion, String nombre, String apellido,
			com.example.models.base base) {
		super();
		this.id = id;
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.apellido = apellido;
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

	public base getBase() {
		return base;
	}

	public void setBase(base base) {
		this.base = base;
	}

	

}