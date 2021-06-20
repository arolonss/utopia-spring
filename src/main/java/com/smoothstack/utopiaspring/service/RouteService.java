package com.smoothstack.utopiaspring.service;

import java.util.List;

import com.smoothstack.utopiaspring.model.Route;
import com.smoothstack.utopiaspring.repository.RouteRepository;

public class RouteService {

	private final RouteRepository routeRepo;
	
	
	public RouteService(RouteRepository routeRepo) {
		this.routeRepo = routeRepo;
	}

	public List<Route> getRoutes() {
		return routeRepo.findAll();
	}

	public void save(Route route) {
		routeRepo.save(route);
		
	}

}
