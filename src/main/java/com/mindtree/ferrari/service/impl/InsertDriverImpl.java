package com.mindtree.ferrari.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.ferrari.dao.InsertDriverDao;
import com.mindtree.ferrari.dao.UpdateDriverDao;
import com.mindtree.ferrari.entity.RacerDetails;
import com.mindtree.ferrari.service.InsertDriverService;
@Service
public class InsertDriverImpl implements InsertDriverService {
	@Autowired
	InsertDriverDao insertDriver;
	@Override
	public boolean insertDri(RacerDetails racer) {
		// TODO Auto-generated method stub
		return insertDriver.insertDriver(racer);
	}

}
