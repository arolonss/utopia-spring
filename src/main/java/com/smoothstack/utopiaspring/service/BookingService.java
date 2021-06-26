package com.smoothstack.utopiaspring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.smoothstack.utopiaspring.model.Booking;
import com.smoothstack.utopiaspring.repository.BookingRepository;

@Service
public class BookingService {

	@Autowired
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
	
	public Booking getBookingById(Integer id) {
		return bookingRepo.findById(id).get();
	}
	
	public Booking updateBooking(Booking booking) {
	
		Optional<Booking> updatedBooking = bookingRepo.findById(booking.getId());
		System.out.println("updated booking: " + updatedBooking);
		System.out.println("booking: " + booking);



		if (updatedBooking.isPresent()) {
			if (booking.getIsActive() > 0) {

				updatedBooking.get().setIsActive(booking.getIsActive()); 
			}

			if (booking.getConfCode() != null && booking.getConfCode().length() > 0 ) {

				
				updatedBooking.get().setConfCode(booking.getConfCode()); 
			}


			System.out.println(updatedBooking + "before saving");
			booking = bookingRepo.save(updatedBooking.get());
		}
        System.out.println(booking + "after saving");
		return booking;

	}
	public void deleteBooking(Integer id) {
		boolean exists = bookingRepo.existsById(id);
		if (!exists) {
			throw new IllegalStateException("Booking number " + id + " does not exist!");
		}
		bookingRepo.deleteById(id);
		
	}

}
