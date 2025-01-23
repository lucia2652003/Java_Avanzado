package org.example.generics.entities;

public class Ropa extends Producto{

    private String material;
    private String talla;

    public Ropa() {
    }

    public Ropa(String nombre, Double precio, String material, String talla) {
        super(nombre, precio);
        this.material = material;
        this.talla = talla;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
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
        return "Ropa{nombre='" + getNombre() + '\'' +
                ", precio=" + getPrecio() +
                ", material='" + material + '\'' +
                ", talla='" + talla + '\'' + "} ";

    }
}
