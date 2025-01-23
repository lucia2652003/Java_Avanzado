package org.example.controllers;

import org.example.entities.Movie;
import org.example.persistence.GenericoJPA;

import java.util.List;
import java.util.Optional;

public class MovieController {

    GenericoJPA genericoJPA = new GenericoJPA<>(Movie.class);

    public void create(Movie nueva) {
        genericoJPA.createGenerico(nueva);
    }

    public Optional<Movie> findMovie(Integer idBuscar) {
        return genericoJPA.findOneGenerico(idBuscar);
    }

    public List<Movie> findAll() {
        return genericoJPA.findAllGenerico();
    }

    public void updateMovie(Movie peliculaAnt) {
        genericoJPA.updateGenerico(peliculaAnt);
    }

    public void delete(Integer idEliminar) {
        genericoJPA.deleteGenerico(idEliminar);
    }
}
