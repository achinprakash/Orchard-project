package com.mindtree.ferrari.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.mindtree.ferrari.entity.Video;
import com.mindtree.ferrari.service.VideoService;


@EnableWebMvc
@RestController
@CrossOrigin(origins = "*")
public class VideoController {
	
	@Autowired
	VideoService videoService;
	
	
	@RequestMapping(value = "/video", method = RequestMethod.GET)
		public List<Video> retrieveVideo() {
		return  videoService.retrieveVideo();
		
	}

}