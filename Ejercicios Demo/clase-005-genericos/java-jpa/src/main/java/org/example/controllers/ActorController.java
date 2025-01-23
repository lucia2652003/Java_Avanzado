package org.example.controllers;

import org.example.entities.Actor;
import org.example.entities.Movie;
import org.example.persistence.GenericoJPA;

import java.util.List;
import java.util.Optional;

public class ActorController {

    GenericoJPA genericoJPA = new GenericoJPA<>(Actor.class);

    public void create(Actor nuevoRegistro) {
        genericoJPA.createGenerico(nuevoRegistro);
    }

    public Optional<Actor> findOne(Integer idBuscado) {
        return genericoJPA.findOneGenerico(idBuscado);
    }

    public List<Actor> findAll() {
        return genericoJPA.findAllGenerico();
    }

    public void update(Actor actualizarRegistro) {
        genericoJPA.updateGenerico(actualizarRegistro);
    }

    public void delete(Integer idEliminar) {
        genericoJPA.deleteGenerico(idEliminar);
    }


}
