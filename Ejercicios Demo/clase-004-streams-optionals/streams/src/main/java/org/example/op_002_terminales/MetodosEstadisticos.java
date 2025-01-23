package org.example.op_002_terminales;

import java.util.Arrays;
import java.util.List;

public class MetodosEstadisticos {

    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Carlos", "Andres", "Jhon", "Jake", "Pedro");

        Long cantidad =  nombres.stream().count();

        //Calcular promedio de la long de los nombres en la lista
        double promedio = nombres.stream()
                                .mapToInt(String::length)
                                        .average().orElse(0.0);

       /* System.out.println("Average: " + promedio);*/

        //sumar la long de cada palabra
        int sumaLongitud = nombres.stream().mapToInt(String::length).sum();
/*        System.out.println(sumaLongitud);*/

/*
        nombres.stream().forEach(name -> System.out.println(name));
*/
        nombres.stream().forEach(System.out::println);

    }
}
