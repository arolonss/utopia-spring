package com.smoothstack.utopiaspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smoothstack.utopiaspring.model.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}
