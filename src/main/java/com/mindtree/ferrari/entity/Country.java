package com.mindtree.ferrari.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY) 
@Entity
@Table(name="country")
public class Country implements Serializable
{
 @Id
 @Column(name="country_id",length=3)	
 private int countryid;
 @Column(name="country_name",nullable=false,length=15)
 private String countryname;
public int getCountryid() {
	return countryid;
}
public void setCountryid(int countryid) {
	this.countryid = countryid;
}
public String getCountryname() {
	return countryname;
}
public void setCountryname(String countryname) {
	this.countryname = countryname;
}
 
}
