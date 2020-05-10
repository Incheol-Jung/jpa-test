package chap6;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * @author Incheol Jung
 */
public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager entityManager =  emf.createEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
//        tx.begin();
//
//
//        tx.commit();
        entityManager.close();
        emf.close();
    }
}
