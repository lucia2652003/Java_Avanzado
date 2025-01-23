package org.example.streams.terminales;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Recoleccion {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Carlos","Carlos","Carlos","Jake","Pedro");

        List<String> distintos = names.stream().distinct().collect(Collectors.toList());
        System.out.println(distintos);

        //Map <"nombre".lenght, "nombre">
        Map <Integer,List<String>> agrupado = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(agrupado);

        //Convierte los elementos en array
        String[] nombres= names.stream().toArray(String[]::new);
        System.out.println(Arrays.toString(nombres));

        //Reducir todos los nombre a un solo string
        String concatenacion = names.stream()
                                     .reduce("Hola, ", (valorPrevio,valorPosterior)-> valorPrevio+valorPosterior+ " ==> ");
        System.out.println(concatenacion);
    }
}
