package org.example.streams;

import java.util.Arrays;
import java.util.List;

public class Streams {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(15,24,null,null);

        numeros.stream()                              //primera parte
                .filter(num -> num >= 25)     //segunda parte
                .forEach(num  -> System.out.println("Número mayor a 25: "+num));       //tercera parte

    }
}
