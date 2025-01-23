package org.example.controllers;

import org.example.entities.Actor;
import org.example.persistence.GenericoJPA;

import java.util.List;
import java.util.Optional;

public class ActorController {

    GenericoJPA genericoJPA = new GenericoJPA<>(Actor.class);

    public void create(Actor nuevoRegistro) {
        genericoJPA.createGenerico(nuevoRegistro);
    }

    public Optional<Actor> findOne(Integer idBuscar) {
        return genericoJPA.findOneGenerico(idBuscar);
    }

    public List<Actor> findAll() {
        return genericoJPA.findAllGenerico();
    }

    public void updateActor(Actor actorAnt) {
        genericoJPA.updateGenerico(actorAnt);
    }

    public void delete(Integer idEliminar) {
        genericoJPA.deleteGenerico(idEliminar);
    }
}
