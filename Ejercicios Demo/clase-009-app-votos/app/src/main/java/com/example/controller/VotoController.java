package com.example.controller;

import com.example.entities.Voto;
import com.example.entities.VotosRespuesta;
import com.example.persistence.GenericoJPA;

import java.util.ArrayList;
import java.util.List;

public class VotoController {


    private final GenericoJPA<Voto, Long> genericoJPA;

    public VotoController() {
        this.genericoJPA = new GenericoJPA<>(Voto.class);
    }

    public void create(String candidato) {
        Voto persona = new Voto();
        persona.setCandidato(candidato);
        genericoJPA.create(persona);
    }

    public List<VotosRespuesta> findAll() {
        String candidatoA = "A";
        String candidatoB = "B";
        String candidatoC = "C";
        Long votosA = genericoJPA.findAll().stream()
                .filter(candidato -> candidato.getCandidato().equalsIgnoreCase(candidatoA)).count();

        Long votosB = genericoJPA.findAll().stream()
                .filter(candidato -> candidato.getCandidato().equalsIgnoreCase(candidatoB)).count();

        Long votosC = genericoJPA.findAll().stream()
                .filter(candidato -> candidato.getCandidato().equalsIgnoreCase(candidatoC)).count();

        List<VotosRespuesta> listado = new ArrayList<>();
        listado.add(new VotosRespuesta(candidatoA, votosA));
        listado.add(new VotosRespuesta(candidatoB, votosB));
        listado.add(new VotosRespuesta(candidatoC, votosC));

        return listado;

    }

}
