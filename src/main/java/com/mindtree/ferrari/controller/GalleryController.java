package com.mindtree.ferrari.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.mindtree.ferrari.entity.Gallery;
import com.mindtree.ferrari.service.GalleryService;


@EnableWebMvc
@RestController
@CrossOrigin(origins = "*")
public class GalleryController {
	
	@Autowired
	GalleryService galleryService;
	
	@RequestMapping(value = "/photo/{id}", method = RequestMethod.GET)
		public List<Gallery> retrivePhotoById(@PathVariable("id") int id) {
		return galleryService.retrievePhotoById(id);
	}
	
	@RequestMapping(value = "/photo", method = RequestMethod.GET)
		public List<Gallery> retrivePhoto() {
		return  galleryService.retrievePhoto();
		
	}
}