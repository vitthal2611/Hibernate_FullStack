package com.etp.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TwoWheelerTbl")
public class TwoWheeler extends Vehicle {
	
	public int wheelCount;
	public String steryingType;
	
	public int getWheelCount() {
		return wheelCount;
	}
	public void setWheelCount(int wheelCount) {
		this.wheelCount = wheelCount;
	}
	public String getSteryingType() {
		return steryingType;
	}
	public void setSteryingType(String steryingType) {
		this.steryingType = steryingType;
	}
	
	

}
