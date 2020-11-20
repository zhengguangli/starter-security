package wang.icopy.security.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;
import wang.icopy.security.domain.City;

import java.util.List;


public interface CityRepository extends Repository<City, Long> {

    Page<City> findAll(Pageable pageable);

    List<City> findByNameAndStateAllIgnoreCase(String name, String state);

    City save(City city);
}
