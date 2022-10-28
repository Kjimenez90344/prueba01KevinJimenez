package com.examen.repository;

import com.examen.entity.Pelicula;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends CrudRepository<Pelicula, Long> {/*le mando la persona (cass) *, no hay que hacer nada porque el crud se hereda*/

}