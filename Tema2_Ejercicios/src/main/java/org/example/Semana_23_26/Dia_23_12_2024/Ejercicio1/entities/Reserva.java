package org.example.Semana_23_26.Dia_23_12_2024.Ejercicio1.entities;

import org.example.Semana_23_26.Dia_23_12_2024.Ejercicio1.exceptions.ReservaInvalidaException;

import java.time.LocalDate;

public class Reserva {
    private String nombre;
    private String destino;
    private LocalDate fecha_viaje;
    private Integer asientos;

    public Reserva() {
    }

    public Reserva(String nombre, String destino, LocalDate fecha_viaje, Integer asientos) {
        this.nombre = nombre;
        this.destino = destino;
        this.fecha_viaje = fecha_viaje;
        this.asientos = asientos;
    }

    //Asientos disponibles
    public Reserva(Integer asientos) {
        this.asientos = asientos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFecha_viaje() {
        return fecha_viaje;
    }

    public void setFecha_viaje(LocalDate fecha_viaje) {
        this.fecha_viaje = fecha_viaje;
    }

    public Integer getAsientos() {
        return asientos;
    }

    public void setAsientos(Integer asientos) {
        this.asientos = asientos;
    }

    //Métodos
    public void validacionDatos(String nombre, String destino, LocalDate fechav, int asiento) throws ReservaInvalidaException {

        if(nombre.isEmpty() || destino.isEmpty()){
            throw new ReservaInvalidaException("No puedes dejar campos vaciós");
        }

        if(asiento <= 0) throw new ReservaInvalidaException("No puedes introducir valores negativos");

        if(asiento > asientos)
            throw new ReservaInvalidaException("No puedes introducir asientos que superen el rango "+asientos);

            asientos -= asiento; //Quitar las plazas
            System.out.println("Reserva exitosa te quedan "+asientos);

    }
    @Override
    public String toString() {
        return "Reserva{" +
                "nombre='" + nombre + '\'' +
                ", destino='" + destino + '\'' +
                ", fecha_viaje=" + fecha_viaje +
                ", asientos=" + asientos +
                '}';
    }


}
