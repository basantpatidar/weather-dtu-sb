package com.weather.DTU.WeatherDTU.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
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

	public Boolean getBadWeather() {
		List<WeatherReading> list = new ArrayList<>(); 
		list = (List<WeatherReading>) weatherDTURepository.findAll();
		List<WeatherReading> badWeatherlist = new ArrayList<>(); 
		for(WeatherReading reading : list) {
			if(reading.getTemperature()<=20.00) 
				badWeatherlist.add(reading);
		}
		return restTemplate.postForObject("http://localhost:9090/badWeather", badWeatherlist.toString(), boolean.class);
//		return badWeatherlist; 
	}
	
//	
//	@PostMapping(
//			  value = "/createPerson", consumes = "application/json", produces = "application/json")
//			public Person createPerson(@RequestBody Person person) {
//			    return personService.saveUpdatePerson(person);
//			}
//			 
//			@PostMapping(
//			  value = "/updatePerson", consumes = "application/json", produces = "application/json")
//			public Person updatePerson(@RequestBody Person person, HttpServletResponse response) {
//			    response.setHeader("Location", ServletUriComponentsBuilder.fromCurrentContextPath()
//			      .path("/findPerson/" + person.getId()).toUriString());
//			    
//			    return personService.saveUpdatePerson(person);
//			}
//	
//	
//	@BeforeClass
//	public static void runBeforeAllTestMethods() {
//	    createPersonUrl = "http://localhost:8082/spring-rest/createPerson";
//	    updatePersonUrl = "http://localhost:8082/spring-rest/updatePerson";
//	 
//	    restTemplate = new RestTemplate();
//	    headers = new HttpHeaders();
//	    headers.setContentType(MediaType.APPLICATION_JSON);
//	    personJsonObject = new JSONObject();
//	    personJsonObject.put("id", 1);
//	    personJsonObject.put("name", "John");
//	}
//	
//	public void givenDataIsJson_whenDataIsPostedByPostForObject_thenResponseBodyIsNotNull()
//			  throws IOException {
//			    HttpEntity<String> request = 
//			      new HttpEntity<String>(personJsonObject.toString(), headers);
//			    
//			    String personResultAsJsonStr = 
//			      restTemplate.postForObject(createPersonUrl, request, String.class);
//			    JsonNode root = objectMapper.readTree(personResultAsJsonStr);
//			    
//			    assertNotNull(personResultAsJsonStr);
//			    assertNotNull(root);
//			    assertNotNull(root.path("name").asText());
//			}

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
