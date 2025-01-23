package org.example;

import org.example.controllers.*;
import org.example.entities.Actor;
import org.example.entities.Movie;

import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        MovieController moviecontroller = new MovieController();
        ActorController actorController = new ActorController();

        //Inserción de datos a BD
        Movie nueva = new Movie(null,"Titanic",6.3,6
                                , LocalDateTime.of(2023,5,12,15,30,0)
                                ,120, 2);

        moviecontroller.create(nueva);

        Actor nuevoActor = new Actor(null, "Lucia","Poméz", LocalDate.of(2003,5,26));
        actorController.create(nuevoActor);

        // Buscar movie
        int idBuscar = 2;
        /*Optional<Actor> buscado = actorController.findOne(idBuscar);
        System.out.println(buscado.get());*/
        /*Movie movieEncontrada = moviecontroller.findMovie(idBuscar);
        System.out.println(movieEncontrada);*/

        //Mostrar todas las peliculas
         /*List<Movie> peliculas =moviecontroller.findAll();

         for(Movie pelicula : peliculas){
            System.out.println(pelicula);
         }// fin for

         List<Actor> actores = actorController.findAll();
         actores.forEach(System.out::println);*/
        //Actualizar un movie
        /*Movie peliculaAnt = moviecontroller.findMovie(6);
        System.out.println("Antes \n "+peliculaAnt);
        peliculaAnt.setTitle("Jumanji");
        moviecontroller.updateMovie(peliculaAnt); //Actualizar el título en la DB
        System.out.println(peliculaAnt);*/

        /*Optional<Actor> encontrado = actorController.findOne(1);
        encontrado.ifPresent(elemento -> elemento.setFirstname("Axel"));
        actorController.updateActor(encontrado.get());*/
        //Eliminar movie
        //moviecontroller.delete(idBuscar);
        //actorController.delete(1);
    }
}