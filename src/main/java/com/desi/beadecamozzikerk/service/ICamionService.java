package com.desi.beadecamozzikerk.service;

import java.util.List;

import com.desi.beadecamozzikerk.domain.Camion;

public interface ICamionService {
	void guardar(Camion camion);

	List<Camion> getCamiones();

	Camion getCamionPorId(Long id);

	void borrar(Long id);
}
