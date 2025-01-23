package com.example.exceptions;

public class InvalidVotacion extends Exception{
    public InvalidVotacion() {
    }

    public InvalidVotacion(String message) {
        super(message);
    }
}
