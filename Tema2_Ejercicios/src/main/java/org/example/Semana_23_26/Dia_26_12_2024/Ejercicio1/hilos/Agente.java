package org.example.Semana_23_26.Dia_26_12_2024.Ejercicio1.hilos;

import org.example.Semana_23_26.Dia_26_12_2024.Ejercicio1.entities.Llamada;

import java.util.Random;

public class Agente extends Thread{
    private Integer id;
    private Integer segundos;
    Llamada cl;

    public Agente() {
    }

    public Agente(Integer id, Llamada cl, Integer segundos) {
        this.id = id;
        this.cl = cl;
        this.segundos = segundos;
    }

    @Override
    public void run() {

        try {
             System.out.println("El agente "+id+ " ha cogido la llamada del cliente "+cl.getIdcliente());
             int alzar = new Random().nextInt(segundos*1000)+12;
             Thread.sleep(alzar);
             System.out.println("Finalizo el agente "+id+" resolvió la consulta "+cl.getConsulta());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
