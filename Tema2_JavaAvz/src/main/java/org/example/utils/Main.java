package org.example.utils;

import org.example.utils.entities.Utilidades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //ARRAYS
        int[] lista = {1,40,6,3,15,25};
        //Utilidades.sort(lista);

        /*int key = 5;
        Utilidades.busqueda(lista, key);*/

        //COLLECTIONS
        /*List<String> nombres = new ArrayList<>(Arrays.asList("Juan","Ana","Pepe","Angel","Sergio","Lucía"));
        Utilidades.ordenamientoListado(nombres);

        Utilidades.reverse(nombres);*/

        //StringTokenizer
       /* String cadena = "Hola como estás?";
        Utilidades.separarPalabras(cadena);*/

        //Matcher y Pattern
        String cad = "456p";
        Utilidades.validarSIEsUnNumero(cad);

    }
}
