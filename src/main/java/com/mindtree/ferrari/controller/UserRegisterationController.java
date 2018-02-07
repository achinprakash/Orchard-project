package com.mindtree.ferrari.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


import com.mindtree.ferrari.entity.MembersTable;
import com.mindtree.ferrari.service.UserRegisterationService;


@EnableWebMvc
@RestController
@CrossOrigin(origins = "*")

public class UserRegisterationController {
    @Autowired
	private UserRegisterationService userRegisterationService;
 

	@RequestMapping(value = "/members", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean addMembers(@RequestBody MembersTable members ) {
		return userRegisterationService.addMember(members);
		
	}

	@RequestMapping(value = "/checkemail", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean isEmailExisted(@RequestBody MembersTable members) {
		if (userRegisterationService.isEmailExisted(members)) {
			return true;
		} else {
			return false;
		}
	}
	

	@RequestMapping(value = "/validateuser", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<MembersTable> validateUser(@RequestBody MembersTable members) {
		return userRegisterationService.validateUser(members);
	}
	
	
	
	

}
