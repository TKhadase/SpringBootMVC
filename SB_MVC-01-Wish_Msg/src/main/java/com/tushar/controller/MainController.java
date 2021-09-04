package com.tushar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tushar.service.iWishService;

@Controller
public class MainController {
	
	@Autowired
	private iWishService wishService;
	
	@RequestMapping("/")
	public String showHome() {
		return "index";
	}
	
	@GetMapping("/wish")
	public ModelAndView getWishMsg() {
		String result = wishService.getWishMsg();
		return new ModelAndView("wish", "msg", result);
	}

}
