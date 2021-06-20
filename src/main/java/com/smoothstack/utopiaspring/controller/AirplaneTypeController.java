package com.smoothstack.utopiaspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smoothstack.utopiaspring.model.AirplaneType;

import com.smoothstack.utopiaspring.service.AirplaneTypeService;

@RestController
@RequestMapping(value = "/utopia")
public class AirplaneTypeController {

	@Autowired
	private final AirplaneTypeService airplaneTypeService;

	public AirplaneTypeController(AirplaneTypeService airplaneTypeService) {
		this.airplaneTypeService = airplaneTypeService;
	}

	@GetMapping(value = "/airplanetypes")
	public List<AirplaneType> getAirplaneTypes() {
		return airplaneTypeService.getAirplaneTypes();
	}

	@PostMapping("/airplanetypes")
	public List<AirplaneType> createAirplaneType(@RequestBody AirplaneType airplaneType) {
		airplaneTypeService.save(airplaneType);
		return airplaneTypeService.getAirplaneTypes();
	}

}