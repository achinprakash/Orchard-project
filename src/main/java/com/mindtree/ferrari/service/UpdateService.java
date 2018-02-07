package com.mindtree.ferrari.service;

import java.util.List;

//import com.mindtree.ferrari.dto.GetId;
import com.mindtree.ferrari.entity.MembersTable;

public interface UpdateService {
	public List<MembersTable> getDetail(String email);
	//public boolean updateDetail(GetId link);
}
