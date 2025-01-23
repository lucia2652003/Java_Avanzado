package org.example;

import org.example.controllers.ActorController;
import org.example.controllers.MovieController;
import org.example.entities.Actor;
import org.example.entities.Movie;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        // TODO: 21/12/2024 Traer el controlador 
        ActorController actorController = new ActorController();

        // TODO: 21/12/2024  Crear Nuevo Elemento Generico (Pelicula, Actores)
        /*Actor nuevoActor = new Actor(null,"Maite", "Albenca", LocalDate.of(1984, 6, 5));
        actorController.create(nuevoActor);*/
        
        // TODO: 21/12/2024  Buscar Un Elemento Generico (Pelicula, Actores)
      /*  Integer idBuscado = 2;
        Optional<Actor> actor = actorController.findOne(idBuscado);
        System.out.println(actor.get());*/
        
        // TODO: 21/12/2024  Buscar Todos los Elemento Generico (Pelicula, Actores)
       /*List<Actor> listadoFindAll =  actorController.findAll();

        for (Actor elemento: listadoFindAll) {
            System.err.println(elemento);
        }*/

        
        // TODO: 21/12/2024  Actualizar Un Elemento Generico (Pelicula, Actores)
       /* Integer idActualizar = 1;
        Optional<Actor> actualizarElemento = actorController.findOne(idActualizar);
        actualizarElemento.ifPresent(elemento -> elemento.setFirstname("Axcel"));
        actorController.update(actualizarElemento.get());
        */
        // TODO: 21/12/2024  Eliminar Un Elemento Generico (Pelicula, Actores)
        Integer idEliminar = 1;
        actorController.delete(idEliminar);
    }
}