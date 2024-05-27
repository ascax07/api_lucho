package com.example.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "base")
public class base {

        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name="id", unique = true, nullable = false)
    private Integer id;

	@Column(name="nombre", nullable=false, length = 45)
	private String nombre;

    @Column(name="direccion", nullable=false, length = 45)
	private String direccion;



	public base() {
		super();
	
    }

    public base(Integer id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}