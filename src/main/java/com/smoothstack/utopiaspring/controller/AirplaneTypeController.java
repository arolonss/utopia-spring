package com.smoothstack.utopiaspring.controller;


//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//
//import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping(value = "/utopia")
public class AirplaneTypeController {

//	@Autowired
//	private final AirplaneTypeService airplaneTypeService;
//
//	public AirplaneTypeController(AirplaneTypeService airplaneTypeService) {
//		this.airplaneTypeService = airplaneTypeService;
//	}

//	@GetMapping(value = "/airplanetypes")
//	public List<AirplaneType> getAirplaneTypes() {
//		return airplaneTypeService.getAirplaneTypes();
//	}
//
//	@PostMapping("/airplanetypes")
//	public List<AirplaneType> createAirplaneType(@RequestBody AirplaneType airplaneType) {
//		airplaneTypeService.save(airplaneType);
//		return airplaneTypeService.getAirplaneTypes();
//	}
//	
//	@GetMapping(value = "/airplanetypes/{id}")
//	public AirplaneType getAirplaneTypeById(@PathVariable("id") Integer id) {
//		return airplaneTypeService.getAirplaneTypeById(id);
//	}

//	@DeleteMapping(path = "/airplanetypes/{id}")
//	public void deleteAirplaneType(@PathVariable("id") Integer id) {
//		airplaneTypeService.deleteAirplaneType(id);
//	}
}