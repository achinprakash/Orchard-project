package com.mindtree.ferrari.service;

import java.util.List;

import com.mindtree.ferrari.entity.Gallery;


public interface GalleryService {
	List<Gallery> retrievePhoto();
	List<Gallery> retrievePhotoById(int id);
}
