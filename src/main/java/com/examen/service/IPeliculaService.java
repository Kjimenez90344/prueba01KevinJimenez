package com.examen.service;

import com.examen.entity.Pelicula;
import java.util.List;

public interface IPeliculaService {
    public List<Pelicula> getAllMovie();
    public Pelicula getMovieById (long id);
    public void saveMovie(Pelicula pelicula);/*como guardo no necesito nada de retorno*/
    public void delete (long id);
}
