package org.example.threads;

import java.util.Random;

public class ReparacionAuto extends Thread{

    private String auto;

    public ReparacionAuto(String auto) {
        this.auto = auto;
    }

    @Override
    public void run() {

        try {
            System.out.println("Inicio de repacacion del auto " + auto);

            Integer tiempo = new Random().nextInt(5) + 1;
            Thread.sleep(tiempo*1000);

            System.out.println("Fin de la reparacion del auto " + auto);
        } catch (InterruptedException e) {
            System.out.println("Reparacion interrumpida");
        }
    }
}
