package pl.b2b.service;


import pl.b2b.model.Car;

import java.util.List;

public interface CarService {
    Car add(Car client);

    List<Car> findAll();

    void remove(Long id);

    Car update(Car client);

    Car findById(Long id);

    Car changeRegistrationNumber(Long id, String registrationNumber);
}