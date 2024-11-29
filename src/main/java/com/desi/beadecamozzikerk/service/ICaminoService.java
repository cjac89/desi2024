package com.desi.beadecamozzikerk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desi.beadecamozzikerk.domain.Camino;
import com.desi.beadecamozzikerk.domain.Ciudad;
import com.desi.beadecamozzikerk.repository.ICaminoRepository;
import com.desi.beadecamozzikerk.repository.ICiudadRepository;

import java.util.List;
import java.util.Optional;


public interface ICaminoService {


		List<Camino> obtenerCaminos();
	 
		Ciudad getCiudadById(Long id);
	 
		Ciudad getCiudadByCodPostal(int codPostal);

		void guardar(Camino camino);

		void borrar(Long id);

	}
	 
	
	
	
	
