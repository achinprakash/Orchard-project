package com.mindtree.ferrari.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.ferrari.dao.UpdatePhotoDao;
import com.mindtree.ferrari.entity.Gallery;
import com.mindtree.ferrari.entity.RacerDetails;
@SuppressWarnings("unchecked")
@Repository
@Transactional
public class UpdatePhotoDaoImpl implements UpdatePhotoDao{
	@Autowired
	SessionFactory sessionFactory;
	
	 public void setSessionFactory(SessionFactory sf) {
		  this.sessionFactory = sf;
		 }
	 
	@Override
	public boolean updatePhoto(Gallery racer) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(racer);
	 	 return true;
	}

}
