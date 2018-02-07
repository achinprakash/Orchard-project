package com.mindtree.ferrari.dao;

import java.util.List;

import com.mindtree.ferrari.entity.Gallery;



public interface GalleryDAO {
	List<Gallery> retrievePhoto();
	List<Gallery> retrievePhotoById(int id);

}
