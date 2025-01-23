package org.example.Semana_30_02_2024_25.Ejercicio01;

import org.example.Semana_30_02_2024_25.Ejercicio01.entities.Empleado;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/*
* Crea una aplicación que maneje información sobre empleados.
* Cada empleado tiene un nombre, un salario y una categoría (por ejemplo, "Desarrollador",
* "Analista", "Gerente"). Implementa las siguientes operaciones utilizando Streams y Optionals:
*
* Filtra los empleados cuyo salario sea mayor a cierto valor específico.
* Agrupa los empleados por categoría y calcula el salario promedio para cada categoría.
* Encuentra al empleado con el salario más alto utilizando Optionals.
*
*
* */
public class Main {
    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);

        Empleado e1 = new Empleado("Laura",1500,"Desarrollador");
        Empleado e2 = new Empleado("Inés",2050,"Analista");
        Empleado e3 = new Empleado("Jorge",6000,"Analista");
        Empleado e4 = new Empleado("Nuria",4000,"Desarrollador");
        Empleado e5 = new Empleado("James",960,"Gerente");
        Empleado e6 = new Empleado("Maite",3600,"Desarrollador");

        List<Empleado> empleados = Arrays.asList(e1,e2,e3,e4,e5,e6);

        System.out.println("Introduce un salario específico");
        int sal = t.nextInt();
        Empleado.imprimirEmpleadSal(sal,empleados);//Imprime empleados con el salario mayor de lo específico

        Empleado.promedioCategoria(empleados);//Promedio de cada categoria

        int salMax = Empleado.buscarSalarioMax(empleados);
        System.out.println("El salario maáximo es "+salMax+" €");
    }
}
