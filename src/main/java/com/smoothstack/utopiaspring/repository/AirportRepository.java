package com.smoothstack.utopiaspring.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.smoothstack.utopiaspring.model.Airport;

@Repository
public interface AirportRepository extends JpaRepository<Airport, String> {

	@Query("SELECT a FROM Airport a WHERE a.city = ?1") //jbql
	Optional<Airport> findAirportByCity(String city); 
	    //SELECT * FROM airport WHERE city = ?	
	

}

