package com.mindtree.ferrari.entity;



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
@Table(name="PreviousEventDetails")
public class PreviousEventDetails 
{
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 @Column(name="previousevent_id",length=3)
	 private int previouseventid;
	 @Column(name="circuit", length=25)
	 private String ciruit ;
	 @Column(name="year", length=5)
	 private String year ;
	 @Column(name="winner1",length=25)
	 private String winner1;
	 @Column(name="winner2",length=25)
	 private String winner2;
	 @Column(name="winner3",length=25)
	 private String winner3;
	 @Column(name="team1",length=25)
	 private String team1;
	 @Column(name="team2",length=25)
	 private String team2;
	 @Column(name="team3",length=25)
	 private String team3;
     @ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	 @JoinColumn(name="grandprix_id",nullable=false)
	 private GrandPrix grandprix;
	public int getPreviouseventid() {
		return previouseventid;
	}
	public void setPreviouseventid(int previouseventid) {
		this.previouseventid = previouseventid;
	}
	public String getCiruit() {
		return ciruit;
	}
	public void setCiruit(String ciruit) {
		this.ciruit = ciruit;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getWinner1() {
		return winner1;
	}
	public void setWinner1(String winner1) {
		this.winner1 = winner1;
	}
	public String getWinner2() {
		return winner2;
	}
	public void setWinner2(String winner2) {
		this.winner2 = winner2;
	}
	public String getWinner3() {
		return winner3;
	}
	public void setWinner3(String winner3) {
		this.winner3 = winner3;
	}
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	public String getTeam3() {
		return team3;
	}
	public void setTeam3(String team3) {
		this.team3 = team3;
	}
	public GrandPrix getGrandprix() {
		return grandprix;
	}
	public void setGrandprix(GrandPrix grandprix) {
		this.grandprix = grandprix;
	}
     
	
	 
	
	 
}
