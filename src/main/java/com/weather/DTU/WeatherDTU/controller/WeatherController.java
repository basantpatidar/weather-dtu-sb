package com.weather.DTU.WeatherDTU.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.weather.DTU.WeatherDTU.model.WeatherReading;
import com.weather.DTU.WeatherDTU.service.WeatherDTUService;
 
@RestController
public class WeatherController {
	@Autowired
	private WeatherDTUService weatherDTUService;
		
		@GetMapping("/getReading")
		public List<WeatherReading> getReading() {
			List<WeatherReading> weatherReading = new ArrayList<WeatherReading>();
			weatherReading = weatherDTUService.getAllReadings();
			System.out.println(weatherReading.toString());
			return  weatherReading;
		}
		
		@GetMapping("/getBadWeather")
		public List<WeatherReading> getBadWeather(){
			List<WeatherReading> weatherReading = new ArrayList<WeatherReading>();
			weatherReading = weatherDTUService.getBadWeather();
			return weatherReading;
		}
		
		@GetMapping("/GetCityReading")
		public List<WeatherReading> getCityReading(@RequestParam("city") String city){
			List<WeatherReading> list = new ArrayList<WeatherReading>();
			list = weatherDTUService.getCityReading(city);
			return null;
		}
		
		@GetMapping("/test")
		public boolean testingRest() {
			return true;
		}
}
