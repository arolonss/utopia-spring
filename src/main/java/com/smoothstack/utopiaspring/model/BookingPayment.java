package com.smoothstack.utopiaspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "booking_payment")
public class BookingPayment {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookingId;
    
    @Column(name = "stripe_id")
	private String stripeId;
    
    @Column(name = "refunded")
	private Integer refunded;

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

	/**
	 * @return the stripeId
	 */
	public String getStripeId() {
		return stripeId;
	}

	/**
	 * @param stripeId the stripeId to set
	 */
	public void setStripeId(String stripeId) {
		this.stripeId = stripeId;
	}

	/**
	 * @return the refunded
	 */
	public Integer getRefunded() {
		return refunded;
	}

	/**
	 * @param refunded the refunded to set
	 */
	public void setRefunded(Integer refunded) {
		this.refunded = refunded;
	}
	
    

}
