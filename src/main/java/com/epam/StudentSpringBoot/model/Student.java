package com.epam.StudentSpringBoot.model;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	String name; 
	int rollNo; 
	Course course;
	int yoj;

	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public Course getCourse() {
		return course;
	}
	
	public void setCourse(Course course) {
		this.course = course;
	}
	
	public int getYoj() {
		return yoj;
	}
	
	public void setYoj(int yoj) {
		this.yoj = yoj;
	}

	@Override
	public String toString() {
		return "Student [Name: " + getName() + ", RollNo: " + getRollNo() + ", Course: " + getCourse()
				+ ", Yoj: " + getYoj() + "]";
	}
}
