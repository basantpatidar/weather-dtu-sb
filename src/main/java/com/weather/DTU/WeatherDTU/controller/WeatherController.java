package com.weather.DTU.WeatherDTU.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weather.DTU.WeatherDTU.model.WeatherReading;
import com.weather.DTU.WeatherDTU.service.WeatherDTUService;


@RestController
public class WeatherController {
	
	@Autowired
	private WeatherDTUService weatherDTUService;
		
		@GetMapping("/getReading")
		public List<WeatherReading> getReading() {
			List<WeatherReading> weatherReading = null;
			weatherReading = weatherDTUService.getAllReadings(weatherReading);
			return weatherReading;
		}
}
