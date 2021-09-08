package com.tushar.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tushar.model.Person;
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
	public String  getWishMsg(Map<String, Object> map) {
		String result = wishService.getWishMsg();
		
		//simple
		map.put("Name", "Tushar");
		map.put("msg", result);
		
		//Model Class
		Person person  = new Person(101, "Tushar1", 25,"Pune1");
		map.put("person", person);
		
		//Arrays  &  Collection
		String[] nickNames = new String[] {"ABCD","PQRS","XYZW"};
		map.put("nickNames", nickNames);
		
		Set<Long> phones = Set.of(1234L, 5678L, 9012L);
		map.put("phones", phones);
		
		Map<String,Object>  idDetails= Map.of(  "Aadhar", 123457421,
																						"PAN",  "J57SHSA",
																						"VoterID", "7842HSAJ");
		map.put("idDetails", idDetails);
		
		List<Person> personList = List.of(new Person(102, "Tushar2", 21,"Pune2"),
																		new Person(103, "Tushar3", 22,"Pune3"),
																		new Person(104, "Tushar4", 23,"Pune4"),
																		new Person(105, "Tushar5", 24,"Pune5")																
																		);
		map.put("personList", personList);
		
		return "wish";
	}

}
