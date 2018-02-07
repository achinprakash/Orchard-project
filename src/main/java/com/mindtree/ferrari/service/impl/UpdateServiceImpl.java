package com.mindtree.ferrari.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mindtree.ferrari.dao.UpdateInterface;
import com.mindtree.ferrari.entity.MembersTable;
import com.mindtree.ferrari.service.UpdateService;


@Service
public class UpdateServiceImpl implements UpdateService{
	
	@Autowired
	 UpdateInterface updateInterface;

	public List<MembersTable> getDetail(String email) {
		// UpdateInterface updateInterface=new UpdateImpl();
		 	return 	updateInterface.getDetail(email);
		
	}

//	public boolean updateDetail(GetId link) {
//		 UpdateInterface updateInterface=new UpdateImpl();
//			  updateInterface.updateDetail(link);
//		return true;
//	}

	
}
