package com.mindtree.ferrari.dao.impl;


import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.ferrari.dao.EmailDAO;
import com.mindtree.ferrari.dao.LotteryDao;

@Repository
@Transactional
public class LotteryDaoImpl implements LotteryDao 
{

	 @Autowired
	 private SessionFactory sessionFactory;
	 
	 public void setSessionFactory(SessionFactory sf)
	 {
		  this.sessionFactory = sf;
		 }
	 
	 
	 private int lastid() 
		{
		 Session session = this.sessionFactory.getCurrentSession();
		 Query query= session.createQuery("select memberId from MembersTable order by memberId desc");
				
			List<Integer> list1 = query.list();
			return(list1.get(0));  
		}
	 
	 private int check(int r) 
		{
			
		 Session session = this.sessionFactory.getCurrentSession();
			Query query=session.createQuery("select winner from MembersTable where memberId="+r+"");
			@SuppressWarnings("unchecked")
			List<Integer> list1 = query.list();
			return(list1.get(0));  
		}
	 
	 private void update(String lotterydate, int r)
		{
			int flag=1;
			Session session = this.sessionFactory.openSession();
	    	String hql = "update MembersTable set lotterydate ='" + lotterydate + "',winner="+flag+"  where memberId ="+r+"";
	    	Query query=session.createQuery(hql);
			query.executeUpdate();
			Query query1=session.createQuery("select email from MembersTable where memberId="+r+"");
			@SuppressWarnings("unchecked")
			List<String> list1 = query1.list();
			Query query2=session.createQuery("select firstName from MembersTable where memberId="+r+"");
			@SuppressWarnings("unchecked")
			List<String> list2 = query2.list();
			EmailDAO ed=new EmailDAOImpl();
			ed.email(list1.get(0),list2.get(0));
			
		}
	 @Override
		public Long members() 
		{
		 Session session = this.sessionFactory.getCurrentSession();
		 Query query=session.createQuery("select count(winner) from MembersTable where winner=0");
		 List<Long> list1 = query.list();
		 return(list1.get(0)); 
		}
	 

	@Override
	public boolean pickLottery(String lotterydate, int noofwinners)
	{
		System.out.println(",ottery date"+lotterydate);
		System.out.println("no of winners"+noofwinners);
		
		int id=lastid();
//		System.out.println("id is last "+id);
		int i=0;
	    int[] numbers = new int[noofwinners]; 
	    while(i!=noofwinners)
	    {
	    	int  r = (int)(Math.random()*id + 1);
	    	 Arrays.sort(numbers);
		     int r2=Arrays.binarySearch(numbers,r);
		     if(r2<0)
	    	System.out.println("r value is "+r);
		     	
		     Long r5=checkID(r);
		     if(r5!=0)
		    {
		     
		    	 int r1=check(r);
		    	 if((r1!=1) && (r>0))
			      {
			    	  update(lotterydate,r);
			    
			    	  i++;
			    	  System.out.println("value of i "+i);
			      }
		    		 }
    
	    }

	    return true;
	}


	private Long checkID(int r) 
	{
		 Session session = this.sessionFactory.getCurrentSession();
			Query query=session.createQuery("select count(*) from MembersTable where memberId="+r+"");
			@SuppressWarnings("unchecked")
			List<Long> list1 = query.list();
			return(list1.get(0));  
	}


	


	
	 
	
	

}
