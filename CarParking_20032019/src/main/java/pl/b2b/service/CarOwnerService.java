package pl.b2b.service;


import pl.b2b.model.CarOwner;

import java.util.List;

public interface CarOwnerService {
    CarOwner add(CarOwner client);

    List<CarOwner> findAll();

    void remove(Long id);

    CarOwner update(CarOwner client);

    CarOwner findById(Long id);

    List<CarOwner>FindDriversOlderThan30YearsOld(List<CarOwner> carOwnerList);
}
