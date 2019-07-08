package pl.insert.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name="SPOT")
public class Spot {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column(name="NAME")
    private String name;

    @ManyToMany(mappedBy = "spots")
    private Collection<Dog> dogs = new ArrayList<Dog>();

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Collection<Dog> getDogs() {
        return dogs;
    }
    public void setDogs(Collection<Dog> dogs) {
        this.dogs = dogs;
    }
}
