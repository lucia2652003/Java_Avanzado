package org.example.recursividad;

import org.example.recursividad.entities.Movie;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> listado = new ArrayList<>();
        listado.add(new Movie(1, "Titanic",8.8, 5, 200));
        listado.add(new Movie(2, "Regreso al Futuro",9.8, 2, 300));
        listado.add(new Movie(3, "After",7.8, 3, 156));
        listado.add(new Movie(4, "Shrek",5.8, 2, 178));
        listado.add(new Movie(5, "Sonic 2",4.8, 2, 142));

        double promedio = Movie.calcularPromedioRating(listado, 0, 0.0);
        System.out.println("El promedio de rating es "+promedio);

        Movie peliculaEncontrado = Movie.buscarPeliculaPorTitulo(listado,0, "After");
        System.out.println("Película encontrada: "+peliculaEncontrado.getTitle()+" y sus premios son "+peliculaEncontrado.getAwards());


        System.out.println(Movie.buscarPeliculaPorTituloStream(listado,"Titanic"));
    }
}
