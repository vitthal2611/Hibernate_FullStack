package com.etp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class State {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int stateId;
	
	String stateName;
	String description;
	
	public State() {
		super();
	}
	
	
	
	public State(int stateId, String stateName, String description) {
		super();
		this.stateId = stateId;
		this.stateName = stateName;
		this.description = description;
	}



	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
	
}
