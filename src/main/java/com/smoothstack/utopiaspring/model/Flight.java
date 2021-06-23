package com.smoothstack.utopiaspring.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flight")
public class Flight {

	@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    
    @Column(name = "route_id")
	private Integer routeId;
    
    @Column(name = "airplane_id")
	private String airplaneId;
    
    @Column(name = "departure_time")
	private Timestamp depTime;
    
    @Column(name = "reserved_seats")
	private Integer reservedSeats;
    
    @Column(name = "seat_price")
	private Float seatPrice;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the routeId
	 */
	public Integer getRouteId() {
		return routeId;
	}

	/**
	 * @param routeId the routeId to set
	 */
	public void setRouteId(Integer routeId) {
		this.routeId = routeId;
	}

	/**
	 * @return the airplaneId
	 */
	public String getAirplaneId() {
		return airplaneId;
	}

	/**
	 * @param airplaneId the airplaneId to set
	 */
	public void setAirplaneId(String airplaneId) {
		this.airplaneId = airplaneId;
	}

	/**
	 * @return the depTime
	 */
	public Timestamp getDepTime() {
		return depTime;
	}

	/**
	 * @param depTime the depTime to set
	 */
	public void setDepTime(Timestamp depTime) {
		this.depTime = depTime;
	}

	/**
	 * @return the reservedSeats
	 */
	public Integer getReservedSeats() {
		return reservedSeats;
	}

	/**
	 * @param reservedSeats the reservedSeats to set
	 */
	public void setReservedSeats(Integer reservedSeats) {
		this.reservedSeats = reservedSeats;
	}

	/**
	 * @return the seatPrice
	 */
	public Float getSeatPrice() {
		return seatPrice;
	}

	/**
	 * @param seatPrice the seatPrice to set
	 */
	public void setSeatPrice(Float seatPrice) {
		this.seatPrice = seatPrice;
	}
    
 

}
