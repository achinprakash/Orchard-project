package com.mindtree.ferrari.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY) 
@Entity
@Table(name="category")
public class Category 
{
  @Id
  @Column(name="category_id",length=3)	
  private int category_id;
  @Column(name="category_name",nullable=false,length=25)
  private String category_name;
 public int getCategory_id() 
 {
	return category_id;
 }
 public void setCategory_id(int category_id) 
 {
	this.category_id = category_id;
 }
 public String getCategory_name()
 {
	return category_name;
 }
public void setCategory_name(String category_name) 
{
	this.category_name = category_name;
}

}
