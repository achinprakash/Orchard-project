package com.mindtree.ferrari.dao.impl;

import java.util.List;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.ferrari.dao.UpdateDriverDao;
import com.mindtree.ferrari.entity.MembersTable;
import com.mindtree.ferrari.entity.RacerDetails;
@SuppressWarnings("unchecked")
@Repository
@Transactional
public class UpdateDriverDaoImpl implements UpdateDriverDao{

	@Autowired
	SessionFactory sessionFactory;
	
	 public void setSessionFactory(SessionFactory sf) {
		  this.sessionFactory = sf;
		 }
	 
//public List<RacerDetails> retriveRacerDetails()
//
//	{
//	 	Session session = this.sessionFactory.getCurrentSession();
//		Query query= session.createQuery("from RacerDetails");
//		return(List<RacerDetails>)query.list(); 
//	}
	@Override
	public boolean updateDriver(RacerDetails racer) {
		//System.out.println(1);
		 //System.out.println(racer.getAge());
		// System.out.println(racer.getRacerid());
		Session session = this.sessionFactory.getCurrentSession();
	 	 session.update(racer);
	 	 return true;
//		 Session session = this.sessionFactory.getCurrentSession();
//			String hql = "from RacerDetails  where racer_id="+"'"+racer.getRacerid()+"'"; 
//			System.out.println(1);
//			Query query = session.createQuery(hql);
//			System.out.println(1);
//			List<RacerDetails> result = query.list();
//			RacerDetails race=result.get(0);
//			System.out.println(race);
//			race.setAge(racer.getAge());
//			session.update(race);
//			 
//			return true;
			
	}

}
