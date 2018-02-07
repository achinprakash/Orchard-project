package com.mindtree.ferrari.dao;


import java.util.List;

import com.mindtree.ferrari.entity.GrandPrix;
import com.mindtree.ferrari.entity.PreviousEventDetails;
import com.mindtree.ferrari.entity.UpcomingEvents;

public interface EventDao 
{

	List<UpcomingEvents> display();
	List<GrandPrix> grandprix();
	List<PreviousEventDetails> history(int id);
    int display1();
}
