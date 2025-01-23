package org.example.Semana_07_10_2025.Dia_08_01_2025.ejercicio02;

import org.example.Semana_07_10_2025.Dia_08_01_2025.ejercicio02.entities.Tarea;

import java.util.Arrays;
import java.util.List;

/*
*
* Ejercicio 2: Organizador de tareas

* Desarrolla una aplicación para organizar tareas en un proyecto. Utiliza la recursividad para
* crear una estructura jerárquica de tareas. Cada tarea puede tener subtareas asociadas,
* y estas subtareas también pueden tener sus propias subtareas, creando así una estructura de
* "árbol de tareas".

El programa debe permitir al usuario agregar tareas principales y subtareas de manera recursiva.
* Además, debe ofrecer la capacidad de visualizar la estructura completa de tareas con sus respectivas
* subtareas.

* 📝Extra Point (OPCIONAL): En caso que quieras agregar un poco de "arte" al ejercicio,
* puedes proponer que las estructuras que se muestren por pantalla sean dibujadas mediante ascii.
*
* */
public class Main {
    public static void main(String[] args) {

        Tarea inicial = new Tarea("Proyecto: Desarrollo de Software");
        List<String> tareasIn = Arrays.asList("Diseño Aplicación", "Implementación de código", "Pruebas y Depuración");

        inicial.crearTareas(inicial, 0, tareasIn);

        //Creación subtareas Diseño
        inicial.crearSubtareas(inicial, 0,"Diseño Aplicación", new Tarea("Crear Prototipo"));
        inicial.crearSubtareas(inicial, 0,"Diseño Aplicación", new Tarea("Diseñar Interfaz",
                                                                                    List.of(new Tarea("Definir Esquema de Colores"),
                                                                                            new Tarea("Diseñar Diseño Responsivo"))));
        inicial.crearSubtareas(inicial, 0,"Diseño Aplicación", new Tarea("Documentar Requisitos"));

        //Subtareas de Implementación de código
        inicial.crearSubtareas(inicial, 0,"Implementación de código", new Tarea("Desarrollar Backend",
                                                                                                  List.of(new Tarea("Configurar Base de Datos"),
                                                                                                  new Tarea("Crear Lógica de Negocios"))));
        inicial.crearSubtareas(inicial, 0,"Implementación de código", new Tarea("Desarrollar Fronted",
                                                                                                  List.of(new Tarea("Codificar Interfaz de Usuario"),
                                                                                                  new Tarea(" Integrar con Backend"))));

        //Creación subtareas Pruebas
        inicial.crearSubtareas(inicial, 0,"Pruebas y Depuración", new Tarea("Ejecutar Pruebas de Integración"));
        inicial.crearSubtareas(inicial, 0,"Pruebas y Depuración", new Tarea("Solucionar Errores"));

        Tarea.mostrarJerarquia(inicial, 0);
    }
}
