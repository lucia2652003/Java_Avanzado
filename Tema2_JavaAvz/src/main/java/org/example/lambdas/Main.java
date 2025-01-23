package org.example.lambdas;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numer = Arrays.asList(1,2,3,4,5,6,7,8,9,10,10,22,22,22);

        Referencia lista = new Referencia(numer);

        //lista.imprimirElementos(); //Imprimir elementos

        //lista.filtrarPares(); //Mostrar los pares

       // lista.elevarAlCuadrado(); //Elevar elementos de la lista

        //lista.sumarElementos(); //Sumar

       // lista.encontrarMax(); //Encontrar valor máximo

        //lista.contarMayoresQueCinco();

        //lista.ordenarDescendentemente();

        //lista.eliminarDuplicados();

        //lista.saltarPrimerosCincos();

        //lista.mostrarImpar();

        /*Aplicando listas de referencia*/
        //lista.imprimirElementos();

        lista.sumarElementos();

        //lista.encontrarMax();
        //lista.encontrarMin();
    }
}
