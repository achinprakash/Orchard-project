package com.mindtree.ferrari.service;

import java.util.List;

import com.mindtree.ferrari.entity.RacerDetails;

public interface FerrariService {
	List<RacerDetails> retriveRacerDetails();
	List<RacerDetails> retriveRacerDetailsById(int id);
}
