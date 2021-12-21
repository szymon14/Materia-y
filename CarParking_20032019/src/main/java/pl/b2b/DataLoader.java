package pl.b2b;


import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import pl.b2b.model.Car;
import pl.b2b.model.ParkingSpace;
import pl.b2b.repositories.CarOwnerRepositoryJpa;

import java.util.ArrayList;
import java.util.List;


public class DataLoader implements ApplicationRunner {

    private final CarOwnerRepositoryJpa carOwnerRepository;


    public DataLoader(CarOwnerRepositoryJpa carOwnerRepositoryJpa) {
        this.carOwnerRepository = carOwnerRepositoryJpa;
    }

    public void run(ApplicationArguments args) {
        getCarOwner();
    }

    private void getCarOwner() {

        Car car1 = new Car();
        car1.setRegistrationNumber("WB47382");

        Car car2 = new Car();
        car2.setRegistrationNumber("WOT3543");

        Car car3 = new Car();
        car3.setRegistrationNumber("WG56432");

        Car car4 = new Car();
        car4.setRegistrationNumber("WB34215");

        Car car5 = new Car();
        car5.setRegistrationNumber("WW43423");

        List<Car> carList1 = new ArrayList<>();
        carList1.add(car1);
        carList1.add(car3);
        List<Car> carList2 = new ArrayList<>();
        carList1.add(car4);
        carList1.add(car5);


        ParkingSpace parkingSpace1 = new ParkingSpace();
        ParkingSpace parkingSpace2 = new ParkingSpace();
        ParkingSpace parkingSpace3 = new ParkingSpace();
        ParkingSpace parkingSpace4 = new ParkingSpace();
        ParkingSpace parkingSpace5 = new ParkingSpace();
        ParkingSpace parkingSpace6 = new ParkingSpace();
        ParkingSpace parkingSpace7 = new ParkingSpace();

        List<ParkingSpace> parkingSpaceList1 = new ArrayList<>();
        parkingSpaceList1.add(parkingSpace1);
        parkingSpaceList1.add(parkingSpace2);

        List<ParkingSpace> parkingSpaceList2 = new ArrayList<>();
        parkingSpaceList1.add(parkingSpace5);
        parkingSpaceList1.add(parkingSpace7);

        List<ParkingSpace> parkingSpaceList3 = new ArrayList<>();
        parkingSpaceList1.add(parkingSpace4);
        parkingSpaceList1.add(parkingSpace6);


//        CarOwner carOwner1 = new CarOwner("Marek", "Mankowski", 34, carList1, parkingSpaceList1);
//        CarOwner carOwner2 = new CarOwner("Darek", "Bogusz", 18, Arrays.asList(car2), parkingSpaceList2);
//        CarOwner carOwner3 = new CarOwner("Wojtek", "Barankiewicz", 67, Arrays.asList(car4), Arrays.asList(parkingSpace3));
//        CarOwner carOwner4 = new CarOwner("Andrzej", "Grabowski", 45, carList2, parkingSpaceList3);

//        carOwnerRepository.save(carOwner1);
//        carOwnerRepository.save(carOwner2);
//        carOwnerRepository.save(carOwner3);
//        carOwnerRepository.save(carOwner4);
    }

}
