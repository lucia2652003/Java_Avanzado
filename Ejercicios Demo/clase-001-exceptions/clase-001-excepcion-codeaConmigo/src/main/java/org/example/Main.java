package org.example;

import org.example.entities.Empleado;
import org.example.excepciones.InvalidSalaryException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Empleado> empleados =  new ArrayList<>();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.println("Nombre");
            String nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase("salir")) break;

            System.out.println("Apellido");
            String apellido = scanner.nextLine();

            System.out.println("Salario");
            double salario = scanner.nextDouble();
            scanner.nextLine();

            try{
                Empleado emp = new Empleado(nombre, apellido, salario);
                Empleado.addEmployee(nombre, apellido, salario);
                empleados.add(emp);
            } catch (InvalidSalaryException e) {
                System.out.println("Error al agregar empleado: " + e.getMessage());
            }finally {
                System.out.println("Esta operacion finalizada");
            }
        }

        System.out.println("--------Listado de Empleados--------");

        for (Empleado empelado:  empleados ) {
            System.out.println(empelado);
        }

    }
}