package com.myapp.vehicle.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.vehicle.entity.Car;
import com.myapp.vehicle.service.CarService;

import com.myapp.vehicle.Exceptions.*;


@RestController
@RequestMapping(value="car")
public class CarController {
	@Autowired
	CarService carSer;
	static Logger log=Logger.getLogger(CarController.class);
	
	     @PostMapping(value = "/insertCar")
		public String postCar(@RequestBody Car c) {
	    	 PropertyConfigurator.configure("vehicleLog4j.properties");
	    	 log.info(carSer.postCar(c));
			return carSer.postCar(c);
		}
	 
	
	@PostMapping(value="/insert")
	public String addCar(@RequestBody Car c) {
		return carSer.addCar(c);
	}
	@PostMapping(value="/inserts")
	public String addCars(@RequestBody List<Car> c) {
		return carSer.addCars(c);
	}

	
	@GetMapping(value = "/getid/{n}")
	public Car getCarDetail(@PathVariable int n) {
		return carSer.getCarDetail(n);
	}
	@GetMapping(value="/getlist")
	public List<Car> getAllCars() {
		return carSer.getAllCars();
	}
	@DeleteMapping(value="/delete/{n}")
	public String getDelCar(@PathVariable int n) {
		return carSer.getDelCar(n);
	}
	@PutMapping(value="/update/{p}")
	public String updateCar(@RequestBody Car p) {
		return carSer.updateCar(p);
	}
	@GetMapping(value="/getByPrice/{price1}/{price2}")
	public List<Car> getByPrice(@PathVariable int price1,@PathVariable int price2) {
		return carSer.getByPrice(price1, price2);
}
	@GetMapping(value="getByName/{brand}")
	public List<Car> getByName(@PathVariable String brand)throws  NameNotFoundException,Exception {
		return carSer.getByName(brand);
	}
	@PostMapping(value="postByPrice")
	public String postByPrice(@RequestBody Car p) throws PriceException,Exception {
		return carSer.postByPrice(p);
	}
}