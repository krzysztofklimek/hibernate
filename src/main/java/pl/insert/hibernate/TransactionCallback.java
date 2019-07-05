package pl.insert.hibernate;

import javax.persistence.EntityManager;

public interface TransactionCallback <T> {

    T doInTransaction(EntityManager entityManager);



}
