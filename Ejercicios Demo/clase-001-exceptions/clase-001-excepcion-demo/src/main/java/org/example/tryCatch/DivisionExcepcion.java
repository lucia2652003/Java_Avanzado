package org.example.tryCatch;

import java.util.Scanner;

public class DivisionExcepcion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero");
        int num2 = scanner.nextInt();

       try {
            int resultado = num1 / num2;
            System.out.println(resultado);
        }catch (Exception e){
            // capturar la Exceptions
          /* System.err.println("Error: no se puede dividir por 0");*/
           System.err.println(e);
        }finally {
           scanner.close();
        }
    }
}
