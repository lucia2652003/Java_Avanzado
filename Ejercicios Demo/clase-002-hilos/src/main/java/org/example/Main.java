package org.example;

import org.example.hilos_runnable.HiloRunnable;
import org.example.hilos_thread.MiHilo;

public class Main {
    public static void main(String[] args) throws InterruptedException {


   /*     MiHilo miHilo1 = new MiHilo("Hilo 1) -->");
        MiHilo miHilo2 = new MiHilo("Hilo2) -->");

        miHilo1.start();            // TODO: 26/12/2024   Iniciamos los hilos con todo su ciclo de vida
        miHilo2.start();*/

        Runnable miRunnable = new HiloRunnable();
        Thread miHilo1 = new Thread(miRunnable);
        miHilo1.start();


        Thread miHilo2 = new Thread(miRunnable);
        miHilo2.start();


        Thread miHilo3 = new Thread(miRunnable);
        miHilo3.start();



        miHilo1.join();
        miHilo2.join();
        miHilo3.join();
    }
}