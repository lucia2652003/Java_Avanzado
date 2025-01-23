package org.example.generics.generic;

import org.example.generics.entities.Producto;

import java.util.ArrayList;
import java.util.List;

public class ProductoInventario <T extends Producto>{
    private List<T> listado;

    public ProductoInventario() {
        this.listado = new ArrayList<>();
    }

    public void agregarProducto(T elemento){
        listado.add(elemento);
        System.out.println("Producto agregado al inventario: "+elemento.getNombre());
    }

    public void mostrarProductoEnInventario(){
        System.out.println("Inventario:");
        for(T producto: listado){
            System.out.println(producto);
        }
    }
}
