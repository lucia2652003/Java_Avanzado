package org.example.Semana_23_26.Dia_26_12_2024.Ejercicio2.hilos;


import java.util.Random;

public class EnsamblarProducto extends Thread {
    private String nombre;

    public EnsamblarProducto(String nombre) {
        this.nombre = nombre;
    }

    public EnsamblarProducto() {
    }

    @Override
    public void run() {
        //Ejecutar el código
        try {
            System.out.println("El trabajador "+nombre+" ha empezado a ensamblar producto");
            int num_alzar = new Random().nextInt(6)+1;
            Thread.sleep(num_alzar*1000);
            System.out.println("Fin de la tarea, "+nombre+" ensamblo durante "+num_alzar+" s");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
