package org.example.op_002_terminales;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MetodosBusqueda {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,23,30,45,49,47,10);

        Optional<Integer> numeroPar = numbers.stream()
                .filter(number -> number % 2 == 0)
                .findFirst();

      /*  System.out.println(numeroPar.orElse(-1));*/

        Optional<Integer> cualquierNumeroPar = numbers.stream()
                .filter(number -> number % 2 == 0)
                .findAny();

        // condicion ? true : false;
        String valor = cualquierNumeroPar.isPresent() ? "Si hay par " + cualquierNumeroPar : "No hay numeros pares";
       /* System.out.println(valor);*/


        //buscar que todos sean mayores a 0
        boolean positivos = numbers.stream().allMatch(n -> n > 0);

       /* System.out.println("Todos son Positivos?: " + positivos);*/

        // buscar que por lo menos uno sea mayor a 5
        boolean existenmayoresACinco = numbers.stream().anyMatch(n -> n > 5);

/*
        System.out.println("Hay alguno mayor a 5?" + existenmayoresACinco);
*/

        //Verificar si ningun numero cumple la condicion
        boolean existenNegativos = numbers.stream().noneMatch(n -> n < 0);
        System.out.println("Hay elementos negativos? " + existenNegativos);


    }
}
