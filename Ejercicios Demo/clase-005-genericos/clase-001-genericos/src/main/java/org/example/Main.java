package org.example;

import org.example.entities.Electrico;
import org.example.entities.Ropa;
import org.example.genericos.ProductoInventario;

public class Main {
    public static void main(String[] args) {
       //Crear el inventario
      /*  ProductoInventario<Electrico> inventarioElectrico = new ProductoInventario<>();
        inventarioElectrico.agregarProducto(new Electrico("Laptop",1200.0, "Apple"));
        inventarioElectrico.agregarProducto(new Electrico("Telefono",1500.0, "Apple"));

        inventarioElectrico.mostrarInventario();*/
        
        ProductoInventario<Ropa> inventarioRopa = new ProductoInventario<>();
        inventarioRopa.agregarProducto(new Ropa("Camiseta", 20.0, "M", "Algodón"));
        inventarioRopa.agregarProducto(new Ropa("Jeans", 28.0, "L", "Tela"));

        inventarioRopa.mostrarInventario();

    }
}