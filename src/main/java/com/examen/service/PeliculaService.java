package com.examen.service;

import com.examen.entity.Pelicula;
import com.examen.repository.PeliculaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeliculaService implements IPeliculaService {

    @Autowired
    private PeliculaRepository personaRepository;

    @Override
    public List<Pelicula> getAllMovie() {
        return (List<Pelicula>) personaRepository.findAll();
    }

    @Override
    public Pelicula getMovieById(long id) {
        return personaRepository.findById(id).orElse(null);/*si el registro no existe en la DB retorna nulo*/
    }

    @Override
    public void saveMovie(Pelicula pelicula) {
        personaRepository.save(pelicula);
    }

    @Override
    public void delete(long id) {
        personaRepository.deleteById(id);
    }
}