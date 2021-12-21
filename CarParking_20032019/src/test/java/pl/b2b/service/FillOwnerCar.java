package pl.b2b.service;

import pl.b2b.model.CarOwner;

import java.util.ArrayList;
import java.util.List;

public class FillOwnerCar {

    public static List<CarOwner> fillCarOwner(){

        List<CarOwner> carOwners = new ArrayList<>();

        CarOwner carOwner = new CarOwner();

        for (int i = 0; i < 10; i++) {
            carOwner.setName(""+ (25+i));
            carOwner.setAge(25+i);
            carOwners.add(carOwner);
        }
        return carOwners;
    }

}
