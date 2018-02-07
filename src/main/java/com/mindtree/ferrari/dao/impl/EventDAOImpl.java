package com.mindtree.ferrari.dao.impl;

import com.mindtree.ferrari.dao.EventDao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.ferrari.entity.GrandPrix;
import com.mindtree.ferrari.entity.PreviousEventDetails;
import com.mindtree.ferrari.entity.UpcomingEvents;
@SuppressWarnings("unchecked")
@Repository
@Transactional
public class EventDAOImpl implements EventDao {
	

	 @Autowired
	 private SessionFactory sessionFactory;
	 
	 public void setSessionFactory(SessionFactory sf) {
	  this.sessionFactory = sf;
	 }

	public List<UpcomingEvents> display() 
	{
		Session session = this.sessionFactory.getCurrentSession();
		Query query= session.createQuery("from UpcomingEvents");
		return (List<UpcomingEvents>)query.list();
		
	}

	public List<GrandPrix> grandprix()
	{	
		Session session = this.sessionFactory.getCurrentSession();
		Query query= session.createQuery("from GrandPrix");
		return (List<GrandPrix>)query.list();
	}

	@Override
	public List<PreviousEventDetails> history(int id)
	{
		Session session = this.sessionFactory.getCurrentSession();
		String hql="from PreviousEventDetails where grandprix_id=:id";
		Query query= session.createQuery(hql);
		query.setParameter("id", id);
		return (List<PreviousEventDetails>)query.list();
	}

	@Override
	public int display1()
	{
		// TODO Auto-generated method stub
		return 1;
	}





}
