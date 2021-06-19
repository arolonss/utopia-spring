package com.smoothstack.utopiaspring.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smoothstack.utopiaspring.model.Airport;

@Repository
public interface AirportRepository extends JpaRepository<Airport, String> {


	

}

