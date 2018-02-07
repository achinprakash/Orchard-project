package com.mindtree.ferrari.dao;
import java.util.List;


import com.mindtree.ferrari.entity.RacerDetails;

public interface FerrariDAO {
List<RacerDetails> retriveRacerDetails();
List<RacerDetails> retriveRacerDetailsById(int id);
}
