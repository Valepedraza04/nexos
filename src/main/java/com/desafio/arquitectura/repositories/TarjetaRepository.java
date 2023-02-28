package com.desafio.arquitectura.repositories;

import java.util.Optional;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.desafio.arquitectura.models.Tarjeta;

@Repository
public interface TarjetaRepository extends CrudRepository<Tarjeta, Long> {

    Optional<Tarjeta> findByPAN(String pan);

    Optional<Tarjeta> findByIdAndEstado(Long id, String estado);

    Optional<Tarjeta> findById(Long id);
}


 