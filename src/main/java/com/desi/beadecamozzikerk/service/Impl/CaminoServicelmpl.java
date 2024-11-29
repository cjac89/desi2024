package com.desi.beadecamozzikerk.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desi.beadecamozzikerk.domain.Camino;
import com.desi.beadecamozzikerk.domain.Camion;
import com.desi.beadecamozzikerk.domain.Ciudad;
import com.desi.beadecamozzikerk.repository.ICaminoRepository;
import com.desi.beadecamozzikerk.repository.ICiudadRepository;
import com.desi.beadecamozzikerk.service.ICaminoService;

import java.util.List;

@Service
public class CaminoServicelmpl implements ICaminoService {

    private final ICiudadRepository ciudadRepository = null;

    public List<Camion> obtenerCaminos(int codigoPostal) {
        // Validar si el código postal existe
        Ciudad ciudad = ciudadRepository.findByCodPostal(codigoPostal);
        if (ciudad == null) {
            // Lanzamos una excepción si no se encuentra la ciudad
            throw new IllegalArgumentException("Código postal no encontrado.");
        }

        // Obtener los caminos hacia las ciudades vecinas
        return ciudadRepository.findByCiudadDestino(ciudad.getNombre());
    }

	@Override
	public List<Camino> obtenerCaminos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ciudad getCiudadById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ciudad getCiudadByCodPostal(int codPostal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(Camino camino) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(Long id) {
		// TODO Auto-generated method stub
		
	}
}
