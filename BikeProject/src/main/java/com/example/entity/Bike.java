package com.example.entity;

import java.sql.Date;
import java.sql.Timestamp;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Bike {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String bike_make;
	private String model_name;
	private String bike_registration_number;
	private double bike_chassis_number;
	private String known_issue;
	private long cost;
	private Timestamp given_date;
	private Date expected_delivery_date;
	private Timestamp created_date;
	private Timestamp updated_date;
	private String address;
	private int phone_number;
	public long getId() {
		return id;
	}
	
	
	
	public Bike() {
		super();
		 
	}



	public Bike(long id, String bike_make, String model_name, String bike_registration_number,
			double bike_chassis_number, String known_issue, long cost, Timestamp given_date,
			Date expected_delivery_date, Timestamp created_date, Timestamp updated_date, String address,
			int phone_number) {
		super();
		this.id = id;
		this.bike_make = bike_make;
		this.model_name = model_name;
		this.bike_registration_number = bike_registration_number;
		this.bike_chassis_number = bike_chassis_number;
		this.known_issue = known_issue;
		this.cost = cost;
		this.given_date = given_date;
		this.expected_delivery_date = expected_delivery_date;
		this.created_date = created_date;
		this.updated_date = updated_date;
		this.address = address;
		this.phone_number = phone_number;
	}



	public void setId(long id) {
		this.id = id;
	}
	public String getBike_make() {
		return bike_make;
	}
	public void setBike_make(String bike_make) {
		this.bike_make = bike_make;
	}
	public String getModel_name() {
		return model_name;
	}
	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}
	public String getBike_registration_number() {
		return bike_registration_number;
	}
	public void setBike_registration_number(String bike_registration_number) {
		this.bike_registration_number = bike_registration_number;
	}
	public double getBike_chassis_number() {
		return bike_chassis_number;
	}
	public void setBike_chassis_number(double bike_chassis_number) {
		this.bike_chassis_number = bike_chassis_number;
	}
	public String getKnown_issue() {
		return known_issue;
	}
	public void setKnown_issue(String known_issue) {
		this.known_issue = known_issue;
	}
	public long getCost() {
		return cost;
	}
	public void setCost(long cost) {
		this.cost = cost;
	}
	public Timestamp getGiven_date() {
		return given_date;
	}
	public void setGiven_date(Timestamp given_date) {
		this.given_date = given_date;
	}
	public Date getExpected_delivery_date() {
		return expected_delivery_date;
	}
	public void setExpected_delivery_date(Date expected_delivery_date) {
		this.expected_delivery_date = expected_delivery_date;
	}
	public Timestamp getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Timestamp created_date) {
		this.created_date = created_date;
	}
	public Timestamp getUpdated_date() {
		return updated_date;
	}
	public void setUpdated_date(Timestamp updated_date) {
		this.updated_date = updated_date;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	

}
