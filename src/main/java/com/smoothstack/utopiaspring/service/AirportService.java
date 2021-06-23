package com.smoothstack.utopiaspring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smoothstack.utopiaspring.model.Airport;

import com.smoothstack.utopiaspring.repository.AirportRepository;

@Service
public class AirportService {

	private final AirportRepository airportRepo;
	

	@Autowired
	public AirportService(AirportRepository airportRepo) {
		this.airportRepo = airportRepo;
	}
	
	
	public List<Airport> getAirports() {

		return airportRepo.findAll();
	}

	public void createAirport(Airport airport) {
		Optional<Airport> airportOptional = airportRepo.findById(airport.getIataId());
		if (airportOptional.isPresent()) {
			throw new IllegalStateException("Already exists in database!");
		} 
		airportRepo.save(airport);
	}


	public Airport getAirportById(String id) {
		return airportRepo.findById(id).get();
	}
	
	
	public void deleteAirport(String id) {
		boolean exists = airportRepo.existsById(id);
		if (!exists) {
			throw new IllegalStateException("Airport " + id + " does not exist!");
		}
		airportRepo.deleteById(id);
		
	}
    

}
