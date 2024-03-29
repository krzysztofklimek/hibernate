package pl.insert.dao;

import pl.insert.hibernate.TransactionCallback;
import pl.insert.hibernate.TransactionTemplate;
import pl.insert.model.Dog;
import pl.insert.model.Spot;

import javax.persistence.EntityManager;
import java.util.ArrayList;

public class DogDao {



    public Dog insertDog(final Dog dog){

        return
                TransactionTemplate.execute(new TransactionCallback(){
                    public Dog doInTransaction(EntityManager entityManager) {
                        entityManager.persist(dog);
                        return dog;
                    }
                });
    }

}
