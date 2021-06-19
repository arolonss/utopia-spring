package com.smoothstack.utopiaspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smoothstack.utopiaspring.model.FlightBooking;

@Repository
public interface FlightBookingRepository extends JpaRepository<FlightBooking, Integer> {

}
