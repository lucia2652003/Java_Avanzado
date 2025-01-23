package org.example.codeaConmigo.entities;

import org.example.codeaConmigo.exception.InvalidSalaryException;

public class Empleado {
    private String nombre;
    private String apellido;
    private Integer salario;

    //Constructores
    public Empleado() {
    }

    public Empleado(String nombre, String apellido, Integer salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    //Getters y setters
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

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    //Métodos
    public static void addEmployee(String nombre, String apellido, int salario) {
        Empleado emp = null;
        try {
            if(salario <= 0 || salario > 100000){
                throw new InvalidSalaryException("Salario inválido. No debe ser negativo ni mayor a 100.000");
            }else{
                emp = new Empleado(nombre,apellido,salario);
            }
        } catch (InvalidSalaryException ex){
            System.out.println(ex.getMessage());
        } finally {
            if (emp == null) {
                System.out.println("Empleado no insertado");
            }else{
                System.out.println("Empleado insertado");
                System.out.println(emp);
            }
        }// fin finally
    }

    //toString
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", salario=" + salario +
                '}';
    }
}
