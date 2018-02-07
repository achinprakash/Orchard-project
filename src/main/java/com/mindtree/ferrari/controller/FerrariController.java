package com.mindtree.ferrari.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import com.mindtree.ferrari.entity.RacerDetails;
import com.mindtree.ferrari.service.FerrariService;

@EnableWebMvc
@RestController
@CrossOrigin(origins = "*")
public class FerrariController {
	
	@Autowired
	FerrariService ferrrariService;
	
	@RequestMapping(value = "/racerdetails/{id}", method = RequestMethod.GET)
		public List<RacerDetails> retriveRacersById(@PathVariable("id") int id) {
		return ferrrariService.retriveRacerDetailsById(id);
	}
	
	@RequestMapping(value = "/racerdetails", method = RequestMethod.GET)
		public List<RacerDetails> retriveAllRacers() {
		return  ferrrariService.retriveRacerDetails();
		
	}
}
