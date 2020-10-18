package be.intecbrussel.messages;

import javax.persistence.*;

public class SaveMessage {

    public static void main(String[] args) {

        EntityManagerFactory emf = null;
        EntityManager em = null;

        try {

            emf = Persistence.createEntityManagerFactory("course");
            em = emf.createEntityManager();
            EntityTransaction tx = em.getTransaction();
            tx.begin();

            Message message = new Message(1, "First Avenger.");
            em.persist(message);
            tx.commit();
            System.out.println("Message saved in the Message table.");
        }finally {

            if (em != null)
                em.close();
            if (emf != null)
                emf.close();
        }
    }
}
