package com.smoothstack.utopiaspring.service;

import java.util.List;

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

	public void save(Airport airport) {
		airportRepo.save(airport);
	}
    

}
