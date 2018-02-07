package com.mindtree.ferrari.dao;

import java.util.List;

import com.mindtree.ferrari.entity.MembersTable;

public interface UserRegisterationDAO {

	public List<MembersTable> validateUser(MembersTable members);

	public boolean isEmailExisted(MembersTable members);
	
	public boolean addMember(MembersTable member);

}
