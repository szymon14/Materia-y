package pl.b2b.model;


import javax.persistence.*;

@Entity
public class ParkingSpace {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private CarOwner carOwner;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CarOwner getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(CarOwner carOwner) {
        this.carOwner = carOwner;
    }
}
