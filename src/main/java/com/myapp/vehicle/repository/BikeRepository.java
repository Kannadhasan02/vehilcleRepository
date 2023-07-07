package com.myapp.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.vehicle.entity.Bike;

public interface BikeRepository extends JpaRepository<Bike,Integer>{

}
