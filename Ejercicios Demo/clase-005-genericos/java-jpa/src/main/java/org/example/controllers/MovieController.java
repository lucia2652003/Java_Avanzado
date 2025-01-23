package org.example.controllers;

import org.example.entities.Movie;
import org.example.persistence.GenericoJPA;

import java.util.List;
import java.util.Optional;

public class MovieController {

    GenericoJPA genericoJPA = new GenericoJPA<>(Movie.class);
    public void create(Movie nuevaPelicula) {
        genericoJPA.createGenerico(nuevaPelicula);
    }

    public Optional<Movie> findOne(Integer idBuscado) {
       return genericoJPA.findOneGenerico(idBuscado);
    }

    public List<Movie> findAll() {
        return genericoJPA.findAllGenerico();
    }

    public void update(Movie actualizarPelicula) {
        genericoJPA.updateGenerico(actualizarPelicula);
    }

    public void delete(Integer idEliminar) {
        genericoJPA.deleteGenerico(idEliminar);
    }
}
