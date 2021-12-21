package pl.b2b.model;

import javax.persistence.*;

@Entity
public class Car {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private CarOwner carOwner;
    private String registrationNumber;

    public Car(Long id, CarOwner carOwner, String registrationNumber) {
        this.id = id;
        this.carOwner = carOwner;
        this.registrationNumber = registrationNumber;
    }

    public Car() {

    }

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

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}