package org.example.streams.terminales;

import java.util.Arrays;
import java.util.List;

public class Estadisticos {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Carlos","Andres","Jhon","Jake","Pedro");

        long cantidad = names.stream().count();

        //Promedio de la longitud de los nombre
        double promedio = names.stream()
                               .mapToInt(String::length)
                               .average().orElse(0.0);

        System.out.println("Average: "+promedio);

        int suma = names.stream().mapToInt(String::length).sum();

        names.stream().forEach(System.out::println);
    }
}
