package com.desi.beadecamozzikerk.service;

import java.util.List;

//import org.springframework.stereotype.Service;

import com.desi.beadecamozzikerk.domain.Ciudad;


public interface ICiudadService {
	List<Ciudad> getCiudades();

	Ciudad getCiudadById(Long id);

	Ciudad getCiudadByCodPostal(int codPostal);

	
}
