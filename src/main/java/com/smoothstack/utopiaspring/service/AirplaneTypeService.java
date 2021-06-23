package com.smoothstack.utopiaspring.service;

//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.smoothstack.utopiaspring.model.AirplaneType;
//
//import com.smoothstack.utopiaspring.repository.AirplaneTypeRepository;

@Service
public class AirplaneTypeService {

//	@Autowired
//	private final AirplaneTypeRepository airplaneTypeRepo;
//
//	
//	public AirplaneTypeService(AirplaneTypeRepository airplaneTypeRepo) {
//		this.airplaneTypeRepo = airplaneTypeRepo;
//	}
//
//	public List<AirplaneType> getAirplaneTypes() {
//		return airplaneTypeRepo.findAll();
//	}
//
//	public void save(AirplaneType airplaneType) {
//		airplaneTypeRepo.save(airplaneType);
//	}
//	
//	public AirplaneType getAirplaneTypeById(Integer id) {
//		return airplaneTypeRepo.findById(id).get();
//	}
//
//	public void deleteAirplaneType(Integer id) {
//		
//		boolean exists = airplaneTypeRepo.existsById(id);
//		if (!exists) {
//			throw new IllegalStateException("Airplane type" + id + " does not exist!");
//		}
//		airplaneTypeRepo.deleteById(id);
//	}
}