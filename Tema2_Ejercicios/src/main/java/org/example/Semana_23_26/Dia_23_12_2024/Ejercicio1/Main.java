package org.example.Semana_23_26.Dia_23_12_2024.Ejercicio1;

import org.example.Semana_23_26.Dia_23_12_2024.Ejercicio1.entities.Reserva;
import org.example.Semana_23_26.Dia_23_12_2024.Ejercicio1.exceptions.ReservaInvalidaException;

import java.rmi.server.RemoteRef;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * Ejercicio Nº 1 - Reserva de Vuelos - Individual
 * Imagina que estás desarrollando un sistema de reservas de vuelos para una aerolínea. Los usuarios
 * pueden realizar reservas de vuelos proporcionando información como su
 * nombre, destino, fecha de viaje y número de asientos deseados.
 * Tu tarea es implementar una función de reserva de vuelos que valide los datos ingresados y
 *  maneje excepciones si los datos son incorrectos o si no hay suficientes asientos disponibles en el vuelo.

 * Debes crear una excepción personalizada, por ejemplo, ReservaInvalidaException, que se
 * lance en situaciones excepcionales, como cuando un usuario intenta reservar más asientos de los disponibles o si
 * falta información esencial. La excepción personalizada debe proporcionar un mensaje claro sobre la causa del error.
* */
public class Main {
   public static void main(String[] args) {
       Reserva reserva = new Reserva(20);//Asientos deseados
       List<Reserva> pasajeros = new ArrayList<>();

       try {
           reserva.validacionDatos("Lucia","Hawai",LocalDate.of(2021,12,5),5);
           pasajeros.add(new Reserva("Lucia","Hawai",LocalDate.of(2021,12,5),5));

           //Para error
           reserva.validacionDatos("Martin","Hawai",LocalDate.of(2021,12,5),28);
           pasajeros.add(new Reserva("Martin","Hawai",LocalDate.of(2021,12,5),28));
       } catch (ReservaInvalidaException e) {
           System.out.println(e.getMessage());
           System.out.println("No se ha podido hacer la reserva ");
       }finally {
           System.out.println("Reserva se hizo bien");
           System.out.println("Operación finalizada");
       }

       System.out.println("---Lista de Reservas----");
       pasajeros.forEach(System.out::println);
   }
}

