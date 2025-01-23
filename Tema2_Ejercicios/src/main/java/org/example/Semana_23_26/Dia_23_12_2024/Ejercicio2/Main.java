package org.example.Semana_23_26.Dia_23_12_2024.Ejercicio2;

import org.example.Semana_23_26.Dia_23_12_2024.Ejercicio2.entitities.Producto;
import org.example.Semana_23_26.Dia_23_12_2024.Ejercicio2.exceptions.InvalidProductException;

import java.util.ArrayList;
import java.util.Scanner;
/*
*
* Ejercicio Nº 2 - Manejo de Inventarios en un Comercio - Individual
Imagina que estás desarrollando un sistema de gestión de inventarios para un comercio
* minorista. Los usuarios pueden agregar productos al
* inventario proporcionando información
* como el nombre del producto, el precio y la cantidad disponible.
*  Tu tarea es implementar una función que maneje la gestión de inventarios,
* validando los datos ingresados y manejando excepciones en caso de errores
* o datos inválidos.
*
* Trata de ser lo más descriptivo posible en cada mensaje de excepción
*  (en caso de que ésta sea personalizada) o de utilizar
* los tipos correctos de excepción en cada caso.
*
* */
public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> ltproductos = new ArrayList<>();

        Scanner t = new Scanner(System.in);

        while(true){
            System.out.println("Introduce un nombre de producto. Para detener introduce 'salir'");
            String nombre = t.nextLine();

            if(nombre.equalsIgnoreCase("salir")) break; //Detener el bucle

            System.out.println("Introduce un precio");
            float precio = Float.parseFloat(t.nextLine());

            System.out.println("Introduce un stock");
            int stock = Integer.parseInt(t.nextLine());

            try {
                Producto pr = new Producto(nombre,precio,stock);
                Producto.addProduct(nombre,precio,stock);
                ltproductos.add(pr);
            } catch (InvalidProductException e) {
                System.out.println("No se podido agregar producto: "+e.getMessage());
            } finally {
                System.out.println("Operación finalizada");
            }// fin finally
        }// fin while

        System.out.println();
        System.out.println("------ Lista productos -------");
        for (Producto producto : ltproductos) {
            System.out.println(producto);
        }
    }
}
