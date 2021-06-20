package com.smoothstack.utopiaspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.smoothstack.utopiaspring.model.Flight;

import com.smoothstack.utopiaspring.service.FlightService;

@RestController
@RequestMapping(value = "/utopia")
public class FlightController {

	@Autowired
	private final FlightService flightService;

	public FlightController(FlightService flightService) {
		this.flightService = flightService;
	}

	@GetMapping(value = "/flights")
	public List<Flight> getFlights() {
		return flightService.getFlights();
	}

	@PostMapping("/flights")
	public List<Flight> createFlight(@RequestBody Flight flight) {
		flightService.save(flight);
		return flightService.getFlights();
	}
}
