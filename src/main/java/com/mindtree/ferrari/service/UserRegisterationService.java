package com.mindtree.ferrari.service;

import java.util.List;

import com.mindtree.ferrari.entity.MembersTable;

public interface UserRegisterationService {
	
	public boolean addMember(MembersTable member);

	public List<MembersTable> validateUser(MembersTable members);

	public boolean isEmailExisted(MembersTable members);

}
