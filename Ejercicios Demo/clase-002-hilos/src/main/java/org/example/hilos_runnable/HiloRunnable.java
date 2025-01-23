package org.example.hilos_runnable;

public class HiloRunnable implements Runnable{



    @Override
    public void run() {
        for (int i = 1; i <=5; i++) {
            System.out.println( " - Contador " + i);

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
