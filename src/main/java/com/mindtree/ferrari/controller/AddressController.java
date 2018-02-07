package com.mindtree.ferrari.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.mindtree.ferrari.entity.Address;
import com.mindtree.ferrari.service.AddressService;


@EnableWebMvc
@RestController
@CrossOrigin(origins = "*")

public class AddressController {
	
	@Autowired
	AddressService addressService;
	

	@RequestMapping(value = "/address", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean addAddress(@RequestBody Address address ) {
		return addressService.addAddress(address);
		
	}

}
