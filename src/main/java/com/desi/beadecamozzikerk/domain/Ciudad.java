package com.desi.beadecamozzikerk.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ciudades")
public class Ciudad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incrementar ID
	private Long id;

	@Column(unique = true, nullable = false, length = 4)
	private int codPostal;

	@Column(nullable = false)
	private String ciudad;
	
	@Column(nullable = false)
	private String provincia;
	
	@Column(name = "ciudad_destino") // O como sea que se llame en la base de datos
    private String ciudadDestino;

    // Getters y setters...
	

	public Ciudad() {
		super();
	}
	
	
	public String getCiudadDestino() {
		return ciudadDestino;
	}


	public void setCiudadDestino(String ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}


	public Ciudad(Long id, int codPostal, String cuidad, String provincia) {
		super();
		this.id = id;
		this.codPostal = codPostal;
		this.ciudad = cuidad;
		this.provincia = provincia;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String cuidad) {
		this.ciudad = cuidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	public Ciudad orElse1(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	public Ciudad orElse(Object object) {
		// TODO Auto-generated method stub
		return null;
	}
	
		

}
