package pl.b2b.service;


import pl.b2b.model.ParkingSpace;

import java.util.List;

public interface ParkingSpaceService {
    ParkingSpace add(ParkingSpace parkingSpace);

    List<ParkingSpace> findAll();

    void remove(Long id);

    ParkingSpace update(ParkingSpace parkingSpace);

    ParkingSpace findById(Long id);
}
