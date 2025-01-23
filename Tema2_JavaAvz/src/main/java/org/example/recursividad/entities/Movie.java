package org.example.recursividad.entities;

import java.util.List;
import java.util.Optional;

public class Movie {
    private Integer idMovie;
    private String title;
    private double rating;
    private Integer awards;
    private Integer lenght;

    public Movie() {
    }

    public Movie(Integer idMovie, String title, double rating, Integer awards, Integer lenght) {
        this.idMovie = idMovie;
        this.title = title;
        this.rating = rating;
        this.awards = awards;
        this.lenght = lenght;
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

    public Integer getLenght() {
        return lenght;
    }

    public void setLenght(Integer lenght) {
        this.lenght = lenght;
    }

    //Métodos propios

    public static double calcularPromedioRating(List<Movie> listado, int indice, double sumaPromedio) {
        //caso base
        if(listado.size() == indice) return sumaPromedio/listado.size();
        //llamar recurso
        return calcularPromedioRating(listado,indice + 1, listado.get(indice).getRating());
    }

    public static Movie buscarPeliculaPorTitulo(List<Movie> listado, int indice, String tituloBuscado) {
        //Caso base
        if(listado.size() == indice) return null;

        if(listado.get(indice).getTitle().equalsIgnoreCase(tituloBuscado)) return listado.get(indice);

        //Llamar recurso
        return buscarPeliculaPorTitulo(listado, indice + 1, tituloBuscado);
    }

    public static Movie buscarPeliculaPorTituloStream(List<Movie> listado, String tituloBuscado) {
        Optional<Movie> cadena =  listado.stream().filter(e -> e.getTitle().equalsIgnoreCase(tituloBuscado)).findFirst();

        if(cadena.isPresent()) return cadena.get();
        else return null;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "idMovie=" + idMovie +
                ", title='" + title + '\'' +
                ", rating=" + rating +
                ", awards=" + awards +
                ", lenght=" + lenght +
                '}';
    }
}
