package com.mindtree.ferrari.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY) 
@Entity
@Table(name="UpcomingEvents")
public class UpcomingEvents 
{
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 @Column(name="upcomingevent_id",length=3)
	 private int upcomingeventid;
	 @Column(name="date")
	 private Date date ;
	 @Column(name="circuit_name",length=25)
	 private String circuitname;
	 @Column(name="country",length=25)
	 private String country;
	 @OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	 @JoinColumn(name="grandprix_id")
	 private GrandPrix grandprix;
	 @Column(name="lap_distance",length=10)
	 private float lapdistance;
	 @Column(name="total_laps",length=3)
	 private int totallaps;
	 @Column(name="distanceOfOneLap",length=10)
	 private float distanceOfOneLap;
	 @Column(name="NoOfRacers",length=3)
	 private int noOfRacers;
	 @Column(name="Racer1",length=25)
	 private String racer1;
	 @Column(name="Racer2",length=25)
	 private String racer2;
	 @Column(name="eventImage")
	 private String eventImage;
	 @Column(name="eventDescription",columnDefinition="text")
	 private String eventDescription;
	public int getUpcomingeventid() {
		return upcomingeventid;
	}
	public void setUpcomingeventid(int upcomingeventid) {
		this.upcomingeventid = upcomingeventid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCircuitname() {
		return circuitname;
	}
	public void setCircuitname(String circuitname) {
		this.circuitname = circuitname;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public GrandPrix getGrandprix() {
		return grandprix;
	}
	public void setGrandprix(GrandPrix grandprix) {
		this.grandprix = grandprix;
	}
	public float getLapdistance() {
		return lapdistance;
	}
	public void setLapdistance(float lapdistance) {
		this.lapdistance = lapdistance;
	}
	public int getTotallaps() {
		return totallaps;
	}
	public void setTotallaps(int totallaps) {
		this.totallaps = totallaps;
	}
	public float getDistanceOfOneLap() {
		return distanceOfOneLap;
	}
	public void setDistanceOfOneLap(float distanceOfOneLap) {
		this.distanceOfOneLap = distanceOfOneLap;
	}
	public int getNoOfRacers() {
		return noOfRacers;
	}
	public void setNoOfRacers(int noOfRacers) {
		this.noOfRacers = noOfRacers;
	}
	public String getRacer1() {
		return racer1;
	}
	public void setRacer1(String racer1) {
		this.racer1 = racer1;
	}
	public String getRacer2() {
		return racer2;
	}
	public void setRacer2(String racer2) {
		this.racer2 = racer2;
	}
	public String getEventImage() {
		return eventImage;
	}
	public void setEventImage(String eventImage) {
		this.eventImage = eventImage;
	}
	public String getEventDescription() {
		return eventDescription;
	}
	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}
	 
	 
	 
 }
