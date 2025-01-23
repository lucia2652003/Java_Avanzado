package org.example.threads;

public class Principal {

    public static void main(String[] args) {
        /*Crear 2 hilos de reparacion*/
        ReparacionAuto reparacionAuto1 = new ReparacionAuto("Ferrari 1");
        ReparacionAuto reparacionAuto2 = new ReparacionAuto("Fiat 2");


        /*Crear 2 hilos de lavado*/
        Runnable runnable1 = new LavadoAuto("Ford 3");
        Runnable runnable2 = new LavadoAuto("toyota 4");

        /*Crear los hilos para las tareas de lavado*/
        Thread hiloLavado1 = new Thread(runnable1);
        Thread hiloLavado2 = new Thread(runnable2);

        /*Iniciar todos los hilos*/
        reparacionAuto1.start();
        reparacionAuto2.start();
        hiloLavado1.start();
        hiloLavado2.start();

  /*      try{
            reparacionAuto1.join();
            reparacionAuto2.join();
            hiloLavado1.join();
            hiloLavado2.join();
        }catch (InterruptedException e){
            System.out.println("Algo ocurrio y se interrumpio");
        }*/


       System.out.println("Se ejecutara de ultimo");

    }
}
