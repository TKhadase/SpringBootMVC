package com.tushar.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="FORM_STUDENT_DETAILS")
@SQLDelete(sql = "UPDATE  FORM_STUDENT_DETAILS  SET ISDELETED='Y' WHERE ENROLLID=?")
@Where(clause = "ISDELETED <> 'Y' ")
public class Student implements Serializable {

	@Id
	@SequenceGenerator(name = "ENRLOLL_GEN", sequenceName = "ROLL_SEQ_FORM",initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator="ENRLOLL_GEN", strategy =GenerationType.SEQUENCE)
	private Integer ENROLLID;
	
	private Integer ROLLID;
	
	private String fname;
	
	private String mname;
	
	private String lname;
	
	private String address1;
	
	private String address2;
	
	private String currentStandard;
	
	private String mobile;

	private String dob;

	private String email;

	private String passwrd;
	
	private String gender;
	
	private String ISDELETED="N";
	
	@Transient
	private String vflag="N";

	@Override
	public String toString() {
		return "Student [ENROLLID=" + ENROLLID + ", ROLLID=" + ROLLID + ", fname=" + fname + ", mname=" + mname
				+ ", lname=" + lname + ", address1=" + address1 + ", address2=" + address2 + ", currentStandard="
				+ currentStandard + ", mobile=" + mobile + ", dob=" + dob + ", email=" + email + ", passwrd=" + passwrd
				+ ", gender=" + gender + ", ISDELETED=" + ISDELETED + ", vflag=" + vflag + "]";
	}
	
}

