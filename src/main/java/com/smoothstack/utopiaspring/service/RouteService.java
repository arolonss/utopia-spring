package com.smoothstack.utopiaspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.smoothstack.utopiaspring.model.Route;
import com.smoothstack.utopiaspring.repository.RouteRepository;

@Service
public class RouteService {

	private final RouteRepository routeRepo;
	
	@Autowired
	public RouteService(RouteRepository routeRepo) {
		this.routeRepo = routeRepo;
	}

	public List<Route> getRoutes() {
		return routeRepo.findAll();
	}

	public void save(Route route) {
		routeRepo.save(route);
		
	}
	
	public Route getRouteById(Integer id) {
		return routeRepo.findById(id).get();
	}

	public void deleteRoute(Integer id) {
		boolean exists = routeRepo.existsById(id);
		if (!exists) {
			throw new IllegalStateException("Route number " + id + " does not exist!");
		}
		routeRepo.deleteById(id);
		
	}

}
