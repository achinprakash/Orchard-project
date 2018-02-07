package com.mindtree.ferrari.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mindtree.ferrari.dao.UserRegisterationDAO;
import com.mindtree.ferrari.entity.MembersTable;
import com.mindtree.ferrari.service.UserRegisterationService;



@Service
public class UserRegisterationServiceImp implements UserRegisterationService{
	
	@Autowired
	UserRegisterationDAO userRegisterationDAO;
	
	public boolean addMember(MembersTable member) {
		try{
		return userRegisterationDAO.addMember(member);
		}catch(Exception e){
			return false;
		}
	}

	public List<MembersTable> validateUser(MembersTable members) {
		members.setEmail(members.getEmail().trim());
		return userRegisterationDAO.validateUser(members);
	}

	public boolean isEmailExisted(MembersTable members) {
		members.setEmail(members.getEmail().trim());
		if(userRegisterationDAO.isEmailExisted(members))
			return true;
		else
			return false;
	}

}
