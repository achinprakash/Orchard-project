package com.mindtree.ferrari.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mindtree.ferrari.dao.EventDao;
import com.mindtree.ferrari.entity.GrandPrix;
import com.mindtree.ferrari.entity.PreviousEventDetails;
import com.mindtree.ferrari.entity.UpcomingEvents;
import com.mindtree.ferrari.service.EventInterface;


@Service 
public class EventInterfaceImpl implements EventInterface {
	@Autowired
	EventDao eventDao;

	public List<UpcomingEvents> display() 
	{
		return eventDao.display();
	}

	public List<GrandPrix> grandprix() 
	{
		return eventDao.grandprix();
	}
	
	@Override
	public List<PreviousEventDetails> history(int id) 
	{
		return eventDao.history(id);
	}


	

}
