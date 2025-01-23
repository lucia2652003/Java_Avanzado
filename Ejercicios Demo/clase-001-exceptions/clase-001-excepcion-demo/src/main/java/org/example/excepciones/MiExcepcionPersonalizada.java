package org.example.excepciones;

public class MiExcepcionPersonalizada extends Exception {

    public MiExcepcionPersonalizada() {
        super();
    }

    public MiExcepcionPersonalizada(String miMensajito) {
        super(miMensajito);
    }
}
