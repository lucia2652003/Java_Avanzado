package org.example;

import org.example.entities.Turno;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
          // Crear una lista de turnos
        List<Turno> turnos = new ArrayList<>();
        turnos.add(new Turno(1, "Juan Pérez", "Urgente", LocalDateTime.of(2025, 1, 1, 10, 0), LocalDateTime.of(2025, 1, 1, 11, 0)));
        turnos.add(new Turno(2, "Ana Gomez", "Chequeo", LocalDateTime.of(2025, 10, 2, 12, 0), LocalDateTime.of(2025, 10, 2, 13, 0)));
        turnos.add(new Turno(3, "Carlos Gómez", "Chequeo", LocalDateTime.of(2025, 12, 3, 9, 0), LocalDateTime.of(2025, 12, 3, 10, 0)));
        turnos.add(new Turno(4, "Brian Pérez", "Urgente", LocalDateTime.of(2025, 11, 1, 10, 0), LocalDateTime.of(2025, 11, 1, 11, 0)));
        turnos.add(new Turno(5, "Ana Gomez", "Consulta", LocalDateTime.of(2025, 2, 2, 12, 0), LocalDateTime.of(2025, 2, 2, 13, 0)));

        // Filtrar por nombrePaciente
        Optional<List<Turno>> turnosPorNombre = Turno.filtrarPorNombrePaciente(turnos , "Ana Gomez");
    /*    turnosPorNombre.ifPresent(System.out::println);*/

        // Filtrar por tipoPaciente
        Optional<List<Turno>> turnosPorTipo = Turno.filtrarPorTipoPaciente(turnos,"Urgente" );
       /* turnosPorTipo.ifPresent(System.out::println);*/

        // Filtrar por rango de fechaHoraInicio
        Turno.filtrarPorRangoFechaInicioPaciente(turnos, LocalDateTime.of(2025, 12, 2, 9, 0), LocalDateTime.of(2025, 12, 4, 10, 0)).stream().forEach(System.out::println);

        // Filtrar por rango de fechaHoraFin
        Turno.filtrarPorRangoFechaFinPaciente(turnos, LocalDateTime.of(2025, 2, 2, 11, 0), LocalDateTime.of(2025, 2, 2, 15, 0)).stream().forEach(System.out::println);
    }
}