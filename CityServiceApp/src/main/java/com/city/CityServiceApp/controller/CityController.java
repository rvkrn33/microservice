package com.city.CityServiceApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.city.CityServiceApp.dto.City;

@RestController
public class CityController {

	@GetMapping(path="/getCity/{state}/{city}")
	public City getState(@PathVariable String state, @PathVariable String city){
		return new City(1001,"MHA","Mumbai","RED",5000);
	}
}
