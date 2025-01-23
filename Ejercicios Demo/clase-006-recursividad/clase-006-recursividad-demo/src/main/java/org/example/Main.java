package org.example;

import org.example.entities.Movie;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Movie> listadoMovies = new ArrayList<>();
        listadoMovies.add(new Movie(1,"Pelicula1", 8.8,5,200));
        listadoMovies.add(new Movie(2,"Pelicula2", 9.8,2,250));
        listadoMovies.add(new Movie(3,"Pelicula3", 7.8,1,290));
        listadoMovies.add(new Movie(4,"Pelicula4", 5.8,4,210));
        listadoMovies.add(new Movie(5,"Pelicula5", 4.8,1,230));


 /*       double promedio =  Movie.calcularPromedioRating(listadoMovies, 0, 0.0);
        System.out.println("promedio de rating: " + promedio);*/

        String tituloBuscado = "Pelicula5";

        Movie peliculaEncontrada = Movie.buscarPeliculaPorTitulo(listadoMovies, 0, tituloBuscado);

/*
        System.out.println("Pelicula encontrada : " + peliculaEncontrada.getTitle() + " y sus premios son " + peliculaEncontrada.getAwards());
*/

        System.out.println(Movie.buscarPeliculaPorTituloStreams(listadoMovies, tituloBuscado).toString());

    }
}