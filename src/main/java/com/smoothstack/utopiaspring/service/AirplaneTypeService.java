package com.smoothstack.utopiaspring.service;



import org.springframework.stereotype.Service;






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