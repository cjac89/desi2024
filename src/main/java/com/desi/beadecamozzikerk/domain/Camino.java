package com.desi.beadecamozzikerk.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "caminos")
public class Camino {
    @Id
    private String id;
    private String ciudadOrigen;
    private String ciudadDestino;
    private String estadoCamino;
    private String estadoClima;

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public String getEstadoCamino() {
        return estadoCamino;
    }

    public void setEstadoCamino(String estadoCamino) {
        this.estadoCamino = estadoCamino;
    }

    public String getEstadoClima() {
        return estadoClima;
    }

    public void setEstadoClima(String estadoClima) {
        this.estadoClima = estadoClima;
    }

	public String getCiudadOrigen() {
		return ciudadOrigen;
	}

	public void setCiudadOrigen(String ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}
}
