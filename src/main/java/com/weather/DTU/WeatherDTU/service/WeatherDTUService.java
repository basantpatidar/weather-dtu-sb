package com.weather.DTU.WeatherDTU.service;

import java.net.http.HttpHeaders;
import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.weather.DTU.WeatherDTU.model.WeatherReading;
import com.weather.DTU.WeatherDTU.repository.WeatherDTURepository;

@Service
public class WeatherDTUService {
	@Autowired
	private WeatherDTURepository weatherDTURepository;
	
	private RestTemplate restTemplate;

//	public WeatherDTUService(WeatherDTURepository weatherDTURepository, RestTemplate restTemplate) {
//		super();
//		this.weatherDTURepository = weatherDTURepository;
//		this.restTemplate = restTemplate;
//	}

	public List<WeatherReading> getAllReadings(){
		 List<WeatherReading> list = new ArrayList<>(); 
//		 weatherDTURepository.findAll().forEach(list1->list.add(list1));
		 list = (List<WeatherReading>) weatherDTURepository.findAll();
     return list;
	}

	public boolean getBadWeather() {
		List<WeatherReading> list = new ArrayList<>(); 
		list = (List<WeatherReading>) weatherDTURepository.findAll();
		List<WeatherReading> badWeatherlist = new ArrayList<>(); 
		for(WeatherReading reading : list) {
			if(reading.getTemperature()<=20.00) 
				badWeatherlist.add(reading);
		}
		try {
			String url = "http://localhost:9090//badWeather";
			RestTemplate restTemplate = new RestTemplate();
			return restTemplate.postForObject("http://localhost:9090//badWeather", badWeatherlist, boolean.class);
			
		} catch (Exception e) {
			System.out.println("Exception ------>"+e);
		}
		return false; 
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
	
	public boolean updateTemperature(double temperature, String timestamp) {
		List<Object> list = new ArrayList<>();
		list.add(temperature);
		list.add(timestamp);
		System.out.println(list);
//		restTemplate.postForObject("http://localhost:9090/badWeatherlist", null, boolean.class);
		
		return true;
	}
}
