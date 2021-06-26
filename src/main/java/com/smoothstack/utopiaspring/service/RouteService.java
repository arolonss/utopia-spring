package com.smoothstack.utopiaspring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smoothstack.utopiaspring.model.Route;

import com.smoothstack.utopiaspring.repository.RouteRepository;

@Service
public class RouteService {

	@Autowired
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

	public Route getRouteById(Integer id) {
		return routeRepo.findById(id).get();
	}

//	@Transactional
//	public Route updateRoute(Route route) {
//
//		Optional<Route> updatedRoute = routeRepo.findById(route.getId());
//		System.out.println("updated route: " + updatedRoute);
//		System.out.println("route: " + route);
//
//		String updatedOrigin = route.getOriginId().getIataId();
//		String updatedDest = route.getDestId().getIataId();
//
//		System.out.println(updatedOrigin);
//		System.out.println(updatedDest);
//		
//		if (updatedRoute.isPresent()) {
//			if (updatedOrigin != null && updatedOrigin.length() > 0) {
//
//				updatedRoute.get().setOriginId(route.getOriginId());
//			}
//
//			if (updatedDest != null && updatedDest.length() > 0) {
//
//				updatedRoute.get().setDestId(route.getDestId());
//			}
//
//			System.out.println(updatedRoute + "before saving");
//			route = routeRepo.save(updatedRoute.get());
//		}
//		System.out.println(route + "after saving");
//		return route;
//
//	}

	public void deleteRoute(Integer id) {
		boolean exists = routeRepo.existsById(id);
		if (!exists) {
			throw new IllegalStateException("Route number " + id + " does not exist!");
		}
		routeRepo.deleteById(id);

	}

}
