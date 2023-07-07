package com.myapp.vehicle.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.myapp.vehicle.entity.Bike;
import com.myapp.vehicle.repository.BikeRepository;

@Repository
public class BikeDao {
	@Autowired
	BikeRepository bikerep;

	public String addBike(Bike c) {
		bikerep.save(c);
		return "successfully";
	}

	public String addBikes(List<Bike> c) {
		bikerep.saveAll(c);
		return "saved successfully";

	}

	public Bike getBikeDetail( int n) {
		return bikerep.findById(n).get();
	}

	public List<Bike> getAllBikes() {
		return bikerep.findAll();
	}

	public String getDelBike(@PathVariable int n) {
		 bikerep.deleteById(n);
		 return "deleted";
	}
}
