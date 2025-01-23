package org.example.Semana_23_26.Dia_23_12_2024.Ejercicio2.entitities;

import org.example.Semana_23_26.Dia_23_12_2024.Ejercicio2.exceptions.InvalidProductException;

public class Producto {
    private String nombre;
    private Float precio;
    private Integer cantidad;


    //Constructores
    public Producto() {
    }

    public Producto(String nombre, Float precio, Integer cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    //Métodos
    public static void addProduct(String nombre, float precio, int stock) {
        if(stock <= 0 || precio <= 0) throw new InvalidProductException("Stock/Precio inválido. Debe ser positivo");

        if(nombre.isEmpty() || nombre == null) throw new InvalidProductException("Los campos no pueden estar vacíos");

    }

    //toString()
    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }
}
