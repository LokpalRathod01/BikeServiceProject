package com.example.service;

import java.util.List;
import com.example.entity.Bike;

public interface Bikeservice {
	Bike saveBike(Bike bike);
	List<Bike> getAllBikes();
	Bike getBikeById(long id);
	Bike updateBike(Bike bike, long id);
	void deleteBike(long id);

}
