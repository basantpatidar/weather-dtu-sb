package com.weather.DTU.WeatherDTU.repository;

import org.springframework.data.repository.CrudRepository;

import com.weather.DTU.WeatherDTU.model.WeatherReading;

public interface WeatherDTURepository extends CrudRepository<WeatherReading, String>{

}
