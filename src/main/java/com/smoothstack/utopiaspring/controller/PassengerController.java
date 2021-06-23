package com.smoothstack.utopiaspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smoothstack.utopiaspring.model.Passenger;

import com.smoothstack.utopiaspring.service.PassengerService;

@RestController
@RequestMapping(value = "/utopia")
public class PassengerController {

	@Autowired
	private final PassengerService passengerService;

	public PassengerController(PassengerService passengerService) {
		this.passengerService = passengerService;
	}

	@GetMapping(value = "/passengers")
	public List<Passenger> getPassengers() {
		return passengerService.getPassengers();
	}

	@PostMapping("/passengers")
	public List<Passenger> createPassenger(@RequestBody Passenger passenger) {
		passengerService.save(passenger);
		return passengerService.getPassengers();
	}
	
	@GetMapping(value = "/passengers/{id}")
	public Passenger getPassengerById(@PathVariable("id") Integer id) {
		return passengerService.getPassengerById(id);
	}

	@PutMapping(value = "/passengers/{id}")
	public Passenger updatePassenger(@PathVariable("id") Integer id) {
		Passenger p = getPassengerById(id);
	    return passengerService.updatePassenger(p);	
	}
}