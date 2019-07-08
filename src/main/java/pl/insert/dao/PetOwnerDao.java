package pl.insert.dao;

import pl.insert.hibernate.TransactionCallback;
import pl.insert.hibernate.TransactionTemplate;
import pl.insert.model.PetOwner;

import javax.persistence.EntityManager;

public class PetOwnerDao {


    public PetOwner insertPetOwner(final PetOwner petOwner){

        return
                TransactionTemplate.execute(new TransactionCallback(){
                    public PetOwner doInTransaction(EntityManager entityManager){
                        entityManager.persist(petOwner);
                        return petOwner;
                    }
                });

    }





}
