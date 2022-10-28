package com.examen.repository;

import com.examen.entity.Sala;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository/*Acá no se hace nada, solo se usa el patron decorador*/
public interface SalaRepository extends CrudRepository<Sala, Long> {/*Se le pasa el pais (clase)y el tipo de tributo de la PK*/
}
