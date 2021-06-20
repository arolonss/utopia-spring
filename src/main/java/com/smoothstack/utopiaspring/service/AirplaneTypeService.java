package com.smoothstack.utopiaspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smoothstack.utopiaspring.model.AirplaneType;

import com.smoothstack.utopiaspring.repository.AirplaneTypeRepository;

@Service
public class AirplaneTypeService {

	private final AirplaneTypeRepository airplaneTypeRepo;

	@Autowired
	public AirplaneTypeService(AirplaneTypeRepository airplaneTypeRepo) {
		this.airplaneTypeRepo = airplaneTypeRepo;
	}

	public List<AirplaneType> getAirplaneTypes() {
		return airplaneTypeRepo.findAll();
	}

	public void save(AirplaneType airplaneType) {
		airplaneTypeRepo.save(airplaneType);
	}
}