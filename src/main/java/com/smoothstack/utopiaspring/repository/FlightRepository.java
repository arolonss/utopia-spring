package com.smoothstack.utopiaspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smoothstack.utopiaspring.model.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer> {

}
