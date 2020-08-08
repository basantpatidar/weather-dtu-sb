package com.weather.DTU.WeatherDTU.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.weather.info.service.WeatherService;
import com.weather.DTU.WeatherDTU.model.WeatherReading;
import com.weather.DTU.WeatherDTU.service.WeatherDTUService;


@RestController
public class WeatherController {

	@Autowired
	private WeatherReading weatherReading;
	
	@Autowired
	private WeatherDTUService weatherDTUService;
	
	private WeatherService weatherService;
	
	
		@PostMapping("/getReading")
		public WeatherReading getReading() {
			
			return weatherReading;
		}
}
