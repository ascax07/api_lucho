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
@Table(name = "avion")
public class avion {

        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",unique = true, nullable = false)
    private Integer id;

	@Column(name="tipo", nullable=false, length = 45)
	private String tipo;

    @ManyToOne
	@JoinColumn(name = "base", referencedColumnName = "id")
	private base base;

	public avion() {
		super();
	
    }

	public avion(Integer id, String tipo, com.example.models.base base) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.base = base;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public base getBase() {
		return base;
	}

	public void setBase(base base) {
		this.base = base;
	}

   
}
