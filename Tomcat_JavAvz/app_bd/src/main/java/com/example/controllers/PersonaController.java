package com.example.controllers;

import com.example.entities.Persona;
import com.example.exceptions.PersonaException;
import com.example.persistence.GenericoJPA;

import java.util.List;

public class PersonaController {

    private final GenericoJPA<Persona> personaJPA;

    public PersonaController() {
        this.personaJPA = new GenericoJPA<>(Persona.class);
    }

    public void create(String nombre, String apellido){

        try {
            Persona persona = new Persona(null,nombre, apellido);
            validarFormulario(nombre, apellido);
            personaJPA.createGenerico(persona);
        } catch (PersonaException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Operación finalizada");
        }
    }

    private void validarFormulario(String nombre, String apellido) throws PersonaException {
        if(nombre.isEmpty() || apellido.isEmpty()){
            throw new PersonaException("No puede haber campos vacíos");
        }

    }

    public List<Persona> findAll(){
        return personaJPA.findAllGenerico();
    }
}
