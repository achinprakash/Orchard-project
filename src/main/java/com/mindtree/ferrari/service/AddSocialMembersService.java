package com.mindtree.ferrari.service;

import java.io.IOException;
import java.security.GeneralSecurityException;

import com.mindtree.ferrari.entity.MembersTable;

public interface AddSocialMembersService {
	
	public boolean checkDuplicacy(MembersTable member);
	public boolean validatingSocialMembers(String idTokenString) throws GeneralSecurityException, IOException;

}
