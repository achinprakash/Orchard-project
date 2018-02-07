package com.mindtree.ferrari.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.mindtree.ferrari.service.EmailService;
import com.mindtree.ferrari.service.impl.EmailInterfaceImpl;


@EnableWebMvc
@RestController
@CrossOrigin(origins="*")
public class EmailController 
{
//	
//	EmailService es=new EmailInterfaceImpl();
//	
//	@RequestMapping(value="/email",method=RequestMethod.GET)
//	public boolean email()
//	{
//	
//		return es.email();
//		
//	}
	

}
