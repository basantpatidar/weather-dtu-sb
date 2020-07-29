package com.weather.DTU.WeatherDTU.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weather.DTU.WeatherDTU.model.WeatherReading;


@RestController
public class WeatherController {

	@Autowired
	private WeatherReading weatherReading;
	
		@PostMapping("/getReading")
		public WeatherReading getReading() {
			
			return weatherReading;
		}
}
