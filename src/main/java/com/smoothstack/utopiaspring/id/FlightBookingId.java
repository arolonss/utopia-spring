package com.smoothstack.utopiaspring.id;

import java.util.Objects;

public class FlightBookingId implements java.io.Serializable {
	int flightId;
	int bookingId;

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	@Override
	public String toString() {
		return "FlightBookingId{" + "flightId=" + flightId + ", bookingId=" + bookingId + '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		FlightBookingId that = (FlightBookingId) o;
		return flightId == that.flightId && bookingId == that.bookingId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(flightId, bookingId);
	}
}
