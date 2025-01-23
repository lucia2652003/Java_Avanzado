package org.example.taller_autos;
/*
*
* En este ejercicio, van a simular un taller de autos.
* Se les solicita crear un programa en Java que realice las siguientes tareas:

* Crear una clase ReparacionAuto que extienda Thread.
* Esta clase debe simular la reparación de un auto,
*  donde cada reparación tarda un tiempo aleatorio entre 1 y 5 segundos.
*    Pregunta para reflexionar: ¿Cómo puedes usar el método run() para realizar la reparación del auto?
*    ¿Qué método podrías usar para pausar la ejecución por unos segundos?

* Crear una clase LavadoAuto que implemente Runnable. Esta clase debe simular el lavado de un auto,
* también con un tiempo aleatorio entre 1 y 3 segundos.
* Pregunta para reflexionar: ¿Cuál es la diferencia principal entre extender Thread e implementar Runnable?

* En la clase principal:
*  Crear dos autos en reparación (instancias de ReparacionAuto).
*  Crear dos autos para lavar (instancias de LavadoAuto) y ejecutarlas usando Thread.
*  Mostrar mensajes indicando cuándo comienza y cuándo termina cada proceso (reparación o lavado).
*   Pregunta para reflexionar: ¿Qué ocurre si ejecutas los procesos en diferentes hilos?
*    ¿Cómo puedes asegurarte de que el programa termine después de que todos los procesos hayan finalizado?
*
* */
public class main {
    public static void main(String[] args) {
        //Thread
        ReparacionAuto rp1 = new ReparacionAuto("Ferrari");
        ReparacionAuto rp2 = new ReparacionAuto("Toyota");

        //Runnable
        Runnable miRunnable = new LavadoAuto("Ford");
        Thread miHilo1 = new Thread(miRunnable);

        Runnable miRunnable2 = new LavadoAuto("Fiat");
        Thread miHilo2 = new Thread(miRunnable2);

        //Iniciar los hilos
        rp1.start();
        rp2.start();
        miHilo1.start();
        miHilo2.start();

        try {
            rp1.join();
            rp2.join();
            miHilo1.join();
            miHilo2.join();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        System.out.println("Fin de todos los procesos");
    }
}
