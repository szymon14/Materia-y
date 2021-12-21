package pl.b2b.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.b2b.model.Car;
import pl.b2b.service.CarServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {
    @Autowired
    CarServiceImpl carService;
    @PostMapping("/add")
    public Car add(@RequestBody Car client){
        return carService.add(client);
    }
    @RequestMapping("/findALL")
    public List<Car> findAll(){
        List<Car> list= carService.findAll();
        return list;
    }
    @RequestMapping("/remove/{id}")
    public void remove(@PathVariable Long id){

        carService.remove(id);
    }
    @RequestMapping("/FindById/{id}")
    public Car findById(Long id){
        return carService.findById(id);
    }
    @RequestMapping("/changeRegistry/{id}/{registrationNumber}")
    public Car changeRegistrationNumber(Long id, String registrationNumber){
        Car car = carService.findById(id);
        car.setRegistrationNumber(registrationNumber);
        return car;
    }


}