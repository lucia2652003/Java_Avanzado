package org.example.recursividad.codeaConmigo.entities;

import java.util.List;

public class Auto {

    //Atributos
    private Integer id;
    private String marca;
    private String modelo;
    private Integer km;


    //Constructores
    public Auto() {
    }

    public Auto(Integer id, String marca, String modelo, Integer km) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.km = km;
    }

    //Getters y setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getKm() {
        return km;
    }

    public void setKm(Integer km) {
        this.km = km;
    }

    //Métodos
    public static int calcularKilometraje(List<Auto> listadoAutos, int indice, int sumaKM) {
        //caso base
        if(listadoAutos.size() == indice) return sumaKM;
        //Cuando el índice sea igual al tamaño de la lista se detiene el bucle y devuelve la suma total

        //llamar recursiva
        //Suma los kilómetros del auto anterior
        //En el segundo parametro se pasa al siguiente y se acumula los kilómetros recorridos del auto anterior
        return calcularKilometraje(listadoAutos, indice+1, sumaKM + listadoAutos.get(indice).getKm());
    }


    public static Auto buscarAutoMarca(List<Auto> listadoAutos, int indice, String marcaBuscar) {
        //caso base
        if(listadoAutos.size() == indice) return null;

        if(listadoAutos.get(indice).getMarca().equalsIgnoreCase(marcaBuscar)) return listadoAutos.get(indice);

        //llamar recursiva
        //Pasa al siguiente índice y sigue buscando la marca
        return buscarAutoMarca(listadoAutos, indice+1, marcaBuscar);
    }

    //toString
    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", km=" + km +
                '}';
    }
}
