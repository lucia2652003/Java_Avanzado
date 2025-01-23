package org.example.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity(name= "movies")
public class Movie {
    /*Crear columnas de la tabla Movies*/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /*@Column(nullable = false, length = 200)*/
    @Column()
    private String title;

    @Column(name = "rating")
    private double miRating;

    @Column()
    private Integer awards;

    @Column
    private LocalDateTime release_date;

    @Column
    private Integer length;

    @Column(name = "genre_id")
    private Integer genreId;

    /*constructores*/

    public Movie() {
    }

    public Movie(Integer id, String title, double miRating, Integer awards, LocalDateTime release_date, Integer length, Integer genreId) {
        this.id = id;
        this.title = title;
        this.miRating = miRating;
        this.awards = awards;
        this.release_date = release_date;
        this.length = length;
        this.genreId = genreId;
    }

    /* getter y setter*/

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

    public double getMiRating() {
        return miRating;
    }

    public void setMiRating(double miRating) {
        this.miRating = miRating;
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

    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }

    /*toString()*/

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", miRating=" + miRating +
                ", awards=" + awards +
                ", release_date=" + release_date +
                ", length=" + length +
                ", genreId=" + genreId +
                '}';
    }
}
