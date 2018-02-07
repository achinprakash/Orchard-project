package com.mindtree.ferrari.entity;



import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@Entity
@Table(name="Image")
public class Image
{    
	 @Id
	 @Column(name="image_id")
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private int imageid;
	 @Column(name="image_name")
	 private String imagename;
	 @Column(name="image_url",nullable=false)
	 private String imageUrl;
	 @Column(name="image_description",nullable=false)
	 private String imagedescription;
	 @Column(name="date",nullable=false)
	 private Date date;
	public int getImageid() {
		return imageid;
	}
	public void setImageid(int imageid) {
		this.imageid = imageid;
	}
	public String getImagename() {
		return imagename;
	}
	public void setImagename(String imagename) {
		this.imagename = imagename;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getImagedescription() {
		return imagedescription;
	}
	public void setImagedescription(String imagedescription) {
		this.imagedescription = imagedescription;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	 
	
	 

}
