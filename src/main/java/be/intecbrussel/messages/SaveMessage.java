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

            Message message = new Message(1, "De boodschap van Opdracht 1 is in de Message table.");
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
