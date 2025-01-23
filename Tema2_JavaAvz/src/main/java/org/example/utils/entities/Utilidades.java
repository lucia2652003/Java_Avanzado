package org.example.utils.entities;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilidades {

    public static void sort(int[] numeros){
        Arrays.sort(numeros);
        System.out.println("Array ordenado: "+ Arrays.toString(numeros));
    }

    public static void busqueda(int[] numeros, int key){
        int indice = Arrays.binarySearch(numeros, key);
        System.out.println("El número "+key+" esta en le índice "+indice);
    }

    public static void ordenamientoListado(List<String> lista){
        Collections.sort(lista);
        System.out.println("Lista ordenada: "+ lista);
    }

    public static void reverse(List<String> nombres) {
        Collections.reverse(nombres);
        System.out.println("Lista invertida: "+nombres);
    }

    public static void separarPalabras(String cadena) {
        StringTokenizer st = new StringTokenizer(cadena, " ");
        while (st.hasMoreTokens()){
            System.out.println("Token: "+st.nextToken());
        }
    }

    public static void validarSIEsUnNumero(String cad) {
        Pattern patron = Pattern.compile("[0-9]+");
        Matcher mt = patron.matcher(cad);
        if(mt.matches()){
            System.out.println("Es un número");
        }else{
            System.out.println("No es un número");
        }
    }
}
