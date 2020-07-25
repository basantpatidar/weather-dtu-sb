package com.weather.DTU.WeatherDTU.repository;

import org.springframework.data.repository.CrudRepository;

import com.weather.DTU.WeatherDTU.model.WeatherReading;
import com.weather.DTU.WeatherDTU.model.Wind;

public interface WindDTURepository extends CrudRepository<Wind, String>{

}
