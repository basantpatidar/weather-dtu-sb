package com.weather.DTU.WeatherDTU.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weather.DTU.WeatherDTU.model.WeatherReading;
import com.weather.DTU.WeatherDTU.repository.WeatherDTURepository;

@Service
public class WeatherDTUService {
	@Autowired
	WeatherDTURepository weatherDTURepository;

	public List<WeatherReading> getAllReadings(){
		 List<WeatherReading> list = new ArrayList<>(); 
//		 weatherDTURepository.findAll().forEach(list1->list.add(list1));
		 list = (List<WeatherReading>) weatherDTURepository.findAll();
		 
		
     return list;
		
	}

	public List<WeatherReading> getBadWeather() {
		List<WeatherReading> list = new ArrayList<>(); 
		
		if(weatherReading.getTemperature() > 80) {
			 
		 }
		
		return list;
	}
}
