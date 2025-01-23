package org.example.Semana_07_10_2025.Dia_07_01_2025.Ejercicio1.generic;

import org.example.Semana_07_10_2025.Dia_07_01_2025.Ejercicio1.entities.Auto;

import java.util.ArrayList;
import java.util.List;

public class InventarioAutos <T extends Auto>{
    private List<T> inventario;

    public InventarioAutos() {
        this.inventario = new ArrayList<>();
    }


    public void agregarAuto(T nuevo) {
        inventario.add(nuevo);
        System.out.println("El auto "+nuevo.getMarca()+" ha sido almacenado !!!");
    }

    public void buscarAuto(String marca, int anho) {
        List<T> mostrado = inventario.stream()
                                      .filter(e-> e.getMarca().equals(marca) || e.getAnho() == anho)
                                      .toList();

        if(anho != 0){
            System.out.println("Inventario del año "+anho+": ");
            mostrado.forEach(System.out::println);
        }

        if(!marca.isEmpty()){
            System.out.println("Inventario de la marca "+marca+": ");
            mostrado.forEach(System.out::println);
        }
    }

    public double calculoTotalSalario() {
        return inventario.stream()
                         .map(Auto::getPrecio)
                         .reduce(0.0, (Double::sum));
    }
}
