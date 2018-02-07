package com.mindtree.ferrari.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.ferrari.dao.AddressDAO;
import com.mindtree.ferrari.entity.Address;


@Repository
@Transactional
public class AddressDAOImpl implements AddressDAO {
	
	 @Autowired
	 private SessionFactory sessionFactory;
	 
	 public void setSessionFactory(SessionFactory sf) {
	  this.sessionFactory = sf;
	 }
	 

	@Override
	public boolean addAddress(Address address) {
		Session session = this.sessionFactory.getCurrentSession();
		try{
		session.saveOrUpdate(address);
		return true;
		}catch(Exception e){
			return false;
		}
	}

}
