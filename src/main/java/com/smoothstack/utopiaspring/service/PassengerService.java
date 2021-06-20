package com.smoothstack.utopiaspring.service;

import java.util.List;

import com.smoothstack.utopiaspring.model.Passenger;
import com.smoothstack.utopiaspring.repository.PassengerRepository;

public class PassengerService {

	private final PassengerRepository passengerRepo;
	
	
	public PassengerService(PassengerRepository passengerRepo) {
		this.passengerRepo = passengerRepo;
	}

	public List<Passenger> getPassengers() {
		
		return passengerRepo.findAll();
	}

	public void save(Passenger passenger) {
		passengerRepo.save(passenger);
		
	}

}
