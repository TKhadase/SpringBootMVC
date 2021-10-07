package com.tushar.controller;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.tushar.common.StudentFormValidator;
import com.tushar.entity.SearchStudent;
import com.tushar.entity.Student;
import com.tushar.service.iStudenService;

@Controller
public class MyController {

	@Autowired
	private iStudenService service;
	
	@Autowired
	private StudentFormValidator studentFormValidatorObj;
	
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
	public String NewStudentFormSubmission(RedirectAttributes attrs,
																						@ModelAttribute Student student, 
																						BindingResult errors) {
		System.out.println("MyController.NewStudentFormSubmission():"+student);
		
		if("N".equalsIgnoreCase(student.getVflag())) {
		if(studentFormValidatorObj.supports(student.getClass())) {
			studentFormValidatorObj.validate(student, errors);
			if(errors.hasErrors()) {
				return "student_register";
			}
		}
		}
		
		String resultMsg = service.registerStudent(student);
		attrs.addFlashAttribute("resultMsg", resultMsg);
		return "redirect:allStudent";
	}
	
	@GetMapping("/allStudent")
	public String getAllStudentList(Map<String, Object>map,
																@PageableDefault(page = 0, size = 5,sort = "ENROLLID", direction = Direction.ASC) Pageable pageable  ) {
		Page<Student> listStudents = service.getAllStudentsByPage(pageable);
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
	public String updateStudentDetails(RedirectAttributes attrs, 
																			@ModelAttribute Student student,
																			BindingResult errors) {
		
		if("N".equalsIgnoreCase(student.getVflag())) {
		if(studentFormValidatorObj.supports(student.getClass())) {
			studentFormValidatorObj.validate(student, errors);
			
			if(errors.hasErrors()) {
				return "student_register";
			}
		}
		}
		
		String msg= service.updateStudentDetails(student);
		attrs.addFlashAttribute("resultMsg", msg);
		return "redirect:allStudent";
	}
	
	@GetMapping("/removeStudent")
	public String removeStudent(RedirectAttributes attrs, 
																					@RequestParam(name = "eid")Integer enrollId,
																					@ModelAttribute Student student) {
		String msg= service.removeStudentDetails(enrollId);
		attrs.addFlashAttribute("resultMsg", msg);
		return "redirect:allStudent";
	}
	
	@GetMapping("/searchStudent")
	public String searchStudentForm(Map<String, Object>map, 
																	@ModelAttribute("student") SearchStudent student ) {
		return "searchStudent";
	}
	
	@PostMapping("/searchStudent")
	public String searchStudentDetails(Map<String, Object>map, 
																				@ModelAttribute("student") SearchStudent student,
																				@PageableDefault(page = 0, size =100, sort = "ENROLLID", direction = Direction.ASC) Pageable pageable  ) {
		System.out.println("MyController.searchStudentDetails::"+student);
		Iterable<Student> listStudents = service.searchStudentsByDetails(student);
		map.put("listStudents", listStudents);
		return "allStudent";
	}
	
}
