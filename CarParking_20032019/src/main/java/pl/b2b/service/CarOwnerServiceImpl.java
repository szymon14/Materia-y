package pl.b2b.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.b2b.model.CarOwner;
import pl.b2b.repositories.CarOwnerRepositoryJpa;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CarOwnerServiceImpl implements CarOwnerService {
    @Autowired
    CarOwnerRepositoryJpa carOwnerRepositoryJpa;
    @Override
    public CarOwner add(CarOwner client) {
        return carOwnerRepositoryJpa.save(client);
    }

    @Override
    public List<CarOwner> findAll() {
        List<CarOwner> ownerList =  carOwnerRepositoryJpa.findAll();
        return ownerList;
    }

    @Override
    public void remove(Long id) {
        Optional<CarOwner> delete = carOwnerRepositoryJpa.findById(id);
        if(delete.isPresent()) {
            carOwnerRepositoryJpa.delete(delete.get());
        }
    }

    @Override
    public CarOwner update(CarOwner client) {
        remove(client.getId());
        return add(client);
    }

    @Override
    public CarOwner findById(Long id) {
        Optional<CarOwner> carOwner=carOwnerRepositoryJpa.findById(id);
        return carOwner.get();
    }

    @Override
    public List<CarOwner> FindDriversOlderThan30YearsOld(List<CarOwner> carOwnerList) {
        List<CarOwner> list = carOwnerRepositoryJpa.findAll().stream().filter(n->n.getAge()>30).collect(Collectors.toList());
        return list;
    }
}
