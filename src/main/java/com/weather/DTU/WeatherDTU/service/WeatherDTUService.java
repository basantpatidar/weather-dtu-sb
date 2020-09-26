package com.weather.DTU.WeatherDTU.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.boot.app.adaptor.SignupAdaptor;
import com.spring.boot.app.entity.UserEntity;
import com.spring.boot.app.exception.UserNotFoundException;
import com.spring.boot.app.model.SignupDTO;
import com.weather.DTU.WeatherDTU.model.WeatherReading;
import com.weather.DTU.WeatherDTU.repository.WeatherDTURepository;

@Service
public class WeatherDTUService {
	
	WeatherDTURepository weatherDTURepository;

	public List<WeatherReading> getAllReadings(){
		List<WeatherReading> list = new ArrayList<WeatherReading>();
		List<WeatherReading> wl = weatherDTURepository.findAll();
		
		
//		System.out.println(weatherDTURepository.findAll());
//		list.sort(Comparator.comparing(WeatherReading::getTimestamp));
		return list;
		
	}
}
