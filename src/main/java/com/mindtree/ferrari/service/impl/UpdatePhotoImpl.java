package com.mindtree.ferrari.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.ferrari.dao.UpdateDriverDao;
import com.mindtree.ferrari.dao.UpdatePhotoDao;
import com.mindtree.ferrari.entity.Gallery;
import com.mindtree.ferrari.service.UpdatePhotoService;
@Service
public class UpdatePhotoImpl implements UpdatePhotoService {
	@Autowired
	UpdatePhotoDao updatePhoto;
	@Override
	public boolean updatePhoto(Gallery racer) {
		// TODO Auto-generated method stub
		return updatePhoto.updatePhoto(racer);
	}

}
