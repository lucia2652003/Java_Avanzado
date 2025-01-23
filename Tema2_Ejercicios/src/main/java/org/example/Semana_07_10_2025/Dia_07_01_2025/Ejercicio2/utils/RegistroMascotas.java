package org.example.Semana_07_10_2025.Dia_07_01_2025.Ejercicio2.utils;

import org.example.Semana_07_10_2025.Dia_07_01_2025.Ejercicio2.entities.Mascota;

import java.util.*;

public class RegistroMascotas {


    public static LinkedList<Mascota> agregarMascota(Mascota o, LinkedList<Mascota> clinica) {
        clinica.add(o);
        System.out.println("Ha sido insertado la mascota "+o.getNombre()+ " el "+o.getEspecie());
        return clinica;
    }

    public static void buscarMascotas(String nombre, String esp, LinkedList<Mascota> mascotas) {
        if(!esp.isEmpty()){
            System.out.println("----- Listado de "+esp+" -----");
            mascotas.stream()
                    .filter(mascota -> mascota.getEspecie().equalsIgnoreCase(esp))
                    .forEach(System.out::println);
            System.out.println();
        }

        if(!nombre.isEmpty()){
            int indice = Collections.binarySearch(mascotas.stream()
                                                          .map(Mascota::getNombre)
                                                          .toList(),nombre);
            System.out.println("Mascota encontrada "+mascotas.get(indice));
            System.out.println();
        }

    }

    public static int totalMascotas(LinkedList<Mascota> mascotas) {
        return mascotas.size();
    }

    public static void crearMascotaAleatoria(int limite, LinkedList<Mascota> mascotas) {
        Random random = new Random();

        int id = random.nextInt(limite);//Desde 0 hasta límite
        int edad = random.nextInt(limite);

        //Lista de nombres, para hacer al azar
        List<String> nombres = mascotas.stream().map(Mascota::getNombre).toList();
        //Le paso el indice de la lista nombre.get(ind)
        int ind = random.nextInt(nombres.size());//Número aleatorio desde diferentes nombres

        //Lista de especies, para hacer al azar
        List<String> especies = mascotas.stream().map(Mascota::getEspecie).toList();
        //Le paso el indice de la lista especies.get(indice)
        int indice = random.nextInt(especies.size());//Número aleatorio desde diferentes especies

        agregarMascota(new Mascota<>(id,nombres.get(ind),edad, especies.get(indice)), mascotas);
    }


}
