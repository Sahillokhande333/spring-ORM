package com.spring.ormh.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_details")
public class Student {
	@Id
	@Column(name="student_id")
	private int studentId;
	
	@Column(name="student_name")
	private String studentName;
	
	@Column(name="student_city")
	private String studentCity;
	

	public Student(int studentid, String studentName, String studentCity) {
		super();
		this.studentId = studentid;
		this.studentName = studentName;
		this.studentCity = studentCity;
	}
	
	public Student() {
		
	}


	@Override
	public String toString() {
		return "Student [studentid=" + studentId + ", studentName=" + studentName + ", studentCity=" + studentCity
				+ "]";
	}
	

}
