package com.myapp.vehicle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.myapp.vehicle.dao.BikeDao;
import com.myapp.vehicle.entity.Bike;
@Service 
public class BikeService {
	@Autowired
	BikeDao bikedao;

	public String addBike( Bike c) {
		return bikedao.addBike(c);
	}

	public String addBikes(List<Bike> c) {
		return bikedao.addBikes(c);
	}

	public Bike getBikeDetail( int n) {
		return bikedao.getBikeDetail(n);
	}

	public List<Bike> getAllBikes() {
		return bikedao.getAllBikes();
	}

	public String getDelBike( int n) {
		return bikedao.getDelBike(n);
	}

}
