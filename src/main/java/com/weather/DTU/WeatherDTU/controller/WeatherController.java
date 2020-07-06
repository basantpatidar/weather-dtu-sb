package com.weather.DTU.WeatherDTU.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.consumer.model.WeatherAlert;
import com.spring.boot.consumer.service.AlertService;

@RestController
public class WeatherController {

		
		@Autowired
		private AlertService alertService;

		@PostMapping("/addReading")
		public boolean AddReading(@RequestBody WeatherAlert weatherAlert) {
			alertService.addAlerts(weatherAlert);
//			System.out.println("Running");
			return true;
		}
}
