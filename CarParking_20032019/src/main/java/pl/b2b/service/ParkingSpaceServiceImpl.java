package pl.b2b.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.b2b.model.ParkingSpace;

import java.util.List;
@Service
public class ParkingSpaceServiceImpl implements ParkingSpaceService {
    @Autowired
    ParkingSpaceService parkingSpaceService;
    @Override
    public ParkingSpace add(ParkingSpace parkingSpace) {
        return parkingSpaceService.add(parkingSpace);
    }

    @Override
    public List<ParkingSpace> findAll() {
        List<ParkingSpace> list= parkingSpaceService.findAll();
        return list;
    }

    @Override
    public void remove(Long id) {
        parkingSpaceService.remove(id);
    }

    @Override
    public ParkingSpace update(ParkingSpace parkingSpace) {
        return null;
    }

    @Override
    public ParkingSpace findById(Long id) {
        ParkingSpace parkingSpace = findById(id);
        return parkingSpace;
    }
}
