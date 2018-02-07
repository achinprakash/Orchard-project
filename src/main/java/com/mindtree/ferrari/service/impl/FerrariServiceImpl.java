package com.mindtree.ferrari.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.ferrari.dao.FerrariDAO;
import com.mindtree.ferrari.entity.RacerDetails;
import com.mindtree.ferrari.service.FerrariService;


@Service
public class FerrariServiceImpl implements FerrariService {
	
	@Autowired
	FerrariDAO ferrariDao;
	
	public List<RacerDetails> retriveRacerDetails() 
	{
		return ferrariDao.retriveRacerDetails();
	}
	public List<RacerDetails> retriveRacerDetailsById(int id) 
	{
		return ferrariDao.retriveRacerDetailsById(id);	
	}
}
