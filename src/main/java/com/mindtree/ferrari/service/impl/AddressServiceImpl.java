package com.mindtree.ferrari.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.ferrari.dao.AddressDAO;
import com.mindtree.ferrari.entity.Address;
import com.mindtree.ferrari.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	AddressDAO addressDao;

	@Override
	public boolean addAddress(Address address) {
		try{
		return addressDao.addAddress(address);
		}catch(Exception e){
			return false;
		}
	}

}
