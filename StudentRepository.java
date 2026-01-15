package com.sms.model;

import java.util.*;

public class StudentRepository
{
	private List<Student> students = new ArrayList<>();
	
	// ADDING NEW STUDENT DETAILS
	public void addStudent(Student std)
	{
		students.add(std);
	}
	
	// TO VIEW ALL STUDENT DETAILS 
	public List<Student> getAllStudents()
	{
		return students;
	}
	
	// FINDING A STUDENT BY ID
	
	public Student findStudentByID(int studentId)
	{
		for(Student student : students)
		{
			if(student.getstudentId()== studentId)
			{
				return student;
			}
		}
		return null;
	}
	
	public boolean removeStudentByID(int studentId)
	{
		Student student = findStudentByID(studentId);
		if(student != null)
		{
			students.remove(student);
			return true;
		}
		return false;
		
	}
	
}
