package com.smoothstack.utopiaspring.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smoothstack.utopiaspring.model.Airplane;

import com.smoothstack.utopiaspring.repository.AirplaneRepository;

@Service
public class AirplaneService {

	@Autowired
	private final AirplaneRepository airplaneRepo;

	
	public AirplaneService(AirplaneRepository airplaneRepo) {
		this.airplaneRepo = airplaneRepo;
	}

	public List<Airplane> getAirplanes() {
		return airplaneRepo.findAll();
	}

	public void save(Airplane airplane) {
		airplaneRepo.save(airplane);
		
	}

	public Airplane getAirplaneById(Integer id) {
		return airplaneRepo.findById(id).get();
	}

//	@Transactional
//	public void updateAirplane(Integer id, Integer typeId) {
//	  	Airplane airplane = airplaneRepo.findById(id).orElseThrow(() -> new IllegalStateException("Airplane " + id + " does not exist!"));
//	    
//	  	if (typeId != null && !Objects.equals(airplane.getTypeId(), typeId)) {
//	  		airplane.setTypeId(typeId);
//	  	} else {
//	  		throw new IllegalStateException("New value must be different than current value!");
//	  	}
//	  	airplaneRepo.save();
//	}
	
	public void deleteAirplane(Integer id) {
		boolean exists = airplaneRepo.existsById(id);
		if (!exists) {
			throw new IllegalStateException("Airplane " + id + " does not exist!");
		}
		airplaneRepo.deleteById(id);
			
	}

	
}
