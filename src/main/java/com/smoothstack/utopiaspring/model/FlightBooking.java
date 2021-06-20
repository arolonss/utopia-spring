package com.smoothstack.utopiaspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.smoothstack.utopiaspring.id.FlightBookingId;

@Entity
@Table(name = "flight_bookings")
@IdClass(FlightBookingId.class)
public class FlightBooking {

	@Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "flight_id")
	private Integer flightId;
    
	@Id
    @Column(name = "booking_id")
	private Integer bookingId;

	/**
	 * @return the flightId
	 */
	public Integer getFlightId() {
		return flightId;
	}

	/**
	 * @param flightId the flightId to set
	 */
	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}

	/**
	 * @return the bookingId
	 */
	public Integer getBookingId() {
		return bookingId;
	}

	/**
	 * @param bookingId the bookingId to set
	 */
	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}
    
 
}
