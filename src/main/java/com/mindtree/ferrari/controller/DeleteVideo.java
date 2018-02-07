package com.mindtree.ferrari.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.ferrari.service.DeletePhotoService;
import com.mindtree.ferrari.service.DeleteVideoService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class DeleteVideo {
	@Autowired
	DeleteVideoService delete;
	@RequestMapping(value ="/deleteVideo/{id}",  method=RequestMethod.DELETE)
	public  boolean getData(@PathVariable("id") int racer){
	   	//System.out.println("aa gya");
		 return delete.deleteVideo(racer);
		   
	}
}
