package com.etp.model;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "Table420")
public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int userId;

	public String userName;

	public String mobileNumber;

	public Date birthDate;

	@ElementCollection
	public Set<Address> adr = new HashSet<>();

	public transient String password;

	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMobileNumber() {
		return "mr " + mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Column(name = "dob")
	@Temporal(TemporalType.DATE)
	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	

	public Collection<Address> getAdr() {
		return adr;
	}

	public void setAdr(Set<Address> adr) {
		this.adr = adr;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", userName=" + userName + ", mobileNumber=" + mobileNumber
				+ ", birthDate=" + birthDate + "]";
	}

}
