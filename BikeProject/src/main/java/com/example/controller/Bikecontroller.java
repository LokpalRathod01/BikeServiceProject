package com.example.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Bike;

import com.example.service.Bikeservice;

@RestController
@RequestMapping("/bikeservice")


public class Bikecontroller {
	@Autowired
	
	private Bikeservice bikeservice;
	
	//build create bike REST API
	@PostMapping()
	public ResponseEntity<Bike> saveBike(@RequestBody Bike bike){
		return new ResponseEntity<Bike>(bikeservice.saveBike(bike), HttpStatus.CREATED);
	}
	
	//build get all bike REST bike
	@GetMapping()
	public List<Bike> getAllBikes() {
		return bikeservice.getAllBikes() ;
	}
	


	
	//build get bike by id REST API
	@GetMapping("{id}")
	public ResponseEntity<Bike> getBikeById(@PathVariable("id") long id){
		return new ResponseEntity<Bike>(bikeservice.getBikeById(id), HttpStatus.OK);
		
	}

//build put  REST API
@PutMapping("{id}")
public ResponseEntity<Bike> updateBikeById(@PathVariable("id") long id,@RequestBody Bike bike){
    return new ResponseEntity<Bike>(bikeservice.updateBike(bike, id), HttpStatus.CREATED);
}
//build delete REST API
@DeleteMapping("{id}")
public ResponseEntity<String> deleteBike(@PathVariable("id") long id){
	bikeservice.deleteBike(id);
	return new ResponseEntity<String>("bike details deleted successfully",HttpStatus.ACCEPTED);
}
}
    
