package com.mindtree.ferrari.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.ferrari.dao.InsertDriverDao;
import com.mindtree.ferrari.dao.InsertPhotoDao;
import com.mindtree.ferrari.entity.Gallery;
import com.mindtree.ferrari.service.InsertPhotoService;
@Service
public class InsertPhotoimpl implements InsertPhotoService{
	@Autowired
	InsertPhotoDao insertPhoto;
	@Override
	public boolean insertPhoto(Gallery racer) {
		// TODO Auto-generated method stub
		return insertPhoto.insertPhoto(racer);
	}

}
