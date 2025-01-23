package org.example.entities;

import org.example.excepciones.InvalidSalaryException;

public class Empleado {

    private String nombre;
    private String apellido;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    /*mas tarde los metodos*/

    public static void addEmployee(String nombre, String apellido, double salario) throws InvalidSalaryException{
        if (salario < 0 || salario > 100000) {
            throw new InvalidSalaryException("El salario debe estar entre 0 y 100.000$");
        }
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", salario=" + salario +
                '}';
    }
}
