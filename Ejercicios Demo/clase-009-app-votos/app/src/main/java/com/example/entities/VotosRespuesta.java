package com.example.entities;

import jakarta.persistence.Column;

public class VotosRespuesta {

    private String candidato;
    private Long votos;

    public VotosRespuesta() {
    }

    public VotosRespuesta(String candidato, Long votos) {
        this.candidato = candidato;
        this.votos = votos;
    }

    public String getCandidato() {
        return candidato;
    }

    public void setCandidato(String candidato) {
        this.candidato = candidato;
    }

    public Long getVotos() {
        return votos;
    }

    public void setVotos(Long votos) {
        this.votos = votos;
    }
}
