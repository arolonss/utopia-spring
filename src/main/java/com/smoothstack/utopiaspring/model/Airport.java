package com.smoothstack.utopiaspring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "airport")
public class Airport {

	@Id
	private String iataId;

	private String city;
	
	

	public Airport() {

	}

	/**
	 * @param iataId
	 * @param city
	 */
	public Airport(String iataId, String city) {
		this.iataId = iataId;
		this.city = city;
	}

	

	@Override
	public String toString() {
		return "Airport [iataId=" + iataId + ", city=" + city + "]";
	}

	/**
	 * @return the iataId
	 */
	public String getIataId() {
		return iataId;
	}

	/**
	 * @param iataId the iataId to set
	 */
	public void setIataId(String iataId) {
		this.iataId = iataId;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((iataId == null) ? 0 : iataId.hashCode());
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
		Airport other = (Airport) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (iataId == null) {
			if (other.iataId != null)
				return false;
		} else if (!iataId.equals(other.iataId))
			return false;
		return true;
	}

	

}
