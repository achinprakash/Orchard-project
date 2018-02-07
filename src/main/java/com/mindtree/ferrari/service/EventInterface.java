package com.mindtree.ferrari.service;


import java.util.List;

import com.mindtree.ferrari.entity.GrandPrix;
import com.mindtree.ferrari.entity.PreviousEventDetails;
import com.mindtree.ferrari.entity.UpcomingEvents;



public interface EventInterface {
	List<UpcomingEvents> display();
	List<GrandPrix> grandprix();
	List<PreviousEventDetails> history(int id);
	
}
