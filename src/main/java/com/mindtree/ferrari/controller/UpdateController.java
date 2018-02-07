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
import com.mindtree.ferrari.service.UpdateService;


@RestController
@CrossOrigin(origins="http://localhost:4200")
public class UpdateController {
	
	@Autowired
	UpdateService updateService;
	
	
	@RequestMapping(value ="/getdata",  method=RequestMethod.POST)
	public List<MembersTable> getData(@RequestBody GetId link){
	    System.out.println("linkId");	
		// UpdateService updateService=new UpdateServiceImpl();
		 return updateService.getDetail(link.getEmail());
		 
	}
}
