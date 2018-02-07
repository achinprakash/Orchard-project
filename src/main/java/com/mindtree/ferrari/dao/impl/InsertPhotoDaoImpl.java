package com.mindtree.ferrari.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.ferrari.dao.InsertPhotoDao;
import com.mindtree.ferrari.entity.Gallery;
@SuppressWarnings("unchecked")
@Repository
@Transactional
public class InsertPhotoDaoImpl implements InsertPhotoDao {
	@Autowired
	SessionFactory sessionFactory;
	
	 public void setSessionFactory(SessionFactory sf) {
		  this.sessionFactory = sf;
		 }
	@Override
	public boolean insertPhoto(Gallery racer) {
		Session session = this.sessionFactory.getCurrentSession();
	 	 session.save(racer);
	 	 return true;
	}

}
