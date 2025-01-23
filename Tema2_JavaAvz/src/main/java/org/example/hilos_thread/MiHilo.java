package org.example.hilos_thread;

public class MiHilo extends Thread{

    private String nombre;

    public MiHilo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        //super.run();
        //Código que quiero ejecutar

        String nombre = this.nombre;
        for (int i = 0; i <= 5; i++) {
            System.out.println(this.nombre+": Contador "+i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
