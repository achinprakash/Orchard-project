package com.mindtree.ferrari.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.ferrari.dao.VideoDAO;
import com.mindtree.ferrari.entity.Video;
import com.mindtree.ferrari.service.VideoService;

@Service
public class VideoServiceImpl implements VideoService {
	
	@Autowired
	VideoDAO videoDao;
	
	public List<Video> retrieveVideo() 
	{
		return videoDao.retrieveVideo();
	}
	
}