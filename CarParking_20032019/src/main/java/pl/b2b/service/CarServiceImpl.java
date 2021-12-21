package pl.b2b.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.b2b.model.Car;
import pl.b2b.repositories.CarRepositoryJpa;

import java.util.List;
@Service
public class CarServiceImpl implements CarService {
    @Autowired
    CarRepositoryJpa carService;
    @Override
    public Car add(Car client) {
       return carService.save(client);

    }

    @Override
    public List<Car> findAll() {
        List<Car> cars= carService.findAll();
       return cars;
    }

    @Override
    public void remove(Long id) {
        carService.delete(findById(id));
    }

    @Override
    public Car update(Car client) {
        return null;
    }

    @Override
    public Car findById(Long id) {
        return carService.findById(id).get();
    }

    @Override
    public Car changeRegistrationNumber(Long id, String registrationNumber) {
        Car car= carService.findById(id).get();
        car.setRegistrationNumber(registrationNumber);
        return car;
    }
}
