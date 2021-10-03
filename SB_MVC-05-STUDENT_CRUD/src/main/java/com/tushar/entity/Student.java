package com.tushar.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="T1_STUDENT_DETAILS")
public class Student implements Serializable {

	@Id
	@SequenceGenerator(name = "ENRLOLL_GEN", sequenceName = "ROLL_SEQ1",initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator="ENRLOLL_GEN", strategy =GenerationType.SEQUENCE)
	private Integer ENROLLID;
	
	@NonNull
	private Integer ROLLID;
	
	@NonNull
	private String fname;
	
	@NonNull
	private String mname;
	
	@NonNull
	private String lname;
	
	@NonNull
	private String address1;
	
	@NonNull
	private String address2;
	
	@NonNull
	private String currentStandard;
	
	@NonNull
	private String mobile;

	@NonNull
	private String dob;

	@NonNull
	private String email;

	@NonNull
	private String passwrd;
	
	@NonNull
	private String gender;
	
}

