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
		 weatherDTURepository.findAll().forEach(list1->list.add(list1));
			
//		List<WeatherReading> wl 
		//return (List<WeatherReading>) weatherDTURepository.findAll();
		
		
		
//		System.out.println(weatherDTURepository.findAll());
//		list.sort(Comparator.comparing(WeatherReading::getTimestamp));
     return list;
		
	}
}
