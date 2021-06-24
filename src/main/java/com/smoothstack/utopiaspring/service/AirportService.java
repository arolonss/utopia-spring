package com.smoothstack.utopiaspring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smoothstack.utopiaspring.model.Airport;

import com.smoothstack.utopiaspring.repository.AirportRepository;

@Service
public class AirportService {

	@Autowired
	private final AirportRepository airportRepo;
	
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
	
	
	
	public Airport updateAirport(Airport airport) {
		Optional<Airport> updatedAirport = airportRepo.findById(airport.getIataId());
		System.out.println("updated airport: " + updatedAirport);
		System.out.println("airport: " + airport);
		
		String updatedIataId = airport.getIataId();
		String updatedCity = airport.getCity();
		
		if (updatedAirport.isPresent()) {
			if (updatedIataId != null && updatedIataId.length() > 0) {

				updatedAirport.get().setIataId(updatedIataId); 
			}

			if (updatedCity != null && updatedCity.length() > 0 ) {

				
				updatedAirport.get().setCity(updatedCity); 
			}

			System.out.println(updatedAirport + "before saving");
			airport = airportRepo.save(updatedAirport.get());
		}
        System.out.println(airport + "after saving");
		return airport;

	}
	
	public void deleteAirport(String id) {
		boolean exists = airportRepo.existsById(id);
		if (!exists) {
			throw new IllegalStateException("Airport " + id + " does not exist!");
		}
		airportRepo.deleteById(id);
		
	}

    

}
