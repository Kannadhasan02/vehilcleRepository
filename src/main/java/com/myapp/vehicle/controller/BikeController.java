package com.myapp.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.employee.BikeEntity;
import com.myapp.vehicle.entity.Bike;
import com.myapp.vehicle.entity.Car;
import com.myapp.vehicle.service.BikeService;

@RestController
@RequestMapping(value = "bike")
public class BikeController {
	@Autowired
	BikeService bikeser;

	@PostMapping(value = "/insert")
	public String addBike(@RequestBody Bike c) {
		return bikeser.addBike(c);
	}

	@PostMapping(value = "/inserts")
	public String addBikes(@RequestBody List<Bike> c) {
		return bikeser.addBikes(c);
	}

	@GetMapping(value = "/getid/{n}")
	public Bike getBikeDetail(@PathVariable int n) {
		return bikeser.getBikeDetail(n);
	}

	@GetMapping(value = "/getlist")
	public List<Bike> getAllBikes() {
		return bikeser.getAllBikes();
	}

	@DeleteMapping(value = "/delete/{n}")
	public String getDelBike(@PathVariable int n) {
		return bikeser.getDelBike(n);
	}
	

	

	
}
