package com.smoothstack.utopiaspring.service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smoothstack.utopiaspring.model.Airplane;
import com.smoothstack.utopiaspring.model.Flight;
import com.smoothstack.utopiaspring.model.Route;
import com.smoothstack.utopiaspring.repository.AirplaneRepository;
import com.smoothstack.utopiaspring.repository.FlightBookingRepository;
import com.smoothstack.utopiaspring.repository.FlightRepository;
import com.smoothstack.utopiaspring.repository.RouteRepository;

@Service
public class FlightService {

	@Autowired
	private final FlightRepository flightRepo;

	@Autowired
	private FlightBookingRepository flightBookingRepo;

	@Autowired
	private AirplaneRepository airplaneRepo;

	//@Autowired
	//private AirplaneTypeRepository airplaneTypeRepo;

	@Autowired
	private RouteRepository routeRepo;

	public FlightService(FlightRepository flightRepo) {
		this.flightRepo = flightRepo;
	}

	public List<Flight> getFlights() {
		return flightRepo.findAll();
	}

	public void save(Flight flight) {
		flightRepo.save(flight);

	}

	public Flight getFlightById(Integer id) {
		return flightRepo.findById(id).get();
	}

	@Transactional
	public Flight updateFlight(Flight flight) {

		Optional<Flight> updatedFlight = flightRepo.findById(flight.getId());
		Optional<Route> updatedRoute = routeRepo.findById(flight.getRouteId().getId());
		Optional<Airplane> updatedAirplane = airplaneRepo.findById(flight.getAirplaneId().getId());
		System.out.println("updated flight: " + updatedFlight);
		System.out.println("flight: " + flight);
		Timestamp updatedDepartureTime = flight.getDepTime();
		Integer updatedSeats = flight.getReservedSeats();
		Float updatedSeatPrice = flight.getSeatPrice();

		if (updatedFlight.isPresent()) {

			updatedFlight.get().setRouteId(updatedRoute.orElseGet(() -> updatedFlight.get().getRouteId()));
			updatedFlight.get().setAirplaneId(updatedAirplane.orElseGet(() -> updatedFlight.get().getAirplaneId()));

			if (updatedDepartureTime != null) {
				updatedFlight.get().setDepTime(updatedDepartureTime);
			}

			if (updatedSeats >= 0) {
				updatedFlight.get().setReservedSeats(updatedSeats);
			}

			if (updatedSeatPrice >= 0) {
				updatedFlight.get().setSeatPrice(updatedSeatPrice);
			}

			System.out.println(updatedFlight + "before saving");
			flight = flightRepo.save(updatedFlight.get());
		}
		System.out.println(flight + "after saving");
		return flight;

	}

	public void deleteFlight(Integer id) {
		boolean exists = flightRepo.existsById(id);
		if (!exists) {
			throw new IllegalStateException("Flight " + id + " does not exist!");
		}
		flightRepo.deleteById(id);

	}

}
