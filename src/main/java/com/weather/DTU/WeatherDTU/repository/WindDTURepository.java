package com.weather.DTU.WeatherDTU.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.weather.DTU.WeatherDTU.model.Wind;

@Repository
public interface WindDTURepository extends CrudRepository<Wind, String>{

}
