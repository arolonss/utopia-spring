package com.smoothstack.utopiaspring.service;

import java.util.List;

import com.smoothstack.utopiaspring.model.Flight;
import com.smoothstack.utopiaspring.repository.FlightRepository;

public class FlightService {

	private final FlightRepository flightRepo;

	public FlightService(FlightRepository flightRepo) {
		this.flightRepo = flightRepo;
	}

	public List<Flight> getFlights() {
		return flightRepo.findAll();
	}

	public void save(Flight flight) {
		flightRepo.save(flight);
		
	}



}
