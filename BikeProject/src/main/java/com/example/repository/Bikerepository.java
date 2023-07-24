package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.Bike;

@Repository

public interface Bikerepository extends JpaRepository<Bike, Long>{

}
 