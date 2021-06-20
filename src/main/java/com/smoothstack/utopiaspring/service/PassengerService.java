package com.smoothstack.utopiaspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smoothstack.utopiaspring.model.Passenger;
import com.smoothstack.utopiaspring.repository.PassengerRepository;

@Service
public class PassengerService {

	private final PassengerRepository passengerRepo;
	
	@Autowired
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
