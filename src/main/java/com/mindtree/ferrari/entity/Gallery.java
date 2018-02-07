package com.mindtree.ferrari.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY) 
@Entity
@Table(name="gallery")
public class Gallery implements Serializable
{
 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
 @Column(name="galleryId")
 private int galleryId;
 @Column(name="mainPic",nullable=false,length=50)
 private String mainPic;
 @Column(name="subPic1",nullable=true,length=50)
 private String subPic1;
 @Column(name="subPic2",nullable=true,length=50)
 private String subPic2;
 @Column(name="subPic3",nullable=true,length=50)
 private String subPic3;
 @Column(name="description",nullable=true,length=50)
 private String description;
public int getGalleryId() {
	return galleryId;
}
public void setGalleryId(int galleryId) {
	this.galleryId = galleryId;
}
public String getMainPic() {
	return mainPic;
}
public void setMainPic(String mainPic) {
	this.mainPic = mainPic;
}
public String getSubPic1() {
	return subPic1;
}
public void setSubPic1(String subPic1) {
	this.subPic1 = subPic1;
}
public String getSubPic2() {
	return subPic2;
}
public void setSubPic2(String subPic2) {
	this.subPic2 = subPic2;
}
public String getSubPic3() {
	return subPic3;
}
public void setSubPic3(String subPic3) {
	this.subPic3 = subPic3;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

}