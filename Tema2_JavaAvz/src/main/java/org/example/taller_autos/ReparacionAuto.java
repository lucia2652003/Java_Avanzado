package org.example.taller_autos;

public class ReparacionAuto extends Thread{

    private String nombre;

    public ReparacionAuto(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
      try {
           /*
            Conversiones:
            Segundo a milisegundo 1s * 1000
            Milisegundo a segundo 1 / 1000
            */
          System.out.println("Inicio de reparación "+this.nombre);
          int num_al = (int) ((Math.random() * 5000) + 1000); //Numero al azar de 1000 a 5000
          // Sirve para pausar la ejecución por segundos en cada hilo que se ejecuta, para eso debemos meter milisegundos
          // por petición del método.
          Thread.sleep(num_al);
          System.out.println("Fin reparación del auto "+this.nombre+" tardo "+(num_al/1000)+" s");
      } catch (InterruptedException e) {
                throw new RuntimeException(e);
      }

    }
}
