package com.smoothstack.utopiaspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smoothstack.utopiaspring.model.Flight;
import com.smoothstack.utopiaspring.repository.FlightRepository;

@Service
public class FlightService {

	private final FlightRepository flightRepo;

	@Autowired
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
