package org.example.lambdas;

import java.util.List;
import java.util.stream.Collectors;

public class Lambdas {

    private List<Integer> numeros;


    public Lambdas(List<Integer> numeros) {
        this.numeros = numeros;
    }

    public void imprimirElementos(){numeros.forEach(n -> System.out.println(n));}


    public void filtrarPares(){
        List<Integer> listado = numeros.stream().filter(n->n % 2 == 0).collect(Collectors.toList());
        System.out.println(listado);
    }

    public void elevarAlCuadrado(){
        List<Integer> listado = numeros.stream().map(n->n*n).collect(Collectors.toList());
        System.out.println(listado);
    }

    public void sumarElementos(){
        Integer numero = numeros.stream().reduce(0,(a,b)->a+b);
        System.out.println("La suma total es : "+numero);
    }

    public void encontrarMax(){
        int valor = numeros.stream().max((a,b)->Integer.compare(a,b)).orElse(0);
        System.out.println("Valor Max "+valor);
    }

    public void contarMayoresQueCinco(){
        long mayoresCinco = numeros.stream().filter(n -> n > 5).count();
        System.out.println(mayoresCinco);
    }

    public void ordenarDescendentemente(){
        List<Integer> listado = numeros.stream().sorted((a,b)-> b - a).collect(Collectors.toList());
        System.out.println(listado);
    }

    public void eliminarDuplicados(){
        List<Integer> listado = numeros.stream().distinct().collect(Collectors.toList());
        System.out.println(listado);
    }

    public void saltarPrimerosCincos(){
        List<Integer> listado = numeros.stream().skip(5).collect(Collectors.toList());
        System.out.println(listado);
    }

}
