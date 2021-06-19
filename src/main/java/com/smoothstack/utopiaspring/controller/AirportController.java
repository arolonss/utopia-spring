package com.smoothstack.utopiaspring.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import com.smoothstack.utopiaspring.model.Airport;
import com.smoothstack.utopiaspring.service.AdminService;





@RestController
@RequestMapping(value = "/utopia")
public class AirportController {

	@Autowired
	//private AirportDAO airportDao;
	private final AdminService adminService;
	
	public AirportController(AdminService adminService) {
		this.adminService = adminService;
	}
	
	@GetMapping(value = "/airports")
	public List<Airport> getAirports() {
		return adminService.getAirports();
	}

	@PostMapping("/airports")
	public List<Airport> createAirport(@RequestBody Airport airport) {
		adminService.save(airport);
		return adminService.getAirports();
	}
	
	
}
