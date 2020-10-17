package be.intecbrussel.messages;

import javax.persistence.*;

public class ChangeMessage {

    public static void main(String[] args) {

        EntityManagerFactory emf = null;
        EntityManager em = null;

        try {

            emf = Persistence.createEntityManagerFactory("course");
            em = emf.createEntityManager();
            EntityTransaction tx = em.getTransaction();
            tx.begin();

            Message message = em.find(Message.class, 3);
            message.setText("Hello Mars");
            tx.commit();
            em.close();
            message.setText("Hello Venus");
        }finally {
            if (em != null)
                em.close();
            if (emf != null)
                emf.close();
        }
    }
}