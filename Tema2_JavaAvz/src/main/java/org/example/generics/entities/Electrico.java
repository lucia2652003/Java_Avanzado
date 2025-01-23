package org.example.generics.entities;

public class Electrico extends Producto{
    private String marca;

    public Electrico() {
    }

    public Electrico(String nombre, Double precio, String marca) {
        super(nombre, precio);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public double getPrecio() {
        return super.getPrecio();
    }

    @Override
    public void setPrecio(double precio) {
        super.setPrecio(precio);
    }

    @Override
    public String toString() {
        return "Electrico{nombre='" + getNombre() + '\'' +
                ", precio=" + getPrecio() +
                ", marca='" + marca + '\'' +"} ";
    }
}
