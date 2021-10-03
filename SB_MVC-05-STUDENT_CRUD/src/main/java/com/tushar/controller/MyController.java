package com.tushar.controller;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tushar.entity.SearchStudent;
import com.tushar.entity.Student;
import com.tushar.service.iStudenService;

@Controller
public class MyController {

	@Autowired
	private iStudenService service;
	
	@GetMapping("/home")
	public String showUserHomeSession() {
		return "home";
	}
	
	@PostMapping("/home")
	public String showUserHome() {
		return "home";
	}
	
	@GetMapping("/register")
	public String showSignUp() {
		return "signup";
	}
	
	@GetMapping({"/", "/Index"})
	public String showLoginHome() {
		return "Index";
	}
	
	@GetMapping("/header")
	public String showheader() {
		return "header";
	}
	
	@GetMapping("/footer")
	public String showfooter() {
		return "footer";
	}
	
	@GetMapping("/addStudent")
	public String NewStudentForm(Map<String, Object>map, @ModelAttribute Student student) {
		return "student_register";
	}
	
	@PostMapping("/addStudent")
	public String NewStudentFormSubmission(Map<String, Object>map,@ModelAttribute Student student) {
		System.out.println("MyController.NewStudentFormSubmission():"+student);
		String resultMsg = service.registerStudent(student);
		Iterable<Student> listStudents = service.getAllStudents();
		map.put("resultMsg", resultMsg);
		map.put("listStudents", listStudents);
		return "allStudent";
	}
	
	@GetMapping("/allStudent")
	public String getAllStudentList(Map<String, Object>map) {
		Iterable<Student> listStudents = service.getAllStudents();
		map.put("listStudents", listStudents);
		return "allStudent";
	}
	
	@GetMapping("/updateStudent")
	public String updateStudentDetailsForm(Map<String, Object>map, 
																					@RequestParam(name = "eid")Integer enrollId,
																					@ModelAttribute Student student) {
		Optional<Student>  studentDetails= service.getStudentDetails(enrollId);
		System.out.println("MyController.updateStudentDetailsForm():"+studentDetails.get());
		BeanUtils.copyProperties(studentDetails.get(), student);
		map.put("student", student);
		return "student_register";
	}
	
	@PostMapping("/updateStudent")
	public String updateStudentDetails(Map<String, Object>map, 
																			@ModelAttribute Student student) {
		String msg= service.updateStudentDetails(student);
		Iterable<Student> listStudents = service.getAllStudents();
		map.put("resultMsg", msg);
		map.put("listStudents", listStudents);
		return "allStudent";
	}
	
	@GetMapping("/removeStudent")
	public String removeStudent(Map<String, Object>map, 
																					@RequestParam(name = "eid")Integer enrollId,
																					@ModelAttribute Student student) {
		String msg= service.removeStudentDetails(enrollId);
		Iterable<Student> listStudents = service.getAllStudents();
		map.put("resultMsg", msg);
		map.put("listStudents", listStudents);
		return "allStudent";
	}
	
	@GetMapping("/searchStudent")
	public String searchStudentForm(Map<String, Object>map, 
																	@ModelAttribute("student") SearchStudent student ) {
		return "searchStudent";
	}
	
	@PostMapping("/searchStudent")
	public String searchStudentDetails(Map<String, Object>map, 
																				@ModelAttribute("student") SearchStudent student) {
		System.out.println("MyController.searchStudentDetails::"+student);
		Iterable<Student> listStudents = service.searchStudentsByDetails(student);
		map.put("listStudents", listStudents);
		return "allStudent";
	}
	
}
