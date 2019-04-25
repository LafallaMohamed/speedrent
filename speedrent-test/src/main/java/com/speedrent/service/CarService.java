package com.speedrent.service;

import org.springframework.stereotype.Service;

import com.speedrent.model.Car;

@Service
public class CarService implements ICarService{

	@Override
	public Car getCar() {
		return new Car("manufacturer", "name");
	}

}
