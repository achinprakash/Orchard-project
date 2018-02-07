package com.mindtree.ferrari.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.mindtree.ferrari.dao.LotteryDao;
import com.mindtree.ferrari.service.LotteryInterface;



@Service 
public class LotteryInterfaceImpl implements LotteryInterface 

{
	@Autowired
	LotteryDao ld;

	@Override
	public boolean pickLottery(String lotterydate, int noofwinners)
	{
		
		return ld.pickLottery(lotterydate,noofwinners);
	}

	@Override
	public Long members() 
	{
		
		return ld.members();
	}

	

}
