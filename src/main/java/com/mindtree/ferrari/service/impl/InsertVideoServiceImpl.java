package com.mindtree.ferrari.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.ferrari.dao.InsertPhotoDao;
import com.mindtree.ferrari.dao.InsertVideoDao;
import com.mindtree.ferrari.entity.Gallery;
import com.mindtree.ferrari.entity.Video;
import com.mindtree.ferrari.service.InsertVideoService;

@Service
public class InsertVideoServiceImpl implements InsertVideoService{
	@Autowired
	InsertVideoDao insertVideo;
	@Override
	public boolean insertVideo(Video racer) {
		return insertVideo.insertVideo(racer);
	}
}
