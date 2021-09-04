package com.tushar.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service("wishService")
public class WishServiceImpl implements iWishService {

	@Override
	public String getWishMsg() {
		String msg="";
		LocalDateTime ldt = LocalDateTime.now();
		int hours =ldt.getHour();
		if(hours<12) {
			msg ="Good Morning";
		}
		else if(hours<16) {
			msg ="Good AfterNoon";
		}
		else if(hours<20) {
			msg ="Good Evening";
		}
		else  {
			msg ="Good Night";
		}
		return msg;
	}

}
