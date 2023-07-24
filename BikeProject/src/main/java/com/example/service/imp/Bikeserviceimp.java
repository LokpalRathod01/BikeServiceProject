package com.example.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Bike;
import com.example.exception.ResourcesNotFoundException;
import com.example.repository.Bikerepository;
import com.example.service.Bikeservice;

@Service

public class Bikeserviceimp implements Bikeservice {
	
	@Autowired
	private Bikerepository bikerepository;
	
	@Override
	public Bike saveBike(Bike bike) {
		return bikerepository.save(bike);
	}
	@Override
	public List<Bike> getAllBikes() {
		return bikerepository.findAll();
	}
	
	@Override
	public Bike getBikeById(long id) {
		Optional<Bike> bike = bikerepository.findById(id);
		return bikerepository.findById(id).orElseThrow(()->
		new ResourcesNotFoundException("Bike","id",id));
	}
	@Override
	public Bike updateBike(Bike bike, long id) {
		Bike existingBike=bikerepository.findById(id).orElseThrow(()->
		new ResourcesNotFoundException("Bike","id",id));
		existingBike.setBike_make(bike.getBike_make());
		existingBike.setModel_name(bike.getBike_make());
		existingBike.setBike_registration_number(bike.getBike_registration_number());
		existingBike.setBike_chassis_number(bike.getBike_chassis_number());
		existingBike.setKnown_issue(bike.getKnown_issue());
		existingBike.setCost(bike.getCost());
		existingBike.setGiven_date(bike.getGiven_date());
		existingBike.setExpected_delivery_date(bike.getExpected_delivery_date());
		existingBike.setCreated_date(bike.getCreated_date());
		existingBike.setUpdated_date(bike.getUpdated_date());
		existingBike.setAddress(bike.getAddress());
		existingBike.setPhone_number(bike.getPhone_number());
		bikerepository.save(existingBike);
		return existingBike;
	}
	@Override
	public void deleteBike(long id) {
		bikerepository.findById(id).orElseThrow(()->
		new ResourcesNotFoundException("Bike","id",id));
		bikerepository.deleteById(id);
		
	}
	
}

