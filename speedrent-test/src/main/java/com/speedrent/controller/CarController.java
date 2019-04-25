package com.speedrent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.speedrent.model.Car;
import com.speedrent.service.ICarService;

@RestController
public class CarController {

	@Autowired
	ICarService carService;

	@GetMapping(path = "/hello", produces = "application/json")
	public Car getCar() {
		return carService.getCar();
	}

}
