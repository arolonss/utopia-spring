package com.smoothstack.utopiaspring.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smoothstack.utopiaspring.model.Booking;
import com.smoothstack.utopiaspring.model.Passenger;
import com.smoothstack.utopiaspring.model.User;
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

	@Transactional
	public Passenger updatePassenger(Passenger passenger) {
		
		Optional<Passenger> updatedPassenger = passengerRepo.findById(passenger.getId());
		System.out.println("updated passenger: " + updatedPassenger);
		System.out.println("passenger: " + passenger);
	
		String updatedFirstName = passenger.getFirstName();
		String updatedLastName = passenger.getLastName();
		String updatedGender = passenger.getGender();
		
		String updatedAddress = passenger.getAddress();
		
		
	
		if (updatedPassenger.isPresent()) {
			if (updatedFirstName != null && updatedFirstName.length() > 0) {

				updatedPassenger.get().setFirstName(updatedFirstName);
			}

			if (updatedLastName != null && updatedLastName.length() > 0) {

				updatedPassenger.get().setLastName(updatedLastName); 
			}

			if (updatedGender != null && updatedGender.length() > 0) {

				
				updatedPassenger.get().setGender(updatedGender);
			}


			if (updatedAddress != null && updatedAddress.length() > 0) {

				updatedPassenger.get().setAddress(updatedAddress);
			}

	
			System.out.println(updatedPassenger + "before saving");
			passenger = passengerRepo.save(updatedPassenger.get());
		}
		System.out.println(passenger + "after saving");
		return passenger;

	}

}
