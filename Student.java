package com.sms.model;

public class Student
{
	private int studentId;
	private String studentName;
	private int age;
	private String course;
	private String contact;
	
	public Student(int studentId, String studentName,int age,String course, String contact)
	{
		this.studentId = studentId;
		this.studentName= studentName;
		this.age=age;
		this.course=course;
		this.contact=contact;
	}
	
	public int getstudentId()
	{
		return studentId;
	}
	
	public void setstudentId(int studentId)
	{
		this.studentId=studentId;
	}
	
	public String getstudentName()
	{
		return studentName;
	}
	
	public void setstudentName(String studentName)
	{
		this.studentName=studentName;
	}
	
	public int getage()
	{
		return age;
	}
	
	public void setage(int age)
	{
		this.age=age;
	}
	
	public String getcourse()
	{
		return course;
	}

	public void setcourse(String course)
	{
		this.course=course;
	}
	
	public String getcontact()
	{
		return contact;
	}
	
	public void setcontact(String contact)
	{
		this.contact=contact;
	}
	
}
