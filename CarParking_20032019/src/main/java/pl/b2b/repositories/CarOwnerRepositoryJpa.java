package pl.b2b.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.b2b.model.CarOwner;

@Repository
public interface CarOwnerRepositoryJpa extends JpaRepository<CarOwner, Long> {

}
