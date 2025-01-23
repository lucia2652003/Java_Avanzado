package org.example.utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilidades {

    public static void sort(int[] numeros){
        Arrays.sort(numeros);
        System.out.println("Array ordenaro: "+ Arrays.toString(numeros));
    }

    public static void busquedaBinaria(int[] numeros, int key){
                int indice = Arrays.binarySearch(numeros, key);
        System.out.println("El numero " +  key + "  esta en el indice " + indice) ;
    }

    public static void ordenamientoListado(List<String> listado){
        Collections.sort(listado);
        System.out.println("Lista ordenada:" + listado) ;
    }

    public static void reverse(List<String> nombres) {
        Collections.reverse(nombres);
        System.out.println("Lista invertida: " + nombres);
    }

    public static void separarPalabras(String input) {
        StringTokenizer st = new StringTokenizer(input);

        while (st.hasMoreTokens()){
            System.out.println("Token: " + st.nextToken());
        }
    }

    public static void validarSiEsUnNumero(String inputMatch) {
        Pattern patron = Pattern.compile("[0-9]+");
        Matcher matcher = patron.matcher(inputMatch);
        if (matcher.matches()) System.out.println("Es un numero");
            else System.out.println("No es un numero");
    }
}
