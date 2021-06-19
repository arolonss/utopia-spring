package com.smoothstack.utopiaspring.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "airplane_type")
public class AirplaneType {

    @Id
    // why is this auto increment in the schema ? @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    
    @Column(name = "max_capacity")
	private Integer maxCap;

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
	 * @return the maxCap
	 */
	public Integer getMaxCap() {
		return maxCap;
	}

	/**
	 * @param maxCap the maxCap to set
	 */
	public void setMaxCap(Integer maxCap) {
		this.maxCap = maxCap;
	}
    
    
    
}
