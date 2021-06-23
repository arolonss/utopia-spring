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
	
	public Passenger getPassengerById(Integer id) {
		return passengerRepo.findById(id).get();
	}

	
	public void deletePassenger(Integer id) {
		boolean exists = passengerRepo.existsById(id);
		if (!exists) {
			throw new IllegalStateException("Passenger " + id + " does not exist!");
		}
		passengerRepo.deleteById(id);
		
	}

	public Passenger updatePassenger(Passenger p) {
		return passengerRepo.save(p);
	}
}
