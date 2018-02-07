package com.mindtree.ferrari.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.ferrari.dao.SocialLoginDao;
import com.mindtree.ferrari.entity.MembersTable;

@Repository
@Transactional
public class SocialLoginDaoImpl implements SocialLoginDao{
	
	@Autowired
	 private SessionFactory sessionFactory;
	 
	 public void setSessionFactory(SessionFactory sf) {
	  this.sessionFactory = sf;
	 }
	
	public boolean checkExistingData(String email)
	 {
		   Session session = this.sessionFactory.getCurrentSession();
		   String hql = "from MembersTable where email= :email";
		   Query query= session.createQuery(hql);
		   query.setParameter("email", email);
		   List obj = query.list();
		   return !(obj.isEmpty());
	 }
	
	public boolean addMember(MembersTable member)
	  {
		   try { 
			   Session session = this.sessionFactory.getCurrentSession();
			   session.persist(member);  
			   return true;
		   }
		   catch(Exception e) {
			   return false;
		   }
	  }

}
