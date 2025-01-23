package org.example.Semana_23_26.Dia_26_12_2024.Ejercicio2;

import org.example.Semana_23_26.Dia_26_12_2024.Ejercicio2.hilos.ControlCalidad;
import org.example.Semana_23_26.Dia_26_12_2024.Ejercicio2.hilos.EmbalarProductos;
import org.example.Semana_23_26.Dia_26_12_2024.Ejercicio2.hilos.EnsamblarProducto;

public class principal {
    public static void main(String[] args) {
        System.out.println("Inicio de las funciones de la fábrica");

        EnsamblarProducto trab1 = new EnsamblarProducto("Paula");
        EnsamblarProducto trab2 = new EnsamblarProducto("Laura");

        ControlCalidad  trab3 = new ControlCalidad("Martín");

        Runnable runnable = new EmbalarProductos("Marco");
        Thread trab4 = new Thread(runnable);

        trab1.start();
        trab2.start();
        trab3.start();
        trab4.start();

        try {
            trab1.join();
            trab2.join();
            trab3.join();
            trab4.join();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("Fin de todas las tareas de fábrica");
    }
}
