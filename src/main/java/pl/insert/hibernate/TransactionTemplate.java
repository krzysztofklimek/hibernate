package pl.insert.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TransactionTemplate {

    public static <T> T execute(TransactionCallback transactionCallback){

        T t = null;

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPAService");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        t = (T) transactionCallback.doInTransaction(entityManager);
        entityManager.getTransaction().commit();

        return t;
    }


}
