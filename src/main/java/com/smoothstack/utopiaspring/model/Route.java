package com.smoothstack.utopiaspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "route")
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    
    @Column(name = "origin_id")
	private String originId;
    
    @Column(name = "destination_id")
	private String destId;

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
	 * @return the originId
	 */
	public String getOriginId() {
		return originId;
	}

	/**
	 * @param originId the originId to set
	 */
	public void setOriginId(String originId) {
		this.originId = originId;
	}

	/**
	 * @return the destId
	 */
	public String getDestId() {
		return destId;
	}

	/**
	 * @param destId the destId to set
	 */
	public void setDestId(String destId) {
		this.destId = destId;
	}

    
}
