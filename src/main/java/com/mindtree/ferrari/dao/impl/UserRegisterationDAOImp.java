package com.mindtree.ferrari.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.mindtree.ferrari.dao.UserRegisterationDAO;
import com.mindtree.ferrari.entity.MembersTable;

@SuppressWarnings("unchecked")
@Repository
@Transactional
public class UserRegisterationDAOImp implements UserRegisterationDAO {
	
	
	 @Autowired
	 private SessionFactory sessionFactory;
	 
	 public void setSessionFactory(SessionFactory sf) {
	  this.sessionFactory = sf;
	 }
	 
	 List<MembersTable> list = new ArrayList<MembersTable>();

	public boolean addMember(MembersTable member) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(member);
		return true;

	}

	
	public boolean isEmailExisted(MembersTable members) {
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery(" from MembersTable where email='" + members.getEmail() + "'" );
		list = (List<MembersTable>) query.list();
		if (list.size()==0)
			return false;
		else
			return true;
	}

	public List<MembersTable> validateUser(MembersTable members) {
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery(" from MembersTable where email='" + members.getEmail() + "' and password='"
				+ members.getPassword() + "'");
		
		list = (List<MembersTable>) query.list();
		if (list.isEmpty()){
			return null;
		}
		else{
			return list;
		}
	}



}
