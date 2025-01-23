package org.example.entities;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Turno {

    private Integer idTurno;
    private String nombrePaciente;
    private String tipoPaciente;
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFin;

    public Turno(Integer idTurno, String nombrePaciente, String tipoPaciente, LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraFin) {
        this.idTurno = idTurno;
        this.nombrePaciente = nombrePaciente;
        this.tipoPaciente = tipoPaciente;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
    }

    // Getters y Setters
    public Integer getIdTurno() {
        return idTurno;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public String getTipoPaciente() {
        return tipoPaciente;
    }

    public LocalDateTime getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public LocalDateTime getFechaHoraFin() {
        return fechaHoraFin;
    }

    //metodos estaticos
    public static Optional<List<Turno>> filtrarPorNombrePaciente(List<Turno>  turnos, String filtro){
        List<Turno> filtrados = turnos.stream().filter(turno -> turno.getNombrePaciente().equalsIgnoreCase(filtro)).collect(Collectors.toList());
        return filtrados.isEmpty()? Optional.empty() : Optional.of(filtrados);
    }

    public static Optional<List<Turno>> filtrarPorTipoPaciente(List<Turno>  turnos, String filtro){
        List<Turno> filtrados = turnos.stream().filter(turno -> turno.getTipoPaciente().equalsIgnoreCase(filtro)).collect(Collectors.toList());
        return filtrados.isEmpty()? Optional.empty() : Optional.of(filtrados);
    }

    public static Optional<List<Turno>> filtrarPorRangoFechaInicioPaciente(List<Turno>  turnos, LocalDateTime desde, LocalDateTime hasta){
         List<Turno> filtrados = turnos.stream()
                                    .filter(turno -> turno.getFechaHoraInicio().isAfter(desde)
                                     && turno.getFechaHoraInicio().isBefore(hasta)).collect(Collectors.toList());
         return filtrados.isEmpty() ? Optional.empty() : Optional.of(filtrados);
    }

    public static Optional<List<Turno>> filtrarPorRangoFechaFinPaciente(List<Turno>  turnos, LocalDateTime desde, LocalDateTime hasta){
        List<Turno> filtrados = turnos.stream()
                .filter(turno -> turno.getFechaHoraFin().isAfter(desde)
                        && turno.getFechaHoraFin().isBefore(hasta)).collect(Collectors.toList());
        return filtrados.isEmpty() ? Optional.empty() : Optional.of(filtrados);
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
