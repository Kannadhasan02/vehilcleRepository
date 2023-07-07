package com.myapp.vehicle.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.myapp.vehicle.Exceptions.NameNotFoundException;
import com.myapp.vehicle.Exceptions.PriceException;
import com.myapp.vehicle.controller.CarController;
import com.myapp.vehicle.dao.CarDao;
import com.myapp.vehicle.entity.Car;


@Service
public class CarService {
	@Autowired
	CarDao carDao;
	
	static Logger log=Logger.getLogger(CarController.class);
	
	public String postCar(@RequestBody Car c) {
		return carDao.postCar(c);
	}
	
	public String addCar(@RequestBody Car c) {
		return carDao.addCar(c);
	}
	public String addCars(List<Car> c) {
		return carDao.addCars(c);
	}
	
	
	public Car getCarDetail(@PathVariable int n) {
		return carDao.getCarDetail(n);
	}
	
	public List<Car> getAllCars() {
		return carDao.getAllCars();
	}
	public String getDelCar(@PathVariable int n) {
		return carDao.getDelCar(n);
	}
	public String updateCar(Car p) {
		return carDao.updateCar(p);
	}
	public List<Car> getByPrice(int price1, int price2) {
		return carDao.getByPrice(price1, price2);
}
	public List<Car> getByName(String brand)throws  NameNotFoundException,Exception {
		if(carDao.getByName(brand).isEmpty()) {
			throw new  NameNotFoundException("brand not available");
		}
		else {
			return carDao.getByName(brand);
		}
	}
	
	public String postByPrice(Car p) throws PriceException,Exception{
		PropertyConfigurator.configure("vehicleLog4J.properties");
		if(p.getPrice()<30000) {
			log.error( new PriceException("less than expected price"));
			throw new PriceException(" under price");
		}
		else {
			
			return carDao. postByPrice(p);
		}
		
	}

}
