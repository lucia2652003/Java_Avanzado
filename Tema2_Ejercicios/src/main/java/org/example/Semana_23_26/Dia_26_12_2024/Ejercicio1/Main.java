package org.example.Semana_23_26.Dia_26_12_2024.Ejercicio1;

import org.example.Semana_23_26.Dia_26_12_2024.Ejercicio1.entities.Llamada;
import org.example.Semana_23_26.Dia_26_12_2024.Ejercicio1.hilos.Agente;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Inicio de la conservación de las llamadas");

        //Crear los hilos
        Agente ag1 = new Agente(1, new Llamada(12, "Fallos técnicos"), 12);
        Agente ag2 = new Agente(2, new Llamada(10, "Proceso incompleto"), 24);

        ag1.start();
        ag2.start();

        try {
            ag1.join();
            ag2.join();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("Fin de las llamadas");
    }
}
