package by.strizhonov.app.repository;

import by.strizhonov.app.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

    @Query(value = "SELECT * FROM CITY WHERE LOWER(NAME) = LOWER(?1)", nativeQuery = true)
    Optional<City> findByName(String cityNameToSearch);

}
