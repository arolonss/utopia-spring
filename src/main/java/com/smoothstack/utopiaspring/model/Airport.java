package com.smoothstack.utopiaspring.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CascadeType;

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

}
