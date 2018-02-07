package com.mindtree.ferrari.entity;



import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY) 
@Entity
@Table(name="RacerChampionships")
public class RacerChampionships implements Serializable
{
	@Id
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="racer_id",nullable=false)
	private RacerDetails racerdetails;
	@Column(name="YearOfChamiponship",nullable=false,length=25)
	private int yearofchamiponship;
	@Column(name="positionOfPlayer",nullable=false,length=25)
	private int positionofplayer;
	public RacerDetails getRacerDetails() {
		return racerdetails;
	}
	public void setRacerDetails(RacerDetails racerDetails) {
		this.racerdetails = racerDetails;
	}
	public int getYearOfChamiponship() {
		return yearofchamiponship;
	}
	public void setYearOfChamiponship(int yearOfChamiponship) {
		yearofchamiponship = yearOfChamiponship;
	}
	public int getPositionOfPlayer() {
		return positionofplayer;
	}
	public void setPositionOfPlayer(int positionOfPlayer) {
		this.positionofplayer = positionOfPlayer;
	}
	
	
	

}
