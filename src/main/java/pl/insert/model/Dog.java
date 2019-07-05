package pl.insert.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="DOGS")
public class Dog {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID")
    private long id;

    @Column(name="NAME")
    private String name;

    //@Transient (dana wartośc nie będzie brana pod uwagę przy dodawaniu do bazy danych
    @Column(name="AGE")
    private int age;

    @Column(name="BIRTH_DATE")
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @Column(name="DESCRIPTION")
    @Lob //usuwa pgraniczenia dotyczace długości ciągu znaków w bazie danych
    private String description;


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

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
