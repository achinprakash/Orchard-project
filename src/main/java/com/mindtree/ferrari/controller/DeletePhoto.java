package com.mindtree.ferrari.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.ferrari.entity.Gallery;
import com.mindtree.ferrari.service.DeletePhotoService;
import com.mindtree.ferrari.service.InsertPhotoService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class DeletePhoto {
	@Autowired
	DeletePhotoService delete;
	@RequestMapping(value ="/deletePhoto/{id}",  method=RequestMethod.DELETE)
	public  boolean getData(@PathVariable("id") int racer){
	   	//System.out.println("aa gya");
		 return delete.deletePhoto(racer);
		   
	}
}
