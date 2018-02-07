package com.mindtree.ferrari.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.ferrari.dto.GetId;
import com.mindtree.ferrari.entity.MembersTable;
import com.mindtree.ferrari.entity.RacerDetails;
import com.mindtree.ferrari.service.UpdateDriverService;
import com.mindtree.ferrari.service.UpdateService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class UpdateDriver {
	
	@Autowired
	UpdateDriverService update;
	
	
	@RequestMapping(value ="/updateDriver",  method=RequestMethod.POST)
	public  boolean getData(@RequestBody RacerDetails racer){
	   	//System.out.println("aa gya");
		 return update.updateDri(racer);
		   
	}
}