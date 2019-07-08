//https://www.youtube.com/watch?v=iaSd_yK9xaw&list=PL4AFF701184976B25&index=6


import pl.insert.dao.DogDao;
import pl.insert.dao.PetLicenceDao;
import pl.insert.dao.PetOwnerDao;
import pl.insert.dao.SpotDao;
import pl.insert.model.*;

import java.util.Date;

public class Main {

    public static void main (String [] args){


        //CREATING OBJECTS
        Address homeAddress = new Address();
        Address officeAddress = new Address();
        PetLicence petLicence = new PetLicence();
        Dog dog = new Dog();
        Dog dog2 = new Dog();
        PetOwner petOwner = new PetOwner();
        Spot spot = new Spot();
        Spot spot2 = new Spot();


        //SETTING HOME ADDRESS
        homeAddress.setCity("home city name");
        homeAddress.setPincode("home pincode");
        homeAddress.setStreet("home street name");

        //CSETTING OFFICE ADDRESS
        officeAddress.setCity("home city name");
        officeAddress.setPincode("home pincode");
        officeAddress.setStreet("home street name");

        //SETTING PET LICENCE
        petLicence.setActive(true);
        petLicence.setSeries(1234567890);

        //SETTING SPOTS
        spot.setName("spot");
        spot2.setName("spot 2");

        //ADDING SPOTS TO DATABASE potrzebuje do wsadzenia ich do zwierząt many to many
        SpotDao spotDao = new SpotDao();
        spotDao.insertSpot(spot);
        spotDao.insertSpot(spot2);

        //SETTING DOGS
        dog.setName("reksio junior");
        dog.setAge(4);
        dog.setBirthDate(new Date());
        dog.setDescription("asdfasdfasdgfadsgargra");
        dog.setPetOwner(petOwner);
        dog.getSpots().add(spot);
        dog.getSpots().add(spot2);


        dog2.setName("reksio senior");
        dog2.setAge(7);
        dog2.setBirthDate(new Date());
        dog2.setDescription("asdfasdfasdgfadsgargra");
        dog2.setPetOwner(petOwner);


        //SETTING OWNER
        petOwner.setFirstName("first name");
        petOwner.setLastName("last name");
        petOwner.setHomeAddress(homeAddress);
        petOwner.setOfficeAddress(officeAddress);
        petOwner.setPetLicence(petLicence);
        petOwner.getPetsList().add(dog);
        petOwner.getPetsList().add(dog2);




        //DATABASE OPERATIONS
        PetLicenceDao petLicenceDao = new PetLicenceDao();
        petLicenceDao.insertPetLicence(petLicence);

        PetOwnerDao petOwnerDao = new PetOwnerDao();
        petOwnerDao.insertPetOwner(petOwner);

        DogDao dogDao = new DogDao();
        dogDao.insertDog(dog);
        dogDao.insertDog(dog2);


    }





}
