package org.example.Semana_07_10_2025.Dia_08_01_2025.ejercicio01;

public class ExploracionDirectorio {


    static void explorarDirectorio(Directorio carpeta, int indice) {
        //Caso base
        if(carpeta == null)  return; //Cuando llegue al final

        if(carpeta.getSubdirectorios().size() == indice || carpeta.getArchivos().size() == indice){
            System.out.println("Exploración de Directorio");
            System.out.println("-- Directorio: Principal"+ carpeta.getNombre());
            carpeta.getSubdirectorios().forEach(e->{
                System.out.println(" |-- SubDirectorio "+ e.getNombre());
                e.getArchivos().forEach(s -> System.out.println("    |-- "+s));
            });
            carpeta.getArchivos().forEach(System.out::println);
            return; //Se detiene cuando recorra todas las listas recursivas subdirectorio y archivos
        }
        //llamada recursiva
        explorarDirectorio(carpeta, indice+1);//Pasa al siguiente índice
    }
}
