package com.mindtree.ferrari.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.ferrari.entity.Gallery;
import com.mindtree.ferrari.entity.RacerDetails;
import com.mindtree.ferrari.service.UpdateDriverService;
import com.mindtree.ferrari.service.UpdatePhotoService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class GalleryUpdate {
	@Autowired
	UpdatePhotoService update;
	
	
	@RequestMapping(value ="/updatePhoto",  method=RequestMethod.POST)
	public  boolean getData(@RequestBody Gallery racer){
	   	//System.out.println("aa gya");
		 return update.updatePhoto(racer);
		   
	}
}
