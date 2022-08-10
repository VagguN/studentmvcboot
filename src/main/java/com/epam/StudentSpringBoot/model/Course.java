package com.epam.StudentSpringBoot.model;

import org.springframework.stereotype.Component;

@Component
public class Course {
	String coursename;
	int courseid;

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	@Override
	public String toString() {
		return "Course [Coursename: " + getCoursename() + ", Courseid: " + getCourseid() + "]";
	}
}

