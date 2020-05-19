package chap7;

import com.sun.tools.javadoc.Start;

import chap7.entity.Album;
import chap7.entity.Item;
import chap7.entity.Member;
import chap7.entity.Movie;
import chap7.entity.Star;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * @author Incheol Jung
 */
public class Chap7Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager entityManager =  emf.createEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
//
//        Item item1 = new Item();
//        item1.setName("item");
//        entityManager.persist(item1);

        Movie movie1 = new Movie();
        movie1.setName("movie1");
        entityManager.persist(movie1);

        Album album1 = new Album();
        album1.setName("album1");
        entityManager.persist(album1);

        Member member1 = new Member();
        member1.setName("member1");
        entityManager.persist(member1);

        Star star1 = new Star();
        star1.setName("star1");
        entityManager.persist(star1);

        tx.commit();
        entityManager.close();
        emf.close();
    }
}
