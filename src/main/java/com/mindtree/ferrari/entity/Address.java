package com.mindtree.ferrari.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY) 
@Entity
@Table(name="address")
public class Address 
{
	

    	
    	
	 @Id
	 @Column(name="email",length=50)
	 private String email;
	 
	 
	 @Column(name="address",nullable = false,length=50)
	 private String address;
	 
	 
	 @Column(name="lastName",length=20)
	 private String lastName;
	 
	 
	 @Column(name="firstName",length=20)
	 private String firstName;
	 
	 
	 @Column(name="city",nullable = false,length=25)
	 private String city;
	 @Column(name="state",nullable = false,length=25)
	 private String state;
	 @Column(name="country",nullable = false,length=25)
	 private String country;
	 @Column(name="pincode",nullable = false,length=25)
	 private int pincode;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	 

}
