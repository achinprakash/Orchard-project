package com.mindtree.ferrari.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.mindtree.ferrari.dto.LotteryDTO;


import com.mindtree.ferrari.service.LotteryInterface;

@EnableWebMvc
@RestController
@CrossOrigin(origins="*")
public class LotteryController 
{
	@Autowired
	LotteryInterface es;
	
	@RequestMapping(value = "/picklottery", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean lottery(@RequestBody LotteryDTO lotterydto) 
	{
		String lotterydate=" ";
		int noofwinners=0;
		lotterydate= lotterydto.getDate();
		noofwinners=lotterydto.getNoofwinners();
        return es.pickLottery(lotterydate,noofwinners);
}
	@RequestMapping(value="/noofmembers",method=RequestMethod.GET)
	public Long noofmembers()
	{
	
		return es.members();
	}
//	@RequestMapping(value="/email",method=RequestMethod.GET)
//	public boolean email()
//	{
//	
//		return es.email();
//	}
	
	
	
}
