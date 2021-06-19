package com.smoothstack.utopiaspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smoothstack.utopiaspring.model.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

}
