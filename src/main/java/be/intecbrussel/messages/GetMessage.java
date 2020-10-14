package be.intecbrussel.messages;

import javax.persistence.*;

public class GetMessage {

    public static void main(String[] args) {

        EntityManagerFactory emf = null;
        EntityManager em = null;

        try {

            emf = Persistence.createEntityManagerFactory("course");
            em = emf.createEntityManager();
            EntityTransaction tx = em.getTransaction();
            tx.begin();

            Message message = em.find(Message.class, 1L);
            System.out.println(message.getText());
            tx.commit();
        }finally {
            if (em != null)
                em.close();
            if (emf != null)
                emf.close();
        }
    }
}
