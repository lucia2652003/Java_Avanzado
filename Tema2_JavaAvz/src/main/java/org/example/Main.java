package org.example;

import org.example.excepciones.BibliotecaExcepcion;
import org.example.excepciones.MIExcepcionPersonalizada;

public class Main {
    public static void main(String[] args) throws MIExcepcionPersonalizada, BibliotecaExcepcion {

      /*  Integer longitud = 0;
        String errMensaje = "Valor negativo no permitido";

        if(longitud <= 0){
            throw new MIExcepcionPersonalizada(errMensaje);
        } else {
            System.out.println(longitud+" es un número positivo");
        }
        */

        /* Recuperar del formulario para crear un libro */

        String titulo= "dfsda";
        String autor = "dsdadf";
        Integer edad = 1999;

        if (titulo == null || titulo.isEmpty() || autor == null || autor.isEmpty() || edad < 1000) {
            throw new BibliotecaExcepcion("Los datos del libro son inválidos");
        } else {
            System.out.println("Libro correcto");
        }
    }
}