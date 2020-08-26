package com.weather.DTU.WeatherDTU.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.weather.DTU.WeatherDTU.model.WeatherReading;
import com.weather.DTU.WeatherDTU.repository.WeatherDTURepository;

@Service
public class WeatherDTUService {
	
	WeatherDTURepository weatherDTURepository;

	public List<WeatherReading> getAllReadings(List<WeatherReading> weatherReading){
		List<WeatherReading> list = new ArrayList<>();
		
		list.sort(Comparator.comparing(WeatherReading::getTimestamp));
		return list;
		
	}
}
