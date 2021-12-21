package pl.b2b.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.b2b.model.Car;

public interface CarRepositoryJpa extends JpaRepository<Car, Long> {


}