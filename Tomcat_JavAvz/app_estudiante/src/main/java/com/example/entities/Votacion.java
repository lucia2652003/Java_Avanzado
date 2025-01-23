package com.example.entities;

import jakarta.persistence.*;

@Entity(name = "votos")
public class Votacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String valor;

    public Votacion() {
    }

    public Votacion(Long id, String valor) {
        this.id = id;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Votacion{" +
                "id=" + id +
                ", valor='" + valor + '\'' +
                '}';
    }
}
