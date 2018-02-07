package com.mindtree.ferrari.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.ferrari.entity.Gallery;
import com.mindtree.ferrari.entity.Video;
import com.mindtree.ferrari.service.UpdatePhotoService;
import com.mindtree.ferrari.service.UpdateVideoService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class VideoUpdate {
	@Autowired
	UpdateVideoService update;
	
	
	@RequestMapping(value ="/updateVideo",  method=RequestMethod.POST)
	public  boolean getData(@RequestBody Video racer){
	   	//System.out.println("aa gya");
		 return update.updateVideo(racer);
		   
	}
}
