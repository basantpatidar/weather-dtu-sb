package com.weather.DTU.WeatherDTU.model;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class WeatherReading {
	@Id
	private String id;
	private String city;
	private String description;
	private Double humidity;
	private double pressure;
	private double temperature;
	@OneToOne(cascade = CascadeType.ALL)
	private Wind wind;
	private Timestamp timestamp;
	
	public WeatherReading(String city, String description, Double humidity, double pressure,
			double temperature, Wind wind, Timestamp timestamp) {
		super();
		this.city = city;
		this.description = description;
		this.humidity = humidity;
		this.pressure = pressure;
		this.temperature = temperature;
		this.wind = wind;
		this.timestamp = timestamp;
	}
	
	public WeatherReading() {
		// TODO Auto-generated constructor stub
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getHumidity() {
		return humidity;
	}
	public void setHumidity(Double humidity) {
		this.humidity = humidity;
	}
	public double getPressure() {
		return pressure;
	}
	public void setPressure(double pressure) {
		this.pressure = pressure;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public Wind getWind() {
		return wind;
	}
	public void setWind(Wind wind) {
		this.wind = wind;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "WeatherReading [id=" + id + ", city=" + city + ", description=" + description + ", humidity=" + humidity
				+ ", pressure=" + pressure + ", temperature=" + temperature + ", wind=" + wind + ", timestamp="
				+ timestamp + "]";
	}

}
