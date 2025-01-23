package org.example.streams.terminales;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MetodosBusqueda {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,23,30,45,49,47,59);

        Optional<Integer> valorPAR = numbers.stream()
                .filter(number  -> number % 2 == 0)
                .findFirst();

        //System.out.println(valorPAR.orElse(-1));

        Optional<Integer> cualquierNumeroPar = numbers.stream()
                .filter(number  -> number % 2 == 0)
                .findAny();

        // condicion ? true : false
        String valor = cualquierNumeroPar.isPresent() ? "Si hay par "+ cualquierNumeroPar : "No hay valores";
        //System.out.println(valor);

        //busca que todos sean mayores a 0
        boolean positivos = numbers.stream().allMatch(n-> n > 0);

        System.out.println("Hay positivos? "+positivos);

        //Buscar que por lo menos uno sea mayor a 5
        boolean existemaioresACinco = numbers.stream().anyMatch(n -> n > 5);
        //System.out.println("Hay alguno mayor a 5? "+existemaioresACinco);

        //Verificar si ningun numero cumple la condicion
        boolean existeNegativos = numbers.stream().noneMatch(n -> n < 0);
        System.out.println("Hay elementos negativos? "+existeNegativos);
    }
}
