package org.example.Semana_23_26.Dia_23_12_2024.Ejercicio1.exceptions;

public class ReservaInvalidaException extends RuntimeException {
    public ReservaInvalidaException() {
    }

    public ReservaInvalidaException(String message) {
        super(message);
    }
}
