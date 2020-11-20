package wang.icopy.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import wang.icopy.security.domain.City;
import wang.icopy.security.repository.CityRepository;

import java.util.List;

@RestController
public class CityController {

    private final CityRepository cityRepository;

    public CityController(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @GetMapping(value = "/save")
    public City save() {
        City city = City.builder().name("河南").state("1").build();
        return cityRepository.save(city);
    }

    @GetMapping("/get")
    public List<City> get() {
        return cityRepository.findByNameAndStateAllIgnoreCase("河南", "1");
    }
}
