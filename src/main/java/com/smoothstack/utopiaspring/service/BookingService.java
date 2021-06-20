package com.smoothstack.utopiaspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smoothstack.utopiaspring.model.Booking;
import com.smoothstack.utopiaspring.repository.BookingRepository;

@Service
public class BookingService {

	private final BookingRepository bookingRepo;
	
	@Autowired
	public BookingService(BookingRepository bookingRepo) {
		this.bookingRepo = bookingRepo;
	}

	public List<Booking> getBookings() {
		return bookingRepo.findAll();
	}

	public Booking save(Booking booking) {
		return bookingRepo.save(booking);
	}

}
