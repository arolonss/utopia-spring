package com.smoothstack.utopiaspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.smoothstack.utopiaspring.model.Route;

import com.smoothstack.utopiaspring.service.RouteService;

@RestController
@RequestMapping(value = "/utopia")
public class RouteController {

	@Autowired
	private final RouteService routeService;

	public RouteController(RouteService routeService) {
		this.routeService = routeService;
	}

	@GetMapping(value = "/routes")
	public List<Route> getRoutes() {
		return routeService.getRoutes();
	}

	@PostMapping("/routes")
	public List<Route> createRoute(@RequestBody Route route) {
		routeService.save(route);
		return routeService.getRoutes();
	}
	
	@GetMapping(value = "/routes/{id}")
	public Route getRouteById(@PathVariable("id") Integer id) {
		return routeService.getRouteById(id);
	}

	@DeleteMapping(path = "/routes/{id}")
	public void deleteRoute(@PathVariable("id") Integer id) {
		routeService.deleteRoute(id);
	}
}