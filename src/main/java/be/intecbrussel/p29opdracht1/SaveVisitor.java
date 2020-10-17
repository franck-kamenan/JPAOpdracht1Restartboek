package be.intecbrussel.p29opdracht1;

import javax.persistence.*;

public class SaveVisitor {

    public static void main(String[] args) {

        EntityManagerFactory emf = null;
        EntityManager em = null;

        try {

            emf = Persistence.createEntityManagerFactory("course");
            em = emf.createEntityManager();
            EntityTransaction tx = em.getTransaction();
            tx.begin();

            Visitor visitor = new Visitor(3, "UFO");
            em.persist(visitor);
            tx.commit();
            System.out.println("Visitor saved in the Visitor table.");
        }finally {

            if (em != null)
                em.close();
            if (emf != null)
                emf.close();
        }
    }
}