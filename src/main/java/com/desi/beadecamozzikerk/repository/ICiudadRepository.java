package com.desi.beadecamozzikerk.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desi.beadecamozzikerk.domain.Camion;
import com.desi.beadecamozzikerk.domain.Ciudad;

@Repository
public interface ICiudadRepository extends JpaRepository<Ciudad, Long> {
    Ciudad findByCodPostal(int codigoPostal);

	List<Camion> findByCiudadDestino(String nombre);
}
