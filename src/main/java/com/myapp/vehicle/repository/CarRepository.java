package com.myapp.vehicle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.myapp.vehicle.entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {
	@Query(value = "select * from car where price>=? and price<=?", nativeQuery = true)
	public List<Car> getByprice(int price1, int price2);

	@Query(value = "select * from car Where brand like ?", nativeQuery = true)
	public List<Car> getByName(String brand);

}
