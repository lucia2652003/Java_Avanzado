package org.example.Semana_07_10_2025.Dia_08_01_2025.ejercicio01;
/*
*
* Recursividad
*
* Crea un programa que simule la exploración recursiva de directorios en el sistema de
* archivos de un sistema operativo utilizando una estructura de datos propia.

* Emplea una estructura donde cada nodo representa un directorio
* y contiene referencias a sus subdirectorios.

* El programa debe realizar una exploración simulada para mostrar
* la jerarquía de directorios y archivos.

* Pistas:
  class Directorio {
    String nombre;
    List<Directorio> subdirectorios;
    List<String> archivos;

    // Constructor, métodos para agregar subdirectorios y archivos, etc.
  }
* Puedes utilizar una clase Directorio para cada una de
* las carpetas/directorios que contenga como datos: id, nombre, listaSubdirectorios, listaArchivos
*
* Puedes utilizar una clase "ExploradorDirectorios"
* con un método "explorarDirectorio" que sirva para la recursividad
* */
public class Main {

    public static void main(String[] args) {
        Directorio carpeta = new Directorio("Mascotas");

        //Creación de subdirectorios
        Directorio.crearSubdirectorio(carpeta, "Perros");
        Directorio.crearSubdirectorio(carpeta, "Gatos");
        Directorio.crearSubdirectorio(carpeta, "Reptiles");

        //Creación de archivos
        Directorio.crearArchivo(carpeta, "mascotas.pdf");
        Directorio.crearArchivo(carpeta, "horario.png");
        Directorio.crearArchivo(carpeta.getSubdirectorios().stream()
                                                      .filter(e->e.getNombre().equalsIgnoreCase("Perros"))
                                                      .findFirst()
                                                      .get(), "perros.pdf");
        Directorio.crearArchivo(carpeta.getSubdirectorios().stream()
                .filter(e->e.getNombre().equalsIgnoreCase("Gatos"))
                .findFirst().get(), "cat.png");

        //Impresión de jerarquía
        ExploracionDirectorio.explorarDirectorio(carpeta, 0);
    }

}
