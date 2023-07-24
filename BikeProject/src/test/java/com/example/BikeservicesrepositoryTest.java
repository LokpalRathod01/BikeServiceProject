package com.example;
import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.example.entity.Bike;
import com.example.repository.Bikerepository;

@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BikeservicesrepositoryTest {
	




	
	


	
	    
	    @Autowired
	    private Bikerepository bikerepository;
	    
	    @Test
	    @Order(1)
	    @Rollback(value = false)
	    
	    public void saveBikeTest() {
	        Bike bike=new Bike();
	        bike.setBike_make("TVS");
	        bike.setModel_name("Apache");
	        bike.setBike_registration_number("1234567");
	        bike.setBike_chassis_number(323232);
	        bike.setKnown_issue("wheelalignment");
	        bike.setCost(8000);
	        //car.setGiven_date("2022-11-25T09:45:00.00");
	        //car.setExpected_delivery_date("2022-11-25T09:45:00.00");
	        //car.setCreated_date("2022-11-25T09:45:00.00");
	        //car.setUpdated_date("2022-11-25T09:45:00.00");
	        bike.setAddress("Aurangabad");
	        bike.setPhone_number(12345678);
	        
	        bikerepository.save(bike);
	        Assertions.assertThat(bike.getId()).isGreaterThan(0);
	        
	    }
	    
	    @Test
	    @Order(2)
	    @Rollback(value=false)
	    public void getAllBikesTest() {
	        List<Bike> bike = bikerepository.findAll();
	        Assertions.assertThat(bike.size()).isGreaterThan(0);
	    }
	    
	    @Test
	    @Order(3)
	    @Rollback(value=false)
	    public void getBikeByIdTest() {
	      Bike bike=bikerepository.findById((long) 1).get();
	      Assertions.assertThat(bike.getId()).isEqualTo(1);
	    }
	    
	    @Test
	    @Order(4)
	    @Rollback(value=false)
	    public void updateBikeTest() {
	        Bike bike = bikerepository.findById((long) 1).get();
	        bike.setBike_make("TVS");
	        bike.setModel_name("Apache");
	        bike.setBike_registration_number("1234567");
	        bike.setBike_chassis_number(323232);
	        bike.setKnown_issue("wheelalignment");
	        bike.setCost(8000);
	        //car.setGiven_date("2022-11-25T09:45:00.00");
	        //car.setExpected_delivery_date("2022-11-25T09:45:00.00");
	        //car.setCreated_date("2022-11-25T09:45:00.00");
	        //car.setUpdated_date("2022-11-25T09:45:00.00");
	        bike.setAddress("Aurangabad");
	        bike.setPhone_number(12345678);
	        
	        Bike bikeUpdated= bikerepository.save(bike);
	        Assertions.assertThat(bikeUpdated.getBike_make()).isEqualTo("TVS");
	        Assertions.assertThat(bikeUpdated.getModel_name()).isEqualTo("Apache");
	        Assertions.assertThat(bikeUpdated.getBike_registration_number()).isEqualTo("1234567");
	        Assertions.assertThat(bikeUpdated.getBike_chassis_number()).isEqualTo(323232);
	        Assertions.assertThat(bikeUpdated.getKnown_issue()).isEqualTo("323232");
	        Assertions.assertThat(bikeUpdated.getCost()).isEqualTo(8000);
	        //Assertions.assertThat(carUpdated.getGiven_date()).isEqualToIgnoringHours("2022-11-25T09:45:00.00");
	        //Assertions.assertThat(carUpdated.getExpected_delivery_date()).isEqualToIgnoringHours("2022-11-25T09:45:00.00");
	        //Assertions.assertThat(carUpdated.getCreated_date()).isEqualToIgnoringHours("2022-11-25T09:45:00.00");
	        //Assertions.assertThat(carUpdated.getUpdated_date()).isEqualToIgnoringHours("2022-11-25T09:45:00.00");
	        Assertions.assertThat(bikeUpdated.getAddress()).isEqualTo("Aurangabad");
	        Assertions.assertThat(bikeUpdated.getPhone_number()).isEqualTo(12345678);
	    
	    }
	    @Test
	    @Order(5)
	    @Rollback(value=false)
	    public void deleteBikeTest() {
	        Bike bike =bikerepository.findById((long) 1).get();
	        bikerepository.delete(bike);
	        
	        Bike newBike = null;
	        
	        Optional<Bike> bikeoptional= bikerepository.findById((long) 1);
	        
	        if(bikeoptional.isPresent()) {
	            newBike= bikeoptional.get();
	        }
	        Assertions.assertThat(newBike).isNull();
	    }
	    



	}

