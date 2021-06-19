package com.smoothstack.utopiaspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smoothstack.utopiaspring.model.BookingGuest;

@Repository
public interface BookingGuestRepository extends JpaRepository<BookingGuest, Integer> {

}
