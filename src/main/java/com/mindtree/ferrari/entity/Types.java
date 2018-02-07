package com.mindtree.ferrari.entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY) 
@Entity
@Table(name="types")
public class Types
{  
	@Id
	@Column(name="type_id")	
	private int type_id;
	@Column(name="type_name",nullable=false,length=25)
	private String type_name;
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	 @JoinColumn(name="category_id")
	 private Category c;
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	public String getType_name() {
		return type_name;
	}
	public void setType_name(String type_name) {
		this.type_name = type_name;
	}
	public Category getC() {
		return c;
	}
	public void setC(Category c) {
		this.c = c;
	}
}
