package com.weather.DTU.WeatherDTU.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WeatherController {

		

		@PostMapping("/addReading")
		public boolean AddReading() {
//			System.out.println("Running");
			return true;
		}
}
