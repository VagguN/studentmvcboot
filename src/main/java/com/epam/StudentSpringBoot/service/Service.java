package com.epam.StudentSpringBoot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.epam.StudentSpringBoot.dao.StudentDao;
import com.epam.StudentSpringBoot.model.Student;

@Component
public class Service implements StudentDao
{
	List<Student> students;
	public Service() {
		students = new ArrayList<Student>();
	}
	public Student createStudentProfile(Student student) {
		// TODO Auto-generated method stub
		students.add(student);
		return student;
	}

	public Student getStudentById(int sid) {
		// TODO Auto-generated method stub
		return students.stream()
				.filter(s -> s.getRollNo() == sid)
				.findAny()
				.orElse(null);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return students;
	}

	@Override
	public void deleteStudent(int sid) {
		// TODO Auto-generated method stub
		students.removeIf(s -> s.getRollNo() == sid);
		//System.out.println("Student with Roll Number " + sid + " is removed succesfully");
	}

	public void updateStudent(Student stu) {
		// TODO Auto-generated method stub
		Student existingStudent = students.stream()
				.filter(s -> s.getRollNo() == stu.getRollNo())
				.toList()
				.get(0);
		
		existingStudent.setName(stu.getName());
		existingStudent.setCourse(stu.getCourse());
		existingStudent.setYoj(stu.getYoj());
		System.out.println("Student with Roll Number " + stu.getRollNo() + " is updated succesfully");

	}	
}