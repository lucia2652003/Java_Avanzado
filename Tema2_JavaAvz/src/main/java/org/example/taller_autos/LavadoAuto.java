package org.example.taller_autos;

public class LavadoAuto implements Runnable{
    private String nombre;

    public LavadoAuto() {
    }

    public LavadoAuto(String nombre) {
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
            System.out.println("Inicio de lavado auto "+this.nombre);
            int num_al = (int) ((Math.random() * 3000) + 1000); //Número al azar de 1000 a 3000 expresado milisegundos
            Thread.sleep(num_al);
            //Conversión de milisegundos a segundos
            System.out.println("Fin del lavado de "+this.nombre+" tardo "+(num_al/1000)+" s");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
