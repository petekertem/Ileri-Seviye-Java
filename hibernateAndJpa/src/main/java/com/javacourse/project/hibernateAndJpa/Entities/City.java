package com.javacourse.project.hibernateAndJpa.Entities;

import javax.persistence.*;

@Entity
@Table(name="city")
public class City {
	
	@Id
	@Column(name="city_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="city")
	private String name;
	
	@Column(name="country_id")
	private int countryId;
	
	@Column(name="last_update")
	private String lastUpdate;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	
	public City(int id, String name, int countryId, String lastUpdate) {
		super();
		this.id = id;
		this.name = name;
		this.countryId = countryId;
		this.lastUpdate = lastUpdate;
	}
	
	public City() {}
}
