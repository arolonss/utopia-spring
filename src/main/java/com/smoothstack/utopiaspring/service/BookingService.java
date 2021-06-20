package com.smoothstack.utopiaspring.service;

import java.util.List;

import com.smoothstack.utopiaspring.model.Booking;
import com.smoothstack.utopiaspring.repository.BookingRepository;

public class BookingService {

	private final BookingRepository bookingRepo;
	

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
