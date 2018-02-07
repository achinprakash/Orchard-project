package com.mindtree.ferrari.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import com.mindtree.ferrari.entity.GrandPrix;
import com.mindtree.ferrari.entity.PreviousEventDetails;
import com.mindtree.ferrari.entity.UpcomingEvents;
import com.mindtree.ferrari.service.EventInterface;

@EnableWebMvc
@RestController
@CrossOrigin(origins="*")
public class EventController {
	
	@Autowired
	EventInterface es;
	
	@RequestMapping(value="/events",method=RequestMethod.GET)
	public List<UpcomingEvents> displayevents()
	{
		
		return es.display();
	}
	
	
	@RequestMapping(value="/grandprix",method=RequestMethod.GET)
	public List<GrandPrix> displaygrandprix()
	{
		return es.grandprix();
    }
	
	@RequestMapping(value="/history/{id}",method=RequestMethod.GET)
	public List<PreviousEventDetails> displayhistory(@PathVariable("id") int id)
	{
		return es.history(id);
		
    }

}
