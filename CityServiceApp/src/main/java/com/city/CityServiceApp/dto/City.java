package com.city.CityServiceApp.dto;

public class City {

	long id;
	String stateCode;
	String cityName;
	String zone;
	long count;
	
	public City(long id, String stateCode, String cityName, String zone, long count) {
		super();
		this.id = id;
		this.stateCode = stateCode;
		this.cityName = cityName;
		this.zone = zone;
		this.count = count;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	
	
}
