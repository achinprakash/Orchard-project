package com.mindtree.ferrari.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.ferrari.dao.InsertVideoDao;
import com.mindtree.ferrari.entity.Video;

@SuppressWarnings("unchecked")
@Repository
@Transactional
public class InsertVideoDaoImpl implements InsertVideoDao{
	@Autowired
	SessionFactory sessionFactory;
	
	 public void setSessionFactory(SessionFactory sf) {
		  this.sessionFactory = sf;
		 }
	@Override
	public boolean insertVideo(Video racer) {
		Session session = this.sessionFactory.getCurrentSession();
	 	 session.save(racer);
	 	 return true;
	}

}
