package org.example.streams.ejercicio;

import org.example.streams.ejercicio.entities.Turnos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Consigna con emojis
 * :portapapeles: Consigna
 * :uno: Crea una clase llamada Turnos con los siguientes atributos:
 * :carné_de_identidad: idTurno (Integer)
 * :silueta_de_busto: nombrePaciente (String)
 * :hospital: tipoPaciente (String)
 * :reloj3: fechaHoraInicio (LocalDateTime)
 * :reloj_de_arena_en_marcha: fechaHoraFin (LocalDateTime)
 * :dos: Crea un listado de turnos utilizando la interfaz List en Java. :separadores_de_índice_de_tarjetas:
 * :tres: Implementa métodos que permitan:
 * :lupa: Filtrar por nombrePaciente.
 * :portapapeles: Filtrar por tipoPaciente.
 * :calendario_de_sobremesa: Filtrar por rango de fechaHoraInicio.
 * :reloj_de_alarma: Filtrar por rango de fechaHoraFin.
 * :cuatro: Usa Streams :agua_potable: y la clase Optional :martillo_y_llave_inglesa: para realizar los filtros de manera eficiente.
 * :tecnólogo: ¡Pon a prueba el programa y verifica que los filtros funcionen correctamente!
 *  */
public class Main_codeaConmigo {
    public static void main(String[] args) {

        Turnos t1 = new Turnos(18, "Lucia Blanco", "Urgente", LocalDateTime.of(2022, 12,5,12,5,12),LocalDateTime.of(2024, 11,1,17,11,58));
        Turnos t2 = new Turnos(16, "Noelia Gomez", "Consulta", LocalDateTime.of(2019, 4,14,20,30,0),LocalDateTime.of(2019, 7,25,15,45,0));
        Turnos t3 = new Turnos(1, "Pablo Otero", "Urgente", LocalDateTime.of(2024, 1,20,23,6,35),LocalDateTime.of(2024, 5,26,14,30,0));
        Turnos t4 = new Turnos(36, "Laura Gomez", "Chequeo", LocalDateTime.of(2025, 6,15,21,45,19),LocalDateTime.of(2026, 4,21,16,14,12));

        List<Turnos> listadoPac = new ArrayList<>();
        listadoPac.add(t1);
        listadoPac.add(t2);
        listadoPac.add(t3);
        listadoPac.add(t4);

        //Buscar por nombre
        Optional<List<Turnos>>  buscados = Turnos.filtrarNombre("Noelia Gomez",listadoPac);
        buscados.ifPresent(System.out::println);
        System.out.println();

        //Buscar por tipoPaciente
        Turnos.filtrarTipoPaciente("Urgente",listadoPac);

        //Buscar por fecha de hora de inicio
        Optional<List<Turnos>> busc = Turnos.filtrarFechaInico(LocalDateTime.of(2025,12,4,12,25,30), LocalDateTime.of(2025,12,25, 10,20,36), listadoPac);
        busc.ifPresent(System.out::println);

        //Buscar pacientes que se dieron el de alta en el año que ponemos
        int anho = 2024;
        Turnos.filtrarFechaFin_Anho(anho,listadoPac);
    }
}
