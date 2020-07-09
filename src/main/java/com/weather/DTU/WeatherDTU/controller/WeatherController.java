package com.weather.DTU.WeatherDTU.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WeatherController {

		@PostMapping("/getReading")
		public boolean getReading() {
//			System.out.println("Running");
			return true;
		}
}
