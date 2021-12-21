package pl.b2b.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.b2b.model.ParkingSpace;

public interface ParkingSpaceRepositoryJpa extends JpaRepository<ParkingSpace, Long> {

}
