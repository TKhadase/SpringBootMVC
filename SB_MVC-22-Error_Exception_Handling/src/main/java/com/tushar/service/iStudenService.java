package com.tushar.service;

import java.util.Optional;
import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.tushar.entity.SearchStudent;
import com.tushar.entity.Student;

public interface iStudenService {

	public Iterable<Student> getAllStudents();
	public Student  getStudentDetails(Integer  enroll_id);
	public String  registerStudent(Student student);
	public String updateStudentDetails(Student student);
	public String removeStudentDetails(Integer enroll_id);
	public Iterable<Student>  searchStudentsByDetails(SearchStudent student);
	public Page<Student> getAllStudentsByPage(Pageable pageable);
	
}
