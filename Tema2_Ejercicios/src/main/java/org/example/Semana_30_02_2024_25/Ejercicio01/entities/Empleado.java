package org.example.Semana_30_02_2024_25.Ejercicio01.entities;

import java.util.List;

public class Empleado {

    private String nombre;
    private Integer salario;
    private String categoria;

    public Empleado() {
    }

    public Empleado(String nombre, Integer salario, String categoria) {
        this.nombre = nombre;
        this.salario = salario;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario() {
        this.salario = salario;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    //métodos
    public static void imprimirEmpleadSal(int sal, List<Empleado> empleados) {
        empleados.stream()
                .filter(empl -> empl.getSalario() > sal)
                .forEach(System.out::println);
    }

    public static void promedioCategoria(List<Empleado> empleados) {
        List<String> categorias = empleados.stream().map(Empleado::getCategoria).distinct().toList();

        categorias.forEach(categ->{
            //Agrupación de los salarios por cada categoría
            double salario = empleados.stream()
                    .filter(e -> categ.equals(e.getCategoria()))
                    .mapToInt(Empleado::getSalario)
                    .average().orElse(0.0);

            System.out.println("Promedio de "+categ+": "+salario+" €");
        });// fin for
    }

    public static Integer buscarSalarioMax(List<Empleado> empleados) {
        return empleados.stream().map(Empleado::getSalario).max(Integer::compare).orElse(Integer.MAX_VALUE);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
