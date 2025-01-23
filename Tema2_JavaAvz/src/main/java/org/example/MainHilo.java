package org.example;

import org.example.hilos_runnable.HiloRunnable;
import org.example.hilos_thread.MiHilo;

public class MainHilo {
    public static void main(String[] args) throws InterruptedException {
       /* MiHilo miHilo = new MiHilo("Hilo 1-->");
        MiHilo miHilo2 = new MiHilo("Hilo 2-->");


        miHilo2.start();
        miHilo.start();// Iniciamos los hilos con todo su ciclo de vida*/

        Runnable miRunnable = new HiloRunnable();
        Thread miHilo1 = new Thread(miRunnable);
        miHilo1.start();
        miHilo1.join();

        Thread miHilo2 = new Thread(miRunnable);
        miHilo2.start();
        miHilo2.join();

        Thread miHilo3 = new Thread(miRunnable);
        miHilo3.start();
        miHilo3.join();


    }
}
