package com.codegym.Service;

import com.codegym.model.City;

import java.util.List;
import java.util.Optional;

public interface CityService {

    List<City> getAllCity();

    void saveCity(City city);

    void deleteCity(Long id);

    Optional<City> findCityById(Long id);
}