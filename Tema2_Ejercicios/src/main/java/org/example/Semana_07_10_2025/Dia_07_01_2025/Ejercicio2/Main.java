package org.example.Semana_07_10_2025.Dia_07_01_2025.Ejercicio2;

import org.example.Semana_07_10_2025.Dia_07_01_2025.Ejercicio2.entities.Mascota;
import org.example.Semana_07_10_2025.Dia_07_01_2025.Ejercicio2.utils.RegistroMascotas;

import java.util.LinkedList;

/*
*
* Una clínica veterinaria necesita un sistema para administrar
* su registro de mascotas, para ello, se solicita la definición de
* una clase genérica Mascota<T> con atributos como nombre, edad, y especie
* (no olvides el código o id de mascota para identificar a cada una).
* Crea una clase utilitaria propia llamada RegistroMascotas
* que cuente con métodos genéricos para:

* Agregar Mascotas al Registro: Utiliza métodos de la
* clase java.util junto con genéricos para manipular
* colecciones como ArrayList o LinkedList y agregar
* mascotas de distinto tipo al registro de la veterinaria
* (puedes tomar como ejemplos de tipos: perros, gatos, reptiles y aves).

* Buscar Mascotas por Nombre o Especie: Emplea métodos de las clases
* utilitarias como Collections o Arrays junto con genéricos para
* realizar búsquedas eficientes por nombre o especie dentro del
* registro de mascotas.

* Contar la Cantidad Total de Mascotas Registradas:
* Utiliza métodos de java.util para obtener el tamaño de
* la colección y contar la cantidad total de mascotas
* registradas en la veterinaria.

* Generar Datos Aleatorios para Mascotas:
* Utiliza la clase Random de java.util para generar
* datos aleatorios, como nombres, edades o especies,
* para agregar mascotas al registro.

*
* */
public class Main {
    public static void main(String[] args) {
        LinkedList<Mascota> mascotas = new LinkedList<>();

        RegistroMascotas.agregarMascota(new Mascota<>(1,"Pablo",15,"perro"), mascotas);
        RegistroMascotas.agregarMascota(new Mascota<>(2,"Toto",22,"perro"), mascotas);
        RegistroMascotas.agregarMascota(new Mascota<>(3,"Laura",8,"ave"), mascotas);
        RegistroMascotas.agregarMascota(new Mascota<>(4,"Pepe",13,"ave"), mascotas);
        RegistroMascotas.agregarMascota(new Mascota<>(5,"Paco",7,"gato"), mascotas);
        RegistroMascotas.agregarMascota(new Mascota<>(6,"Igor",12,"reptil"),mascotas);

        //Buscar mascotas por nombre o especie
        RegistroMascotas.buscarMascotas("Paco","perro",mascotas);
        RegistroMascotas.buscarMascotas("","ave",mascotas);

        //Total de Máscotas
        int cant = RegistroMascotas.totalMascotas(mascotas);
        System.out.println("Total de mascotas: "+cant);

        //Mascotas aleatorias
        RegistroMascotas.crearMascotaAleatoria(25, mascotas);
        mascotas.forEach(System.out::println);

    }

}
