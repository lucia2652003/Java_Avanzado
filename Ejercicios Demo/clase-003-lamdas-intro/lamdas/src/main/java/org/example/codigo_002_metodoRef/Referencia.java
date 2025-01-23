package org.example.codigo_002_metodoRef;

import java.util.List;

public class Referencia {

    private List<Integer> numeros;

    public Referencia(List<Integer> numeros) {
        this.numeros = numeros;
    }

    public void imprimirElementos(){
        numeros.forEach(System.out::println);
    }

    public void sumarElementos(){
        int valor = numeros.stream().reduce(0,Integer::sum);
        System.out.println("Suma total " + valor);
    }

    public void encontrarMax(){
        int valor = numeros.stream().max(Integer::compare).orElse(0);
        System.out.println("Numero Max: " +valor);
    }

    public void encontrarMin(){
        int valor = numeros.stream().min(Integer::compare).orElse(0);
        System.out.println("Numero Min: " +valor);
    }


}
