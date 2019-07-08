package pl.insert.dao;

import pl.insert.hibernate.TransactionCallback;
import pl.insert.hibernate.TransactionTemplate;
import pl.insert.model.Spot;

import javax.persistence.EntityManager;

public class SpotDao {

    public Spot insertSpot(final Spot spot){
        return
                TransactionTemplate.execute(new TransactionCallback(){
                    public Spot doInTransaction(EntityManager entityManager){
                        entityManager.persist(spot);
                        return spot;
                    }
        });
    }

}
