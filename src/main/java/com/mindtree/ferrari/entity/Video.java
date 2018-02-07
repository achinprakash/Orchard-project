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
@Table(name="video")
public class Video implements Serializable
{
 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
 @Column(name="videoId")
 private int videoId;
 @Column(name="videoUrl",nullable=false,length=150)
 private String videoUrl;
 @Column(name="videoTitle",nullable=false,length=150)
 private String videoTitle;
 public String getVideoTitle() {
	return videoTitle;
}
public void setVideoTitle(String videoTitle) {
	this.videoTitle = videoTitle;
}
@Column(name="videoDescription",nullable=false,length=150)
 private String videoDescription;
public int getVideoId() {
	return videoId;
}
public void setVideoId(int videoId) {
	this.videoId = videoId;
}
public String getVideoUrl() {
	return videoUrl;
}
public void setVideoUrl(String videoUrl) {
	this.videoUrl = videoUrl;
}
public String getVideoDescription() {
	return videoDescription;
}
public void setVideoDescription(String videoDescription) {
	this.videoDescription = videoDescription;
}
 
}