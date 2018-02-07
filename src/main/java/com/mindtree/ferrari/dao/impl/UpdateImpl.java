package com.mindtree.ferrari.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.mindtree.ferrari.dao.UpdateInterface;
//import com.mindtree.ferrari.dto.GetId;
import com.mindtree.ferrari.entity.MembersTable;
 
@SuppressWarnings("unchecked")
@Transactional
@Repository
public class UpdateImpl implements UpdateInterface{
	
	 @Autowired
	 private SessionFactory sessionFactory;
	 
	 public void setSessionFactory(SessionFactory sf) {
	  this.sessionFactory = sf;
	 }
	
	public List<MembersTable> getDetail(String email){
		Session session = this.sessionFactory.getCurrentSession();
		String hql = "from MembersTable  where email="+"'"+email+"'"; 
		Query query = session.createQuery(hql);
		List<MembersTable> result = query.list();
		return result;
	}
	
	
/*	public boolean updateDetail(GetId link){
		System.out.println(1);
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory(); 
		Session session = sessionFactory.openSession(); 
		session.beginTransaction();

		String hql ="from Members_Table where email="+"'"+link.getEmail()+"'";
		Query query = session.createQuery(hql);
		List<Members_Table> list = query.list();
		Members_Table m= list .get(0);
		m.setCountry(link.getCountry());
		m.setFirstName(link.getFirstName());
		m.setLastName(link.getLastName());
		session.update(m);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		return true;
		
						
		
	}*/
	 
}
