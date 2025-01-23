package org.example.op_002_terminales;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MetodosRecoleccion {

    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Carlos", "Andres", "Carlos", "Jake", "Pedro");

        List<String> distintos = nombres.stream().distinct().collect(Collectors.toList());

 /*       System.out.println(distintos);*/

        // Map <"nombre".length , "nombre">
        Map<Integer,List<String>> agrupados = nombres.stream().collect(Collectors.groupingBy(String::length));

/*        System.out.println("Agrupados " + agrupados);*/

        //Convierte los elementos del stream en un array

        String[] nombresArray = nombres.stream().toArray(String[]::new);

/*
        System.out.println(Arrays.toString(nombresArray));
*/


        //Reducir todos los nombre a un solo string
        //concatenacion = "Hola, hashdsahasdhsadhashjsad"
        String concatenacion = nombres.stream()
                                        .reduce("Hola,",
                                        (valorPrevio , valorPosterior ) -> valorPrevio + valorPosterior + " ==> " );

        System.out.println(concatenacion);
    }
}
