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
@Table(name="grandprix")
public class GrandPrix 
{
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 @Column(name="grandprix_id",length=3)
	 private int grandprixid;
	 @Column(name="grandprix_name",length=25)
	 private String grandprixname ;
	 @Column(name="YearsHeld",length=100)
	 private String yearsHeld;
	 @Column(name="NoOfRaces",length=3)
	 private int noOfRaces;
	 @Column(name="grandprix_image",length=255)
	 private String grandpriximages;
	 
	 @Column(name="grandpriximage",length=255)
	 private String grandpriximage;

	public int getGrandprixid() {
		return grandprixid;
	}

	public void setGrandprixid(int grandprixid) {
		this.grandprixid = grandprixid;
	}

	public String getGrandprixname() {
		return grandprixname;
	}

	public void setGrandprixname(String grandprixname) {
		this.grandprixname = grandprixname;
	}

	public String getYearsHeld() {
		return yearsHeld;
	}

	public void setYearsHeld(String yearsHeld) {
		this.yearsHeld = yearsHeld;
	}

	public int getNoOfRaces() {
		return noOfRaces;
	}

	public void setNoOfRaces(int noOfRaces) {
		this.noOfRaces = noOfRaces;
	}

	public String getGrandpriximages() {
		return grandpriximages;
	}

	public void setGrandpriximages(String grandpriximages) {
		this.grandpriximages = grandpriximages;
	}

	public String getGrandpriximage() {
		return grandpriximage;
	}

	public void setGrandpriximage(String grandpriximage) {
		this.grandpriximage = grandpriximage;
	}
	 
	 
	
}
