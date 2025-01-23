package org.example.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity(name = "movies")
public class Movie {
    //Columnas de la tabla

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title")
    String title;

    @Column(name = "rating")
    Double rating;

    @Column(name = "awards")
    Integer awards;

    @Column(name = "release_date")
    LocalDateTime release_date;

    @Column(name = "length")
    Integer length;

    @Column(name = "genre_id")
    Integer genre_id;

    //Constructores
    public Movie() {
    }

    public Movie(Integer id, String title, Double rating, Integer awards, LocalDateTime release_date, Integer length, Integer genre_id) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.awards = awards;
        this.release_date = release_date;
        this.length = length;
        this.genre_id = genre_id;
    }

    //Getters y setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getAwards() {
        return awards;
    }

    public void setAwards(Integer awards) {
        this.awards = awards;
    }

    public LocalDateTime getRelease_date() {
        return release_date;
    }

    public void setRelease_date(LocalDateTime release_date) {
        this.release_date = release_date;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(Integer genre_id) {
        this.genre_id = genre_id;
    }

    //toString()
    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", rating=" + rating +
                ", awards=" + awards +
                ", release_date=" + release_date +
                ", length=" + length +
                ", genre_id=" + genre_id +
                '}';
    }
}
