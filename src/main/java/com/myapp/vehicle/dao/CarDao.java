package com.myapp.vehicle.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.myapp.vehicle.entity.Car;
import com.myapp.vehicle.repository.CarRepository;

import com.myapp.vehicle.Exceptions.*;

@Repository
public class CarDao {
	@Autowired
	CarRepository carRep;
	
	public String postCar(@RequestBody Car c) {
		carRep.save(c);
		return "stored";
	}

	public String addCar(@RequestBody Car c) {
		carRep.save(c);
		return "successfully";
	}

	public String addCars(List<Car> c) {
		carRep.saveAll(c);
		return "saved successfully";

	}

	public Car getCarDetail(@PathVariable int n) {
		return carRep.findById(n).get();
	}

	public List<Car> getAllCars() {
		return carRep.findAll();
	}

	public String getDelCar(@PathVariable int n) {
		carRep.deleteById(n);
		return "deleted";
	}

	public String updateCar(Car p) {
		carRep.save(p);
		return "updated";
	}

	public List<Car> getByPrice(int price1, int price2) {
		return carRep.getByprice(price1, price2);
	}

	public List<Car> getByName(String brand) throws NameNotFoundException, Exception {
		return carRep.getByName(brand);
	}
	public String postByPrice(Car p) throws PriceException,Exception{
		carRep.save(p);
		return "object saved";
	}
}
