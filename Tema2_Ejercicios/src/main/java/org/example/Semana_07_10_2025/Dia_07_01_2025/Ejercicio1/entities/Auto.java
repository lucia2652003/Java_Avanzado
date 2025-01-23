package org.example.Semana_07_10_2025.Dia_07_01_2025.Ejercicio1.entities;

public class Auto {
    private String marca;
    private String modelo;
    private Integer anho;
    private double precio;

    public Auto() {
    }

    public Auto(String marca, String modelo, Integer anho, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anho = anho;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnho() {
        return anho;
    }

    public void setAnho(Integer anho) {
        this.anho = anho;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anho=" + anho +
                ", precio=" + precio +
                '}';
    }
}
