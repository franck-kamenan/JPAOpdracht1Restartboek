package be.intecbrussel.p29opdracht1;

import javax.persistence.*;

public class ChangeVisitor {

    public static void main(String[] args) {

        EntityManagerFactory emf = null;
        EntityManager em = null;

        try {

            emf = Persistence.createEntityManagerFactory("course");
            em = emf.createEntityManager();
            EntityTransaction tx = em.getTransaction();
            tx.begin();

            Visitor visitor = em.find(Visitor.class, 3);
            visitor.setName("Alien");
            tx.commit();
            em.close();
        }finally {
            /*if (em != null)
                em.close();*/
            if (emf != null)
                emf.close();
        }
    }
}