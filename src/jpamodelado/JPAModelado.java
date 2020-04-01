/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpamodelado;


import entities.Redsocial;
import entities.RedsocialPK;
import static entities.Redsocial_.usuarioCollection;
import entities.Usuario;
import static entities.Usuario_.redsocialCollection;
import java.time.Instant;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author George
 */
public class JPAModelado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // TODO code application logic here
//         EntityManagerFactory managerFactory = 
//         Persistence.createEntityManagerFactory("JPAModeladoPU");
//         EntityManager entityManager = 
//         managerFactory.createEntityManager();
//     
//         
//         
//         
//        entityManager.getTransaction().begin();
//        Usuario usuario = new Usuario();
//        usuario.setNombreUsuario("Adorno");
//        usuario.setCorreo("adorno@gmail.com");
//      
//       
//        
//        usuario.setFecha("3/31/2020");
//        usuario.setSexo("M");
//        
//      
//        Redsocial redsocial = new Redsocial();
//        redsocial.setSitioweb("facebook");
//        
//
//      
//        
//
//        
//        entityManager.persist(usuario);
//        entityManager.persist(redsocial);
//
//        entityManager.getTransaction().commit();
//        
        
        
//                TypedQuery<Usuario> query = 
//                entityManager.createQuery(
//                    "SELECT v FROM Videogame v WHERE v.rating >= :rating", Videogame.class);
//        query.setParameter("rating", 4);
//        List<Videogame> list = query.getResultList();
    }
    
}
