package org.example.Semana_23_26.Dia_26_12_2024.Ejercicio2.hilos;

import java.util.Random;

public class ControlCalidad extends Thread{
    private String nombre;

    public ControlCalidad(String nombre) {
        this.nombre = nombre;
    }

    public ControlCalidad() {
    }

    @Override
    public void run() {
        //Ejecutar el código
        try {
            System.out.println("El trabajador "+nombre+" ha empezado a controlar la calidad del producto");
            int num_alzar = new Random().nextInt(3)+1;
            Thread.sleep(num_alzar*1000);
            System.out.println("Fin de la tarea, "+nombre+" controló la calidad de cada producto durante "+num_alzar+" s");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
