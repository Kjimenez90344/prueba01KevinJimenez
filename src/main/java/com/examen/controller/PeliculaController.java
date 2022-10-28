package com.examen.controller;

import com.examen.entity.Sala;
import com.examen.entity.Pelicula;
import com.examen.service.ISalaService;

import com.examen.service.IPeliculaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PeliculaController {

    @Autowired
    private IPeliculaService peliculaService;

    @Autowired
    private ISalaService salaService;

    @GetMapping("/pelicula")
    public String index(Model model) {
        List<Pelicula> listaPelicula = peliculaService.getAllMovie();
        model.addAttribute("titulo", "Tabla Peliculas");/*EN EL HTML SUSTITUYE TITULO POR TABLA PERSONAS*/
        model.addAttribute("peliculas", listaPelicula);
        return "pelicula";/*envia el archivo html*/
    }

    @GetMapping("/peliculaN")/*GET*/
    public String crearPelicula(Model model) {
        List<Sala> listaSalas = salaService.listRoom();
        model.addAttribute("pelicula", new Pelicula());
        model.addAttribute("salas", listaSalas);
        return "crear";
    }

    @PostMapping("/save")
    public String guardarPelicula(@ModelAttribute Pelicula pelicula) {
        peliculaService.saveMovie(pelicula);
        return "redirect:/pelicula";
    }

    @GetMapping("/editPelicula/{id}")
    public String editarPelicula(@PathVariable("id") Long idPelicula, Model model) {
        Pelicula pelicula = peliculaService.getMovieById(idPelicula);
        List<Sala> listaSalas = salaService.listRoom();
        model.addAttribute("sala", pelicula);
        model.addAttribute("salas", listaSalas);
        return "crear";
    }

    @GetMapping("/delete/{id}")
    public String eliminarPelicula(@PathVariable("id") Long idPelicula) {
        peliculaService.delete(idPelicula);
        return "redirect:/pelicula";
    }

}
