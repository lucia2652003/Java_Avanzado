package org.example.recursividad.codeaConmigo;

import org.example.recursividad.codeaConmigo.entities.Auto;

import java.util.ArrayList;
import java.util.List;

/*
* Crea un programa en Java que incluya una entidad llamada Auto con los siguientes atributos:
* id (int): Identificador único del auto.
* marca (String): Marca del auto.
* modelo (String): Modelo del auto.
* kilometraje (int): Kilómetros recorridos.
*

* Tu tarea es:
* Implementar la entidad Auto con los atributos mencionados y su constructor.
* Crear una lista de autos en el programa principal.
* Implementar dos métodos recursivos:
* Calcular el kilometraje total: Recorrer recursivamente la lista de autos para sumar el kilometraje de todos los autos.
* Buscar un auto por marca: Recorrer la lista recursivamente para encontrar el primer auto que coincida con la marca buscada.

* Finalmente, muestra en la consola:
* El kilometraje total de todos los autos.
* Los detalles del auto encontrado o un mensaje indicando que no se encontró.
*
* Nota:
calcularKilometrajeTotal: Recorre la lista recursivamente, sumando el kilometraje de cada auto hasta llegar al final.
buscarAutoPorMarca: Recorre la lista recursivamente buscando un auto que coincida con la marca.
Ambos métodos terminan cuando se alcanza el caso base, evitando bucles explícitos.
*
* */
public class main_codea {
    public static void main(String[] args) {

        //Crear listado de autos
        List<Auto> listadoAutos = new ArrayList<>();
        listadoAutos.add(new Auto(12, "Toyota", "Corolla", 6500));
        listadoAutos.add(new Auto(5, "Ford", "Focus", 2000));
        listadoAutos.add(new Auto(6, "Honda", "Civic", 1400));
        listadoAutos.add(new Auto(27, "Volkswagen", "Golf", 4700));
        listadoAutos.add(new Auto(50, "Seat", "Altea", 1200));
        listadoAutos.add(new Auto(7, "Audi", "A3", 3500));

        //Calculo de Kilometraje
        int totalKM = Auto.calcularKilometraje(listadoAutos,0, 0);

        //Buscar auto por Marca
        String marca = "Seat";
        Auto autoBuscar = Auto.buscarAutoMarca(listadoAutos,0, marca);
        String encontrado = autoBuscar != null ? autoBuscar.toString() : "No hay datos de esa marca "+marca;

        System.out.println("Kilometraje total: "+totalKM);
        System.out.println(encontrado);

    }
}
