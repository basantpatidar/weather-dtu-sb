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
			if(reading.getTemperature()<=20.00) 
				badWeatherlist.add(reading);
		}
		try {
			String url = "http://localhost:9090/badWeather";
			//org.springframework.http.HttpHeaders httpHeaders = new org.springframework.http.HttpHeaders();
			//httpHeaders.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
			//String res = restTemplate.postForObject(url, badWeatherlist.toString(), String.class);
			restTemplate = new RestTemplate();
		//	ResponseEntity<WeatherReading[]> responseEntity = restTemplate.getForEntity(url, WeatherReading[].class);
			
			ResponseEntity rest = restTemplate.postForObject("http://localhost:9090/badWeather", badWeatherlist, ResponseEntity.class);
			
		} catch (Exception e) {
			System.out.println("Exception ------>"+e);
		}
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
	
	public boolean updateTemperature(double temperature, String timestamp) {
		List<Object> list = new ArrayList<>();
		list.add(temperature);
		list.add(timestamp);
		System.out.println(list);
//		restTemplate.postForObject("http://localhost:9090/badWeatherlist", null, boolean.class);
		
		return true;
	}
}
