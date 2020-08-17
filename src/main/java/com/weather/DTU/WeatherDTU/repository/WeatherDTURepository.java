package com.weather.DTU.WeatherDTU.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.weather.DTU.WeatherDTU.model.WeatherReading;

@Repository
public interface WeatherDTURepository extends CrudRepository<WeatherReading, String>{

}
