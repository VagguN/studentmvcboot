package com.epam.StudentSpringBoot.dao;

import java.util.List;

import com.epam.StudentSpringBoot.model.Student;

public interface StudentDao {
	
	public Student createStudentProfile(Student s);
	
	public Student getStudentById(int sid);
	
	public List<Student> getAllStudents();
	
	public void deleteStudent(int sid);
	
	public void updateStudent(Student s);

}
