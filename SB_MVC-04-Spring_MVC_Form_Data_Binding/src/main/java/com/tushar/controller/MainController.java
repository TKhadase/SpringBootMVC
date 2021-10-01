package com.tushar.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tushar.model.Employee;

@Controller
public class MainController {

	@GetMapping("/")
	public String showHome() {
		return "index";
	}
	
	@GetMapping("/emp_register")
	public String show_emp_register_form(@ModelAttribute("emp") Employee emp) {
		return "emp_register";
	}
	
	@PostMapping("/emp_register")
	public String emp_register_form(Map<String, Object> map, @ModelAttribute("emp") Employee emp) {
		map.put("result", "Employee details saved sucessfully !");
		return "result_emp_register";
	}
	
	
}
