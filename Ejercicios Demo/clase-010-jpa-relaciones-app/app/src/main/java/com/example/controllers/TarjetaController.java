package com.example.controllers;

import com.example.entities.Persona;
import com.example.entities.Tarjeta;
import com.example.persistence.GenericoJPA;

import java.util.List;

public class TarjetaController {

    private final GenericoJPA<Tarjeta, Long> personaJPA;

    public TarjetaController() {
        this.personaJPA = new GenericoJPA<>(Tarjeta.class);
    }

    public void create(String tipo, Persona persona){

        Tarjeta.TipoTarjeta tipoTarjeta = tipo.equalsIgnoreCase("CREDITO") ? Tarjeta.TipoTarjeta.CREDITO : Tarjeta.TipoTarjeta.DEBITO;

        Tarjeta tarjeta = new Tarjeta();
        tarjeta.setTipo(tipoTarjeta);
        tarjeta.setPersona(persona);
        personaJPA.create(tarjeta);
    }
}

