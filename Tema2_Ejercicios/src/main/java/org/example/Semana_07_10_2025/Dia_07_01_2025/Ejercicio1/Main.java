package org.example.Semana_07_10_2025.Dia_07_01_2025.Ejercicio1;

import org.example.Semana_07_10_2025.Dia_07_01_2025.Ejercicio1.entities.Auto;
import org.example.Semana_07_10_2025.Dia_07_01_2025.Ejercicio1.generic.InventarioAutos;

/*
* Ejercicio 1: Concesionaria de autos
Una concesionaria de vehículos necesita un sistema para administrar
* su inventario de autos. Crea una clase Auto
* con atributos como marca, modelo, año, y precio.
* Implementa una clase utilitaria InventarioAutos con
* métodos genéricos para realizar las siguientes operaciones:

* Agregar Autos al Inventario: Utiliza un
* método genérico para agregar autos al inventario de la concesionaria.

* Buscar Autos por Marca o Año: Implementa métodos
* genéricos que permitan buscar autos por marca o año dentro del inventario.

* Calcular el Valor Total del Inventario:
* Desarrolla un método genérico que calcule el valor total de todos
* los autos en el inventario.
*
* */

public class Main {
    public static void main(String[] args) {
        //Crea inventario
        InventarioAutos<Auto> listado = new InventarioAutos<>();
        listado.agregarAuto(new Auto("Toyota", "Fondus", 2025,1500.0));
        listado.agregarAuto(new Auto("Honda", "Civic", 2003, 3000.0));
        listado.agregarAuto(new Auto("Volkswagen", "Golf", 2012,1800.0));
        listado.agregarAuto(new Auto("Toyota", "Elf", 2003, 9600.0));

        //Buscar coches por marca o año
        listado.buscarAuto("Toyota",0);
        listado.buscarAuto("",2003);

        //Valor total del inventario
        double total = listado.calculoTotalSalario();
        System.out.println("El salario total es de "+total+" €");
    }
}
