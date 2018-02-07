package com.mindtree.ferrari.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.ferrari.dao.DeletePhotoDao;
import com.mindtree.ferrari.dao.InsertPhotoDao;
import com.mindtree.ferrari.entity.Gallery;
import com.mindtree.ferrari.service.DeletePhotoService;
@Service
public class DeletePhotoServiceImpl implements DeletePhotoService {
	@Autowired
	DeletePhotoDao deletePhoto;
	@Override
	public boolean deletePhoto(int racer) {
		// TODO Auto-generated method stub
		return deletePhoto.deletePhoto(racer);
	}

}
