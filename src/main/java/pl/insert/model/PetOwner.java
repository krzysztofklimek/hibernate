package pl.insert.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name="PET_OWNERS")
public class PetOwner {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID")
    private long id;

    @OneToOne
    @JoinColumn(name="PET_LICENCE_ID")
    private PetLicence petLicence;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="city", column=@Column(name="HOME_CITY")),
            @AttributeOverride(name="pincode", column=@Column(name="HOME_PINCODE")),
            @AttributeOverride(name="street", column=@Column(name="HOME_STREET"))
    })
    private Address homeAddress;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="city", column=@Column(name="OFFICE_CITY")),
            @AttributeOverride(name="pincode", column=@Column(name="OFFICE_PINCODE")),
            @AttributeOverride(name="street", column=@Column(name="OFFICE_STREET"))
    })
    private Address officeAddress;

    @OneToMany(mappedBy = "petOwner")
    private Collection<Dog> petsList = new ArrayList<Dog>();


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }
    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getOfficeAddress() {
        return officeAddress;
    }
    public void setOfficeAddress(Address officeAddress) {
        this.officeAddress = officeAddress;
    }

    public PetLicence getPetLicence() {
        return petLicence;
    }
    public void setPetLicence(PetLicence petLicence) {
        this.petLicence = petLicence;
    }

    public Collection<Dog> getPetsList() {
        return petsList;
    }
    public void setPetsList(Collection<Dog> petsList) {
        this.petsList = petsList;
    }

}
