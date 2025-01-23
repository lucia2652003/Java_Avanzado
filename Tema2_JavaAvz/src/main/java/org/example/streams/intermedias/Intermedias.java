package org.example.streams.intermedias;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Intermedias {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jhon","Andres","Jane","James","Jake","Pedro");

        //filtrar por una letra inicial
        names.stream()
             .filter(e->e.startsWith("J"))
             .forEach(System.out::println);

        names.stream()
             .map(String::length)
             .collect(Collectors.toList())
             .forEach(System.out::println);

        List<List<String>> nesteListe = Arrays.asList(
                Arrays.asList("A", "B", "C"),
                Arrays.asList("D","E" , "F"),
                Arrays.asList("G","H" ,"I"));


        /*Aplanar la lista anidada
        List<String> flatListe = nesteListe.stream()
                                           .flatMap(List::stream)
                                           .toList();
        System.out.println("FlatMap: "+flatListe);*/


        //Eliminar duplicados
        names.stream()
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);


        //Ordenamiento alfabético
        names.stream()
              .sorted()
              .collect(Collectors.toList())
              .forEach(System.out::println);
    }

}
