package org.example.Semana_07_10_2025.Dia_08_01_2025.ejercicio02.entities;

import java.util.ArrayList;
import java.util.List;

public class Tarea {
    private String nombre;
    private List<Tarea> subtareas;

    public Tarea(String nombre, List<Tarea> subtareas) {
        this.nombre = nombre;
        this.subtareas = subtareas;
    }

    public Tarea(String nombre) {
        this.nombre = nombre;
        this.subtareas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tarea> getSubtareas() {
        return subtareas;
    }

    public void setSubtareas(List<Tarea> subtareas) {
        this.subtareas = subtareas;
    }


    public void crearTareas(Tarea inicial, int indice, List<String> tareas) {
        //Caso base
        if(inicial.getSubtareas().size() == tareas.size()) return;

        //Añadir al lista
        inicial.getSubtareas().add(new Tarea(tareas.get(indice)));

        //llamada recursiva
        crearTareas(inicial, indice+1, tareas);
     }

    public void crearSubtareas(Tarea inicial, int indice, String tareaBuscar, Tarea nuevaTarea) {
        //Crear base
        if(inicial.getSubtareas().size() == indice) return;
        if(inicial.getSubtareas().get(indice).getNombre().equalsIgnoreCase(tareaBuscar)){
            inicial.getSubtareas().stream().filter(e->e.getNombre()
                    .equalsIgnoreCase(tareaBuscar)).findAny().get().getSubtareas().add(nuevaTarea); return;
        }

        //Llamada recursiva
        crearSubtareas(inicial, indice+1, tareaBuscar, nuevaTarea);
    }

    public static void mostrarJerarquia(Tarea inicial,int indice) {
        if(inicial == null) return;
        if(inicial.getSubtareas().size() == indice){
            escribir(inicial);
            return;
        }
        mostrarJerarquia(inicial, indice+1);
    }

    private static void escribir(Tarea inicial) {
        System.out.println(inicial.getNombre());
        inicial.getSubtareas().forEach(tareaPr->{
            System.out.println("|-- Tarea Principal: "+tareaPr.getNombre());
            if(!tareaPr.getSubtareas().isEmpty()){
                tareaPr.getSubtareas().forEach(subtarea->{
                    System.out.println("|   |-- Subtarea: "+subtarea.getNombre());
                    if (!subtarea.getSubtareas().isEmpty()){
                        subtarea.getSubtareas().forEach(sbb->{
                            System.out.println("|   |    |-- Sub-subtarea: "+sbb.getNombre());
                        });// fin sub-subtareas
                    }
                });// fin subtareas
            }
        });// fin tareas principales
    }


    @Override
    public String toString() {
        return "Tarea{" +
                "nombre='" + nombre + '\'' +
                ", subtareas=" + subtareas +
                '}';
    }



}
