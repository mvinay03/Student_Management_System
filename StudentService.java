package com.sms.model;


import java.util.*;

public class StudentService 
{
		
	private StudentRepository repository;
	
	public StudentService(StudentRepository repository)
	{
		this.repository = repository;
	}
	
	// Add student with validation
	public boolean addStudent(Student student)
	{
		// Check for duplicate ID
		Student existingStudent = repository.findStudentByID(student.getstudentId());
		if( existingStudent != null)
		{
			return false;
		}
		
		repository.addStudent(student);
		return true;
	}
	
	// VIEW ALL STUDENT DETAILS
	
	public List<Student> getAllStudents()
	{
		return repository.getAllStudents();
	}
	
	// FINDING STUDENT BY ID
	
	public Student getStudentById(int studentId)
	{
		return repository.findStudentByID(studentId);
	}
	
	// UPDATE STUDENT DETAILS 
	
	public boolean updateStudent(Student updateStudent)
	{
		Student existingStudent = repository.findStudentByID(updateStudent.getstudentId());
		
		if(existingStudent == null)
		{
			return false;
		}
		
		existingStudent.setstudentName(updateStudent.getstudentName());
		existingStudent.setage(updateStudent.getage());
		existingStudent.setcourse(updateStudent.getcourse());
		existingStudent.setcontact(updateStudent.getcontact());
		
		return true;
	}
	
	public boolean deleteStudent(int studentId)
	{
		return repository.removeStudentByID(studentId);
	}
}
