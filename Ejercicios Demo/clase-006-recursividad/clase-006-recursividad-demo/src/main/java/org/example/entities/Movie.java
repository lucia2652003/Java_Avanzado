package org.example.entities;

import java.util.List;
import java.util.Optional;

public class Movie {
    private Integer idMovie;
    private String title;
    private double rating;
    private Integer awards;
    private Integer length;

    public Movie() {
    }

    public Movie(Integer idMovie, String title, double rating, Integer awards, Integer length) {
        this.idMovie = idMovie;
        this.title = title;
        this.rating = rating;
        this.awards = awards;
        this.length = length;
    }

  


    public Integer getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(Integer idMovie) {
        this.idMovie = idMovie;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Integer getAwards() {
        return awards;
    }

    public void setAwards(Integer awards) {
        this.awards = awards;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    //Metodos propios

    public static double calcularPromedioRating(List<Movie> listadoMovies, int indice, double sumaPromedio) {
        //caso base
        if (listadoMovies.size() == indice) return sumaPromedio/ listadoMovies.size() ;
        //llamar recursion
        return calcularPromedioRating(listadoMovies, indice + 1, sumaPromedio + listadoMovies.get(indice).getRating());
    }

    public static Movie buscarPeliculaPorTitulo(List<Movie> listadoMovies, int indice, String tituloBuscado) {

        //caso base
        if (listadoMovies.size() == indice) return null;

        if (listadoMovies.get(indice).getTitle().equalsIgnoreCase(tituloBuscado)) {
            return listadoMovies.get(indice);
        }

        //llamar recursividad
        return buscarPeliculaPorTitulo(listadoMovies, indice + 1, tituloBuscado);
    }

    public static Movie buscarPeliculaPorTituloStreams(List<Movie> listadoMovies, String tituloBuscado) {
       Optional<Movie> peliculaEncontrada = listadoMovies.stream().filter(movie -> movie.getTitle().equalsIgnoreCase(tituloBuscado)).findFirst();

        if (peliculaEncontrada.isPresent()) return peliculaEncontrada.get();
            else return null;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "idMovie=" + idMovie +
                ", title='" + title + '\'' +
                ", rating=" + rating +
                ", awards=" + awards +
                ", length=" + length +
                '}';
    }
}
