package pl.insert.model;


import javax.persistence.*;

@Entity
@Table(name="PET_LICENCE")
public class PetLicence {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="SERIES")
    private long series;

    @Column(name="ACTIVE")
    private boolean active;


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public long getSeries() {
        return series;
    }
    public void setSeries(long series) {
        this.series = series;
    }

    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
}
