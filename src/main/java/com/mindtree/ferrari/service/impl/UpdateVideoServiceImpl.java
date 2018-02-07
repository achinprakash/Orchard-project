package com.mindtree.ferrari.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.ferrari.dao.UpdatePhotoDao;
import com.mindtree.ferrari.dao.UpdateVideoDao;
import com.mindtree.ferrari.entity.Gallery;
import com.mindtree.ferrari.entity.Video;
import com.mindtree.ferrari.service.UpdateVideoService;

@Service
public class UpdateVideoServiceImpl implements UpdateVideoService{
	@Autowired
	UpdateVideoDao updateVideo;
	@Override
	public boolean updateVideo(Video racer) {
		// TODO Auto-generated method stub
		return updateVideo.updateVideo(racer);
	}
}
