package org.example;

import org.example.excepciones.BibliotecaExcepcion;
import org.example.excepciones.MiExcepcionPersonalizada;

public class Main {
    public static void main(String[] args) throws MiExcepcionPersonalizada, BibliotecaExcepcion {

       /* Integer longitud = 0;
        String errorMensaje = "Valor Negativo no permitido";

        if (longitud <= 0){
            throw new MiExcepcionPersonalizada(errorMensaje);
        }else{
            System.out.println( longitud + " Es un numero positivo");
        }*/

        /*Recuperar del formulario para crear un libro */
        String titulo = "zxczxccxz";
        String autor = "xzczxc";
        Integer annio = 2020;


        if (titulo == null || titulo.isEmpty() || autor == null || autor.isEmpty() || annio < 1000) {
            throw new BibliotecaExcepcion("Los datos del libro son invalidos o incompletos");
        }else{
            System.out.println("Libro guardado en la DB");
        }
    }
}