package org.example.Semana_07_10_2025.Dia_08_01_2025.ejercicio01;

import java.util.ArrayList;
import java.util.List;

class Directorio {
    String nombre;
    List<Directorio> subdirectorios;
    List<String> archivos;

    Directorio(String nombre) {
        this.nombre = nombre;
        this.subdirectorios = new ArrayList<>();
        this.archivos = new ArrayList<>();
    }

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    List<Directorio> getSubdirectorios() {
        return subdirectorios;
    }

    void setSubdirectorios(List<Directorio> subdirectorios) {
        this.subdirectorios = subdirectorios;
    }

    List<String> getArchivos() {
        return archivos;
    }

    void setArchivos(List<String> archivos) {
        this.archivos = archivos;
    }

    static void crearSubdirectorio(Directorio carpeta, String nombreSubD) {
        carpeta.getSubdirectorios().add(new Directorio(nombreSubD));
        System.out.println("Subdirectorio "+nombreSubD+" creado");
    }

    static void crearArchivo(Directorio carpeta, String file) {
        if(carpeta != null){
            carpeta.getArchivos().add(file);
            System.out.println("Fichero "+file+" ha sido creado");
        }
        else System.out.println("No existe el direcorio");
    }

    @Override
    public String toString() {
        return "Directorio{" +
                "nombre='" + nombre + '\'' +
                ", subdirectorios=" + subdirectorios +
                ", archivos=" + archivos +
                '}';
    }
}

