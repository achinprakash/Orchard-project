package com.mindtree.ferrari.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY) 
@Entity
@Table(name="gender")
public class Gender 
{
	@Id
	@Column(name="gender_id")	
	private int gender_id;
	@Column(name="gender_name",nullable=false,length=25)
	private String gender_name;
	public int getGender_id() {
		return gender_id;
	}
	public void setGender_id(int gender_id) {
		this.gender_id = gender_id;
	}
	public String getGender_name() {
		return gender_name;
	}
	public void setGender_name(String gender_name) {
		this.gender_name = gender_name;
	}
}
