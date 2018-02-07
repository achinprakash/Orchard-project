package com.mindtree.ferrari.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.ferrari.dao.DeleteVideoDao;
import com.mindtree.ferrari.entity.Video;
@SuppressWarnings("unchecked")
@Repository
@Transactional
public class DeleteVideoDaoImpl implements DeleteVideoDao{
	@Autowired
	SessionFactory sessionFactory;
	
	 public void setSessionFactory(SessionFactory sf) {
		  this.sessionFactory = sf;
		 }
	@Override
	public boolean deleteVideo(int racer) {
		Session session = this.sessionFactory.getCurrentSession();
		Video p = (Video) session.load(Video.class, new Integer(racer));
		  if (null != p) {
		   session.delete(p);
		  }
	 	 return true;
	}

}
