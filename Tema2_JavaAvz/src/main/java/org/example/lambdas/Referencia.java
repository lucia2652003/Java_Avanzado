package org.example.lambdas;

import java.util.List;

public class Referencia {

    private List<Integer> num;

    public Referencia(List<Integer> num) {
        this.num = num;
    }

    public void imprimirElementos(){
        num.forEach(System.out::println);
    }


    public void sumarElementos(){
        int valor = num.stream().reduce(0, Integer::sum);
        System.out.println("La suma total es :"+valor);
    }

    public void encontrarMax(){
        int valor = num.stream().max(Integer::compare).orElse(Integer.MAX_VALUE);
        System.out.println("Valor máximo : "+valor);
    }

    public void encontrarMin(){
        int valor = num.stream().min(Integer::compare).orElse(Integer.MIN_VALUE);
        System.out.println("Valor mínimo : "+valor);
    }

}
