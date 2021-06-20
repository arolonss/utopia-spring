package com.smoothstack.utopiaspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.smoothstack.utopiaspring.model.Airport;

import com.smoothstack.utopiaspring.service.AirportService;

@RestController
@RequestMapping(value = "/utopia")
public class AirportController {

	@Autowired
	private final AirportService airportService;

	public AirportController(AirportService airportService) {
		this.airportService = airportService;
	}

	@GetMapping(value = "/airports")
	public List<Airport> getAirports() {
		return airportService.getAirports();
	}

	@PostMapping("/airports")
	public List<Airport> createAirport(@RequestBody Airport airport) {
		airportService.save(airport);
		return airportService.getAirports();
	}

}
