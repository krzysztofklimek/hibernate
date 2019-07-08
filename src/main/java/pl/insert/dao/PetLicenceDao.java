package pl.insert.dao;

import pl.insert.hibernate.TransactionCallback;
import pl.insert.hibernate.TransactionTemplate;
import pl.insert.model.PetLicence;

import javax.persistence.EntityManager;

public class PetLicenceDao {


    public PetLicence insertPetLicence(final PetLicence petLicence){
        return
                TransactionTemplate.execute(new TransactionCallback() {
                    public Object doInTransaction(EntityManager entityManager) {
                        entityManager.persist(petLicence);
                        return petLicence;
                    }
                });
    }

}
