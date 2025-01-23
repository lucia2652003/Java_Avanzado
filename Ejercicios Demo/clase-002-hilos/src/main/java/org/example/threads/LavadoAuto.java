package org.example.threads;

import java.util.Random;

public class LavadoAuto implements Runnable{
    private String auto;

    public LavadoAuto(String auto) {
        this.auto = auto;
    }

    @Override
    public void run() {
        try {
            System.out.println("Inicio del lavado del auto " + auto);
            Integer tiempo =  new Random().nextInt(3) + 1 ;
            Thread.sleep(tiempo*1000);
        } catch (InterruptedException e) {
            System.out.println("lavado interrumpido");
        }
    }
}
