package org.example.Semana_23_26.Dia_23_12_2024.Ejercicio2.exceptions;

//Validar de parámetros del producto
public class InvalidProductException extends RuntimeException {
    public InvalidProductException() {
    }

    public InvalidProductException(String message) {
        super(message);
    }
}
