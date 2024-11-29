package com.desi.beadecamozzikerk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desi.beadecamozzikerk.domain.Camino;
import com.desi.beadecamozzikerk.domain.Camion;

import java.util.List;

public interface ICaminoRepository extends JpaRepository<Camino, String> {
    List<Camino> findByCiudadDestino(String ciudadDestino);
}
