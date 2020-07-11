package com.weather.DTU.WeatherDTU.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WeatherController {

	
//postmapping
		@PostMapping("/getReading")
		public boolean getReading() {
			return true;
		}
}
