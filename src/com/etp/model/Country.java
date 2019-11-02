package com.etp.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Country {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int countryId;
	
	String countryName;
	String description;
	
	@OneToMany
	List<State> stateList= new ArrayList<State>();
	
	public Country() {
		super();
	}

	public Country(int countryId, String countryName, String description) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		this.description = description;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<State> getStateList() {
		return stateList;
	}

	public void setStateList(List<State> stateList) {
		this.stateList = stateList;
	}
	
	

}
