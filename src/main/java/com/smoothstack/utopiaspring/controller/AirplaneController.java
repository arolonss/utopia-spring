package com.smoothstack.utopiaspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smoothstack.utopiaspring.model.Airplane;


import com.smoothstack.utopiaspring.service.AirplaneService;


@RestController
@RequestMapping(value = "/utopia")
public class AirplaneController {



	@Autowired
	private final AirplaneService airplaneService;
	
	public AirplaneController(AirplaneService airplaneService) {
		this.airplaneService = airplaneService;
	}
	
	@GetMapping(value = "/airplanes")
	public List<Airplane> getAirpanes() {
		return airplaneService.getAirplanes();
	}

	@PostMapping("/airplanes")
	public List<Airplane> createAirplane(@RequestBody Airplane airplane) {
		airplaneService.save(airplane);
		return airplaneService.getAirplanes();
	}
}