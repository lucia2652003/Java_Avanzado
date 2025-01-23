package org.example.excepciones;

public class MIExcepcionPersonalizada extends Exception {
    public MIExcepcionPersonalizada() {
        super();
    }

    public MIExcepcionPersonalizada(String message) {
        super(message);
    }
}
