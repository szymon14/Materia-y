package pl.b2b.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Entity
public class CarOwner {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String surname;
    private int age;
    @JsonBackReference(value = "carOwner-Car")
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "carOwner")
    private List<Car> cars = new LinkedList<>();
    @JsonBackReference(value = "carOwner-ParkingSpace")
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "carOwner")
    private List<ParkingSpace> parkingSpace = new ArrayList<>();

    public CarOwner() {

    }

    public CarOwner(String name, String surname, int age, List<Car> cars, List<ParkingSpace> parkingSpace) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.cars = cars;
        this.parkingSpace = parkingSpace;
    }

    public CarOwner(Long id, String name, String surname, int age, List<Car> cars, List<ParkingSpace> parkingSpace) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.cars = cars;
        this.parkingSpace = parkingSpace;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarOwner carOwner = (CarOwner) o;

        if (age != carOwner.age) return false;
        if (name != null ? !name.equals(carOwner.name) : carOwner.name != null) return false;
        return surname != null ? surname.equals(carOwner.surname) : carOwner.surname == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }
}
