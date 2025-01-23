package com.example.controller;

import com.example.entities.Votacion;
import com.example.exceptions.InvalidVotacion;
import com.example.persistence.GenericoJPA;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VotacionController {
    private GenericoJPA<Votacion> genericoJPA;

    public VotacionController() {
        this.genericoJPA = new GenericoJPA<>(Votacion.class);
    }

    public void create(String valor) {
        try {
            validarVoto(valor);//Para mostrar el error si no lo selecciono
            genericoJPA.createGenerico(new Votacion(null, valor));
        } catch (InvalidVotacion e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Operación finalizada");
        }
    }

    private void validarVoto(String valor) throws InvalidVotacion {
        if(valor == null){
            throw new InvalidVotacion("Debes seleccionar un voto");
        }
    }

    public List<Votacion> findAll() {
        List<Votacion> listadoPartidos = genericoJPA.findAllGenerico();

        //Coger la lista de partidos sin duplicados
        List<String> lista = listadoPartidos.stream()
                .map(Votacion::getValor)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        List<Votacion> listado = new ArrayList<>();

        lista.forEach(partidos ->{
            long conteo = listadoPartidos.stream()
                                         .filter(e->e.getValor().equals(partidos))
                                         .count();
            listado.add(new Votacion(conteo, partidos));//Añadir a un listado con los conteos de las votaciones
        });

        return listado;
    }
}
