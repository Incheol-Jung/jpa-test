package chap6;

import chap6.entity.Member;
import chap6.entity.Team;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * @author Incheol Jung
 */
public class Chap6Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager entityManager =  emf.createEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();

        Member member1 = new Member("incheol");
        entityManager.persist(member1);

        Team team1 = new Team("team1");
        entityManager.persist(team1);

        Team team2 = entityManager.find(Team.class, 1L);
        team2.getMembers().add(member1);

        tx.commit();
        entityManager.close();
        emf.close();
    }
}
