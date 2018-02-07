package com.mindtree.ferrari.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.ferrari.dao.FerrariDAO;
import com.mindtree.ferrari.entity.RacerDetails;

@SuppressWarnings("unchecked")
@Repository
@Transactional
public class FerrariDAOImpl implements FerrariDAO
{
	@Autowired
	SessionFactory sessionFactory;
	
	 public void setSessionFactory(SessionFactory sf) {
		  this.sessionFactory = sf;
		 }
	 
public List<RacerDetails> retriveRacerDetails()

	{
	 	Session session = this.sessionFactory.getCurrentSession();
		Query query= session.createQuery("from RacerDetails");
		return(List<RacerDetails>)query.list(); 
	}
@Override
public List<RacerDetails> retriveRacerDetailsById(int id)
	{
	 	Session session = this.sessionFactory.getCurrentSession();
	 	String hql="from RacerDetails where racer_id=:id";
		Query query= session.createQuery(hql);
		query.setParameter("id", id);
		return (List<RacerDetails>)query.list();
	}
 
}
