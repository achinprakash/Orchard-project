package com.mindtree.ferrari.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.ferrari.dao.UpdateDriverDao;
import com.mindtree.ferrari.entity.RacerDetails;
import com.mindtree.ferrari.service.UpdateDriverService;
 
@Service
public class UpdateDriverImpl implements UpdateDriverService{

	@Autowired
	UpdateDriverDao updateDriver;
	@Override
	public boolean updateDri(RacerDetails racer) {
		 
		 return updateDriver.updateDriver(racer);
	}

}
