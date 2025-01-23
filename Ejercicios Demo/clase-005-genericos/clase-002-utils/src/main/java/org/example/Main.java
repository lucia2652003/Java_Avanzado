package org.example;

import org.example.utils.Utilidades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // ordernar un vector
        int[] numeros = {5,2,8,1,6};

       /* Utilidades.sort(numeros);*/

       /* int key = 5;
        Utilidades.busquedaBinaria(numeros, key);*/

       /* List<String> nombres = new ArrayList<>(Arrays.asList("Juan", "Ana", "Carlos", "Mateo"));
        Utilidades.ordenamientoListado(nombres);

        Utilidades.reverse(nombres);*/

        //tokenizer
/*        String input =  "Hola como estas?";
        Utilidades.separarPalabras(input);*/

        // matcher y Pattern
        String inputMatch = "456p";
        Utilidades.validarSiEsUnNumero(inputMatch);

    }
}