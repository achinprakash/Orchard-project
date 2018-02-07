package com.mindtree.ferrari.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.ferrari.dao.VideoDAO;
import com.mindtree.ferrari.entity.Video;


@SuppressWarnings("unchecked")
@Repository
@Transactional

public class VideoDAOImpl implements VideoDAO
{
	@Autowired
	SessionFactory sessionFactory;
	
	 public void setSessionFactory(SessionFactory sf) {
		  this.sessionFactory = sf;
		 }
	 
public List<Video> retrieveVideo()

	{
	 	Session session = this.sessionFactory.getCurrentSession();
		Query query= session.createQuery("from Video");
		return(List<Video>)query.list(); 
	}


}
