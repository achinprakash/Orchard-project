package com.mindtree.ferrari.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.ferrari.dao.DeletePhotoDao;
import com.mindtree.ferrari.dao.DeleteVideoDao;
import com.mindtree.ferrari.service.DeleteVideoService;

@Service
public class DeleteVideoServiceImpl implements DeleteVideoService{
	@Autowired
	DeleteVideoDao deleteVideo;
	@Override
	public boolean deleteVideo(int racer) {
		// TODO Auto-generated method stub
		return deleteVideo.deleteVideo(racer);
	}

}
