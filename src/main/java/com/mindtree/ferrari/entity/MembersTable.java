package com.mindtree.ferrari.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY) 
@Entity
@Table(name="members")
public class MembersTable {
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 @Column(name="member_id")
	 private int memberId;
	 @Column(name="firstname",length=25)
	 private String firstName;
	 @Column(name="lastname",length=25)
	 private String lastName;
	 @Column(name="dateOfBirth",length=12)
	 private String dateOfBirth;
	 @Column(name="gender",length=15)
	 private String gender;
	 @Column(name="email",nullable=false,unique = true,length=50)
	 private String email;
	 @Column(name="country",length=25)
	 private String country;
	 @Column(name="password",length=25)
	 private String password;
	 @Column(name="age",length=2)
	 private int winner;
	 @Column(name="lotterydate",length=25)
	 private String lotterydate;
	 
	 
	 public String getLotterydate() {
		return lotterydate;
	}
	public void setLotterydate(String lotterydate) {
		this.lotterydate = lotterydate;
	}
	
	
	
	public int getWinner() {
		return winner;
	}
	public void setWinner(int winner) {
		this.winner = winner;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	 

}
