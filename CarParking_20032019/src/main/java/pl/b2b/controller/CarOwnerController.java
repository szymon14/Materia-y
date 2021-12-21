package pl.b2b.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.b2b.model.CarOwner;
import pl.b2b.service.CarOwnerServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/carOwner")
public class CarOwnerController {
    @Autowired
    CarOwnerServiceImpl carOwnerService;
    @PostMapping("/add")
    public CarOwner add(CarOwner client){
        return carOwnerService.add(client);
    }
    @RequestMapping("/findALL")
    public List<CarOwner> findAll(){
        return carOwnerService.findAll();
    }
    @PostMapping("/delete/{id}")
     public String remove(Long id){
        carOwnerService.remove(id);
        return "succes";
    }


}
