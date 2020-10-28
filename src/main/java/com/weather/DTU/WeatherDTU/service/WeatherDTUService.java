package com.weather.DTU.WeatherDTU.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.weather.DTU.WeatherDTU.model.WeatherReading;
import com.weather.DTU.WeatherDTU.repository.WeatherDTURepository;

@Service
public class WeatherDTUService {
	@Autowired
	WeatherDTURepository weatherDTURepository;
	
	private RestTemplate restTemplate;

	public List<WeatherReading> getAllReadings(){
		 List<WeatherReading> list = new ArrayList<>(); 
//		 weatherDTURepository.findAll().forEach(list1->list.add(list1));
		 list = (List<WeatherReading>) weatherDTURepository.findAll();
		 
     return list;
		
	}

	public List<WeatherReading> getBadWeather() {
		List<WeatherReading> list = new ArrayList<>(); 
		list = (List<WeatherReading>) weatherDTURepository.findAll();
		List<WeatherReading> badWeatherlist = new ArrayList<>(); 
		for(WeatherReading reading : list) {
			if(reading.getTemperature()>=80.00) 
				badWeatherlist.add(reading);
		}
		restTemplate.postForObject("http://localhost:9090/badWeatherlist", badWeatherlist, boolean.class);
		
		return badWeatherlist;
		
	}

	public List<WeatherReading> getCityReading(String city) {
		List<WeatherReading> list = new ArrayList<>();
		list = (List<WeatherReading>) weatherDTURepository.findAll();
		List<WeatherReading> cityList = new ArrayList<>();
		for(WeatherReading reading: list) {
			if(reading.getCity().equals(city)) {
				cityList.add(reading);
			}
		}
		return cityList;
	}
	
	public Double updateTemperature(String city, double Temperature) {
		
		return null;
	}
}
