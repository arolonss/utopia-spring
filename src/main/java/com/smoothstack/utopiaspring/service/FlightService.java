package com.smoothstack.utopiaspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smoothstack.utopiaspring.model.Flight;
import com.smoothstack.utopiaspring.repository.FlightRepository;

@Service
public class FlightService {

	@Autowired
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
	
	public Flight getFlightById(Integer id) {
		return flightRepo.findById(id).get();
	}

	public void deleteFlight(Integer id) {
		boolean exists = flightRepo.existsById(id);
		if (!exists) {
			throw new IllegalStateException("Flight " + id + " does not exist!");
		}
		flightRepo.deleteById(id);
		
	}

}
