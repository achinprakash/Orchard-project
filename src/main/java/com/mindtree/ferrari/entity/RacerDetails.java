package com.mindtree.ferrari.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY) 
@Entity
@Table(name="racer_details")
public class RacerDetails implements Serializable
{
 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
 @Column(name="racer_id")
 private int racerid;
 @Column(name="racer_name",nullable=false,length=25)
 private String racername;
 @Column(name="age",nullable=false,length=3)
 private int age;
 @Column(name="races",nullable=false,length=3)
 private int races;
 @Column(name="first",nullable=false,length=3)
 private int first;
 @Column(name="second",nullable=false,length=3)
 private int second;
 @Column(name="third",nullable=false,length=3)
 private int third;
 @Column(name="podium",nullable=false,length=3)
 private int podiums;
 @Column(name="poles",nullable=false,length=3)
 private int poles;
 @Column(name="laps",nullable=false,length=3)
 private int laps;
 @Column(name="fastest",nullable=false,length=3)
 private int fastest;
 @Column(name="points",nullable=false,length=4)
 private int points;
 @Column(name="player_image",nullable=false)
 private String playerimage;
 @Column(name="unique_records",nullable=false)
 private String uniquerecords;
 public String getUniquerecords() {
	return uniquerecords;
}
public void setUniquerecords(String uniquerecords) {
	this.uniquerecords = uniquerecords;
}
@Column(name="y2010",nullable=false,length=3)
 private int y2010;
 @Column(name="y2011",nullable=false,length=3)
 private int y2011;
 @Column(name="y2012",nullable=false,length=3)
 private int y2012;
 @Column(name="y2013",nullable=false,length=3)
 private int y2013;
 @Column(name="y2014",nullable=false,length=3)
 private int y2014;
 @Column(name="y2015",nullable=false,length=3)
 private int y2015;
 @Column(name="y2016",nullable=false,length=3)
 private int y2016;
 @Column(name="y2017",nullable=false,length=3)
 private int y2017;
 
 
 
 
 public int getY2010() {
	return y2010;
}
public void setY2010(int y2010) {
	this.y2010 = y2010;
}
public int getY2011() {
	return y2011;
}
public void setY2011(int y2011) {
	this.y2011 = y2011;
}
public int getY2012() {
	return y2012;
}
public void setY2012(int y2012) {
	this.y2012 = y2012;
}
public int getY2013() {
	return y2013;
}
public void setY2013(int y2013) {
	this.y2013 = y2013;
}
public int getY2014() {
	return y2014;
}
public void setY2014(int y2014) {
	this.y2014 = y2014;
}
public int getY2015() {
	return y2015;
}
public void setY2015(int y2015) {
	this.y2015 = y2015;
}
public int getY2016() {
	return y2016;
}
public void setY2016(int y2016) {
	this.y2016 = y2016;
}
public int getY2017() {
	return y2017;
}
public void setY2017(int y2017) {
	this.y2017 = y2017;
}
@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
 @JoinColumn(name="country_id")
 private Country c;
 @Column(name="placeOfBirth",nullable=false)
 private String placeOfBirth;
 @Column(name="dateOfBirth")
 private Date dateOfBirth;
 @Column(name="racer_image",nullable=false)
 private String racerimage;
 public String getRacerimage() {
	return racerimage;
}
public void setRacerimage(String racerimage) {
	this.racerimage = racerimage;
}
public int getRacerid() {
	return racerid;
}
public void setRacerid(int racerid) {
	this.racerid = racerid;
}
public String getRacername() {
	return racername;
}
public void setRacername(String racername) {
	this.racername = racername;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getRaces() {
	return races;
}
public void setRaces(int races) {
	this.races = races;
}
public int getFirst() {
	return first;
}
public void setFirst(int first) {
	this.first = first;
}
public int getSecond() {
	return second;
}
public void setSecond(int second) {
	this.second = second;
}
public int getThird() {
	return third;
}
public void setThird(int third) {
	this.third = third;
}
public int getPodiums() {
	return podiums;
}
public void setPodiums(int podiums) {
	this.podiums = podiums;
}
public int getPoles() {
	return poles;
}
public void setPoles(int poles) {
	this.poles = poles;
}
public int getLaps() {
	return laps;
}
public void setLaps(int laps) {
	this.laps = laps;
}
public int getFastest() {
	return fastest;
}
public void setFastest(int fastest) {
	this.fastest = fastest;
}
public int getPoints() {
	return points;
}
public void setPoints(int points) {
	this.points = points;
}
public String getPlayerimage() {
	return playerimage;
}
public void setPlayerimage(String playerimage) {
	this.playerimage = playerimage;
}
public Country getC() {
	return c;
}
public void setC(Country c) {
	this.c = c;
}
public String getPlaceOfBirth() {
	return placeOfBirth;
}
public void setPlaceOfBirth(String placeOfBirth) {
	this.placeOfBirth = placeOfBirth;
}
public Date getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
 
 

}
