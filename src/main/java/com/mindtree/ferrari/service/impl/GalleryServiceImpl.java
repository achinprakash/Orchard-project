package com.mindtree.ferrari.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.ferrari.dao.GalleryDAO;
import com.mindtree.ferrari.entity.Gallery;
import com.mindtree.ferrari.service.GalleryService;

@Service
public class GalleryServiceImpl implements GalleryService {
	
	@Autowired
	GalleryDAO galleryDao;
	
	public List<Gallery> retrievePhoto() 
	{
		return galleryDao.retrievePhoto();
	}
	public List<Gallery> retrievePhotoById(int id) 
	{
		return galleryDao.retrievePhotoById(id);	
	}
}