package org.example.Semana_23_26.Dia_26_12_2024.Ejercicio2.hilos;

import java.util.Random;

public class EmbalarProductos implements Runnable{

    private String nombre;

    public EmbalarProductos(String nombre) {
        this.nombre = nombre;
    }

    public EmbalarProductos() {
    }

    @Override
    public void run() {
        try {
            System.out.println("El trabajador "+nombre+" ha empezado a embalar producto");
            int num_alzar = new Random().nextInt(5)+1;
            Thread.sleep(num_alzar);
            System.out.println("Fin de la tarea, "+nombre+" embaló durante "+num_alzar+" s");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
