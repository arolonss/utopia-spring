package com.smoothstack.utopiaspring.service;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smoothstack.utopiaspring.model.Airplane;

import com.smoothstack.utopiaspring.repository.AirplaneRepository;


@Service
public class AirplaneService {

	private final AirplaneRepository airplaneRepo;

	@Autowired
	public AirplaneService(AirplaneRepository airplaneRepo) {
		this.airplaneRepo = airplaneRepo;
	}

	public List<Airplane> getAirplanes() {
		return airplaneRepo.findAll();
	}
	
	

}
