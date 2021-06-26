package com.smoothstack.utopiaspring.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "flight")
public class Flight {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    
	@ManyToOne
    private Route routeId;
    
	@ManyToOne
	private Airplane airplaneId;
    
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
	public Route getRouteId() {
		return routeId;
	}

	/**
	 * @param routeId the routeId to set
	 */
	public void setRouteId(Route routeId) {
		this.routeId = routeId;
	}

	/**
	 * @return the airplaneId
	 */
	public Airplane getAirplaneId() {
		return airplaneId;
	}

	/**
	 * @param airplaneId the airplaneId to set
	 */
	public void setAirplaneId(Airplane airplaneId) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airplaneId == null) ? 0 : airplaneId.hashCode());
		result = prime * result + ((depTime == null) ? 0 : depTime.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((reservedSeats == null) ? 0 : reservedSeats.hashCode());
		result = prime * result + ((routeId == null) ? 0 : routeId.hashCode());
		result = prime * result + ((seatPrice == null) ? 0 : seatPrice.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flight other = (Flight) obj;
		if (airplaneId == null) {
			if (other.airplaneId != null)
				return false;
		} else if (!airplaneId.equals(other.airplaneId))
			return false;
		if (depTime == null) {
			if (other.depTime != null)
				return false;
		} else if (!depTime.equals(other.depTime))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (reservedSeats == null) {
			if (other.reservedSeats != null)
				return false;
		} else if (!reservedSeats.equals(other.reservedSeats))
			return false;
		if (routeId == null) {
			if (other.routeId != null)
				return false;
		} else if (!routeId.equals(other.routeId))
			return false;
		if (seatPrice == null) {
			if (other.seatPrice != null)
				return false;
		} else if (!seatPrice.equals(other.seatPrice))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", routeId=" + routeId + ", airplaneId=" + airplaneId + ", depTime=" + depTime
				+ ", reservedSeats=" + reservedSeats + ", seatPrice=" + seatPrice + "]";
	}
    
	
 

}
