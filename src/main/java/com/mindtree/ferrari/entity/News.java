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
@Table(name="news")
public class News 
{
	@Id
	@Column(name="news_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int newsid;
	@Column(name="heading",length=50)
	private String heading;
	@Column(name="news_content",nullable=false,columnDefinition="text")
	private String newscontent;
	@Column(name="date",nullable=false)
	private Date date;
	public int getNewsid() {
		return newsid;
	}
	public void setNewsid(int newsid) {
		this.newsid = newsid;
	}
	public String getHeading() {
		return heading;
	}
	public void setHeading(String heading) {
		this.heading = heading;
	}
	public String getNewscontent() {
		return newscontent;
	}
	public void setNewscontent(String newscontent) {
		this.newscontent = newscontent;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
