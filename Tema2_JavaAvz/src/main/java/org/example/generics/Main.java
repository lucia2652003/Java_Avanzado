package org.example.generics;

import org.example.generics.entities.Electrico;
import org.example.generics.entities.Ropa;
import org.example.generics.generic.ProductoInventario;

public class Main {
    public static void main(String[] args) {
        //Crear el inventario Electrico
        ProductoInventario<Electrico> inventarioElectrico = new ProductoInventario<>();
        inventarioElectrico.agregarProducto(new Electrico("Laptop",1200.0,"Apple"));
        inventarioElectrico.agregarProducto(new Electrico("Telefono",1500.0,"Apple"));

        inventarioElectrico.mostrarProductoEnInventario();

        //Inventario de Ropa
        ProductoInventario<Ropa> inventarioRopa = new ProductoInventario<>();
        inventarioRopa.agregarProducto(new Ropa("Camiseta",20.0, "M","Algodón"));
        inventarioRopa.agregarProducto(new Ropa("Sudadera",60.0, "L","Tela"));

        inventarioRopa.mostrarProductoEnInventario();
    }
}
