package org.example.streams.ejercicio.entities;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Turnos {

    private Integer idTurno;
    private String nombrePaciente;
    private String tipoPaciente;
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFin;

    public Turnos() {
    }

    public Turnos(Integer idTurno, String nombrePaciente, String tipoPaciente, LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraFin) {
        this.idTurno = idTurno;
        this.nombrePaciente = nombrePaciente;
        this.tipoPaciente = tipoPaciente;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
    }

    public Integer getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(Integer idTurno) {
        this.idTurno = idTurno;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getTipoPaciente() {
        return tipoPaciente;
    }

    public void setTipoPaciente(String tipoPaciente) {
        this.tipoPaciente = tipoPaciente;
    }

    public LocalDateTime getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public LocalDateTime getFechaHoraFin() {
        return fechaHoraFin;
    }

    public void setFechaHoraFin(LocalDateTime fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }

    //métodos
    public static  Optional<List<Turnos>>  filtrarNombre(String nombre, List<Turnos> listadoPac){
        List<Turnos> encontrado = listadoPac.stream()
                .filter(n -> n.getNombrePaciente().equalsIgnoreCase(nombre))
                .collect(Collectors.toList());
        return encontrado.isEmpty() ?  Optional.empty() : Optional.of(encontrado);
    }

    public static void filtrarTipoPaciente(String tipo, List<Turnos> listadoPac){
        boolean enc = listadoPac.stream()
                .anyMatch(n -> n.getTipoPaciente().equalsIgnoreCase(tipo));
        System.out.println("Hay pacientes "+tipo+"?: "+enc);
        listadoPac.stream()
                .filter(n -> n.getTipoPaciente().equals(tipo))
                .forEach(System.out::println);
        System.out.println();
    }


    public static Optional<List<Turnos>> filtrarFechaInico(LocalDateTime desde, LocalDateTime hasta, List<Turnos> listadoPac){
        List<Turnos> filtrado = listadoPac.stream()
                .filter(n -> n.getFechaHoraFin().isAfter(desde) && n.getFechaHoraFin().isBefore(hasta))
                .collect(Collectors.toList());
        return filtrado.isEmpty() ? Optional.empty() : Optional.of(filtrado);
    }

    public static Optional<List<Turnos>> filtrarFechaFin(LocalDateTime desde, LocalDateTime hasta, List<Turnos> listadoPac){
        List<Turnos> filtrado = listadoPac.stream()
                .filter(n -> n.getFechaHoraFin().isAfter(desde) && n.getFechaHoraFin().isBefore(hasta))
                .collect(Collectors.toList());
        return filtrado.isEmpty() ? Optional.empty() : Optional.of(filtrado);
    }

    public static void filtrarFechaFin_Anho(int anho,  List <Turnos> listadoPac){
        long conta = listadoPac.stream()
                .filter(n-> n.getFechaHoraFin().getYear() == anho)
                .count();
        String vl = conta == 0 ? "No hay empleados dados de alta en año ":"Pacientes que se dieron de alta en el AÑO "+anho ;
        System.out.println(vl);
        listadoPac.stream()
                .filter(n-> n.getFechaHoraFin().getYear() == anho)
                .forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Turnos{" +
                "idTurno=" + idTurno +
                ", nombrePaciente='" + nombrePaciente + '\'' +
                ", tipoPaciente='" + tipoPaciente + '\'' +
                ", fechaHoraInicio=" + fechaHoraInicio +
                ", fechaHoraFin=" + fechaHoraFin +
                '}';
    }
}
