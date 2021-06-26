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


import com.smoothstack.utopiaspring.model.Booking;

import com.smoothstack.utopiaspring.service.BookingService;

@RestController
@RequestMapping(value = "/utopia")
public class BookingController {

	@Autowired
	private final BookingService bookingService;

	public BookingController(BookingService bookingService) {
		this.bookingService = bookingService;
	}

	@GetMapping(value = "/bookings")
	public List<Booking> getBookings() {
		return bookingService.getBookings();
	}

	@PostMapping("/bookings")
	public List<Booking> createBooking(@RequestBody Booking booking) {
		bookingService.save(booking);
		return bookingService.getBookings();
	}
	
	@GetMapping(value = "/bookings/{id}")
	public Booking getBookingById(@PathVariable("id") Integer id) {
		return bookingService.getBookingById(id);
	}
	
//	@PutMapping(value = "/routes/{id}")
//	public Route updateRoute(@RequestBody Route route) {
//
//		System.out.println(route + "from RouteController");
//
//		routeService.updateRoute(route);
//		return routeService.getRouteById(route.getId());
//	}

	@DeleteMapping(path = "/bookings/{id}")
	public void deleteBooking(@PathVariable("id") Integer id) {
		bookingService.deleteBooking(id);
	}
}
