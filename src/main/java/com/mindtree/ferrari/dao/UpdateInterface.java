package com.mindtree.ferrari.dao;



import java.util.List;

//import com.mindtree.ferrari.dto.GetId;
import com.mindtree.ferrari.entity.MembersTable;
 

public interface UpdateInterface {
	public List<MembersTable> getDetail(String email);
	//public boolean updateDetail(GetId link);
}
