package org.example;

import org.example.codigo_001_lambdas.Lambdas;
import org.example.codigo_002_metodoRef.Referencia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*Crear una lista de numeros*/
        List<Integer> listaNumeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,16,22,22,22);
        Referencia misLambdas = new Referencia(listaNumeros);

      /*  misLambdas.imprimirElementos();             //Imprime todos los elementos*/

       /* misLambdas.filtrarPares();                     //Filtra los numeros pares*/

/*        misLambdas.elevarAlCuadrado();                  // elevar al cuadrado*/

   /*     misLambdas.sumarElementos();                    // Sumar elementos*/

   /*     misLambdas.encontrarMax();*/

        misLambdas.encontrarMin();

     /*   misLambdas.contarMayoresQueCinco();*/

     /*   misLambdas.ordenarDescendentemente();*/

       /* misLambdas.eliminarDuplicados();*/

      /*  misLambdas.saltarPrimerosCinco();*/
    }
}