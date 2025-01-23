package org.example.op_001_intermedias;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Intermedias {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Carlos", "Andres", "Jhon", "Jake", "Pedro");

        //filtrar por una letra inicial
       /* names.stream()
                .filter(name -> name.startsWith("J"))
                .forEach(System.out::println);*/

        /*names.stream()
                .map(String::length)
                        .collect(Collectors.toList())
                            .forEach(System.out::println);*/

        List<List<String>> nestedListe = Arrays.asList( Arrays.asList("A","B","C"),
                                                        Arrays.asList("D","E","F"),
                                                        Arrays.asList("G","H","I"));

        // aplanar la lista anidad
        /*List<String> flatList = nestedListe.stream()
                                                .flatMap(List::stream)
                                                        .collect(Collectors.toList());

        System.out.println("flatMap : " + flatList);*/

        //Eliminar duplicados o traer distintos
      /*  names.stream()
                .distinct()
                    .collect(Collectors.toList())
                            .forEach(System.out::println);*/

        //ordenamiento alfabético
        names.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);


    }
}
