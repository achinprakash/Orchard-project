package com.mindtree.ferrari.dao;

import com.mindtree.ferrari.entity.MembersTable;

public interface SocialLoginDao {
	
	public boolean checkExistingData(String email);
	public boolean addMember(MembersTable member);

}
