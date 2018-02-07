package com.mindtree.ferrari.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.ferrari.dao.GalleryDAO;
import com.mindtree.ferrari.entity.Gallery;

@SuppressWarnings("unchecked")
@Repository
@Transactional

public class GalleryDAOImpl implements GalleryDAO
{
	@Autowired
	SessionFactory sessionFactory;
	
	 public void setSessionFactory(SessionFactory sf) {
		  this.sessionFactory = sf;
		 }
	 
public List<Gallery> retrievePhoto()

	{
	 	Session session = this.sessionFactory.getCurrentSession();
		Query query= session.createQuery("from Gallery");
		return(List<Gallery>)query.list(); 
	}
@Override
public List<Gallery> retrievePhotoById(int id)
	{
	 	Session session = this.sessionFactory.getCurrentSession();
	 	String hql="from Gallery where galleryId=:id";
		Query query= session.createQuery(hql);
		query.setParameter("id", id);
		return (List<Gallery>)query.list();
	}
 
}
	


