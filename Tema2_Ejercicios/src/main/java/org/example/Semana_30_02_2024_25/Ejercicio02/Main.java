package org.example.Semana_30_02_2024_25.Ejercicio02;

import org.example.Semana_30_02_2024_25.Ejercicio02.entities.Evento;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

/*
*
* Imagina que estás construyendo una aplicación
* para gestionar eventos en una agenda.
* Cada evento tiene un nombre, una fecha y una categoría (por ejemplo, "Reunión", "Conferencia", "Taller").
*  Implementa las siguientes operaciones utilizando Streams y Optionals:
*
* Filtra los eventos que están programados para una fecha específica.
* Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada categoría.
* Encuentra el evento más próximo en el tiempo utilizando Optionals.
*
* */

public class Main {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        Evento e1 = new Evento("Nochebuena", LocalDate.of(2025,12,24), "Reunión");
        Evento e2 = new Evento("Navidad", LocalDate.of(2025,12,25), "Conferencia");
        Evento e3 = new Evento("San Valentín", LocalDate.of(2025,2,14), "Taller");
        Evento e4 = new Evento("Día del Padre", LocalDate.of(2025,3,19), "Taller");
        Evento e5 = new Evento("Cumpleaños", LocalDate.of(2025,5,26), "Reunión");
        Evento e6 = new Evento("Cumpleaños", LocalDate.of(2025,1,1), "Reunión");

        List<Evento> agenda = Arrays.asList(e1,e2,e3,e4,e5,e6);

        System.out.println("Inserta una fecha YYYY-MM-DD");
        LocalDate fecha = LocalDate.parse(t.nextLine());
        Evento.imprimirEmpleado(fecha,agenda);

        Evento.totalEventos(agenda); //Numero de eventos por cada categoria

        Optional<Evento> e = Evento.eventoProximo(agenda); //Fecha proxima
        String valor = e.isPresent() ? "El evento más próxima es "+e.stream().map(Evento::getFecha) : "No hay ningun evento próximo";
        System.out.println(valor);
    }
}
