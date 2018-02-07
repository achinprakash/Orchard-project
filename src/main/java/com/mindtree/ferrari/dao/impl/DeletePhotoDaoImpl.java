package com.mindtree.ferrari.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.ferrari.dao.DeletePhotoDao;
import com.mindtree.ferrari.entity.Gallery;
@SuppressWarnings("unchecked")
@Repository
@Transactional
public class DeletePhotoDaoImpl implements DeletePhotoDao{
	@Autowired
	SessionFactory sessionFactory;
	
	 public void setSessionFactory(SessionFactory sf) {
		  this.sessionFactory = sf;
		 }
	@Override
	public boolean deletePhoto(int racer) {
		Session session = this.sessionFactory.getCurrentSession();
	 	 //session.save(racer);
		Gallery p = (Gallery) session.load(Gallery.class, new Integer(racer));
		  if (null != p) {
		   session.delete(p);
		  }
	 	 return true;
	}

}
