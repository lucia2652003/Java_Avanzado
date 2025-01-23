package org.example.Semana_23_26.Dia_26_12_2024.Ejercicio1.entities;

public class Llamada {
    private Integer idcliente;
    private String consulta;

    public Llamada() {
    }

    public Llamada(Integer idcliente, String consulta) {
        this.idcliente = idcliente;
        this.consulta = consulta;
    }

    public Integer getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }
}
