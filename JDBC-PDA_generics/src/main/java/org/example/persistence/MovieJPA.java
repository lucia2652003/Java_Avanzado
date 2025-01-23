package org.example.persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.example.entities.Movie;

import java.util.List;


public class MovieJPA {

    public void create(Movie nueva) {
        EntityManager em = ConfigJPA.getEntityManagerFactory();
        try{
            //Iniciar la transacción
            em.getTransaction().begin();
            em.persist(nueva);
            em.getTransaction().commit();//Tenerlo insertado
            System.out.println("Movie insertado");
        }finally{
            em.close();
        }// fin try...catch
    }


    public Movie findMovie(Integer idBuscar) {
        EntityManager em = ConfigJPA.getEntityManagerFactory();
        try{
            return em.find(Movie.class,idBuscar); //Encuentra el movie con ese id
        }finally{
            em.close();
        }// fin try...catch
    }

    public List<Movie> findAll() {
        EntityManager em = ConfigJPA.getEntityManagerFactory();
        try{
            TypedQuery<Movie> tp = em.createQuery("SELECT p FROM movies p",Movie.class);
            return tp.getResultList();
        }finally{
            em.close();
        }// fin try...catch
    }

    public void updateMovie(Movie peliculaAnt) {
        EntityManager em = ConfigJPA.getEntityManagerFactory();
        try{
            //Iniciar la transacción
            em.getTransaction().begin();
            em.merge(peliculaAnt);
            em.getTransaction().commit();//Tenerlo insertado
            System.out.println("Movie Actualizado");
        }finally{
            em.close();
        }// fin try...catch
    }

    public void delete(Integer idEliminar) {
        EntityManager em = ConfigJPA.getEntityManagerFactory();
        try{
            //Iniciar la transacción
            em.getTransaction().begin();
            Movie eliminado = em.find(Movie.class,idEliminar);

            if(eliminado == null){
                System.out.println("No existe ese movie. Lo siento");
            }else{
                em.remove(eliminado);
            }
            em.getTransaction().commit();//Tenerlo insertado
        }finally{
            em.close();
        }// fin try...catch
    }
}
