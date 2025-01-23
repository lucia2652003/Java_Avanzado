package org.example.Semana_30_02_2024_25.Ejercicio02.entities;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Evento {

    private String nombre;
    private LocalDate fecha;
    private String categoria;

    public Evento() {
    }

    public Evento(String nombre, LocalDate fecha, String categoria) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.categoria = categoria;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    //MÉTODOS
    public static void imprimirEmpleado(LocalDate fecha, List<Evento> agenda) {
        List<Evento> listaEventos = agenda.stream().filter(evento -> evento.getFecha().equals(fecha)).toList();
        if(listaEventos.isEmpty()) System.out.println("Ese día no estay libre esta fuera "+fecha);
        listaEventos.forEach(System.out::println);
    }

    public static void totalEventos(List<Evento> agenda) {
        List <String> categorias = agenda.stream().map(Evento::getCategoria).distinct().toList();

        categorias.forEach(categoria->{
            //Total de eventos por cada categoría
            long num_eventos = agenda.stream().filter(e -> categoria.equals(e.getCategoria())).count();
            System.out.println("Num "+categoria+": "+num_eventos);
        });
    }

    public static Optional<Evento> eventoProximo(List<Evento> agenda) {
        LocalDate fechaHoy = LocalDate.now();
        return agenda.stream()
                .filter(e -> fechaHoy.isBefore(e.getFecha()))
                .min((e1,e2) -> e1.getFecha().compareTo(e2.getFecha()));
    }


    //toString()
    @Override
    public String toString() {
        return "Evento{" +
                "nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
