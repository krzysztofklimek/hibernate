//https://www.youtube.com/watch?v=iaSd_yK9xaw&list=PL4AFF701184976B25&index=6


import pl.insert.dao.DogDao;
import pl.insert.model.Dog;

import java.util.Date;

public class Main {

    public static void main (String [] args){

        DogDao dogDao = new DogDao();

        Dog dog = new Dog();
        dog.setName("reksio junior");
        dog.setAge(4);
        dog.setBirthDate(new Date());
        dog.setDescription("asdfasdfasdgfadsgargra");


        System.out.println(dogDao.insertDog(dog));

    }





}
