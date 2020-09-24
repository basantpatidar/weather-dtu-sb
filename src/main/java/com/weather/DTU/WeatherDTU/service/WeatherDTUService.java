package com.weather.DTU.WeatherDTU.service;

import org.springframework.stereotype.Service;

import com.weather.DTU.WeatherDTU.model.WeatherReading;
import com.weather.DTU.WeatherDTU.repository.WeatherDTURepository;

@Service
public class WeatherDTUService {
	
	WeatherDTURepository weatherDTURepository;

	public WeatherReading getAllReadings(WeatherReading weatherReading){
		WeatherReading list = new WeatherReading();
//		list.getCity();
		
//		System.out.println(weatherDTURepository.findAll());
//		list.sort(Comparator.comparing(WeatherReading::getTimestamp));
		return list;
		
	}
}
