package com.sms.model;

import java.util.*;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		StudentRepository repository = new StudentRepository();
		StudentService service = new StudentService(repository);
		
		int choice;
		
		do
		{
			System.out.println("\n.....STUDENT MANAGEMENT SYSTEM");
			System.out.println("1. Add Student");
			System.out.println("2. View All Student Details");
			System.out.println("3. Search Student By ID");
			System.out.println("4. Update Student");
			System.out.println("5. Delete Student");
			System.out.println("6. Exit");
			System.out.println(" Enter Your Choice : ");
			
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter Student Id :");
				int id = sc.nextInt();
				
				sc.nextLine();
				
				System.out.println("Enter Student Name :");
				String name = sc.nextLine();
				
				System.out.println("Enter Student Age :");
				int age = sc.nextInt();
				
				sc.nextLine();
				
				System.out.println("Enter Course :");
				String course = sc.nextLine();
				
				System.out.println("Enter Contact No :");
				String contact = sc.nextLine();
				
				Student student = new Student(id,name,age,course,contact);
				
				boolean added = service.addStudent(student);
				
				if(added)
				{
					System.out.println("Student Data Added Successfully");
				}
				else
				{
					System.out.println("Student Data Already Exists");
				}
				break;
				
			case 2:
				List<Student> students = service.getAllStudents();
				
				if(students.isEmpty())
				{
					System.out.println("No Students Found !");
				}
				else
				{
					for(Student s : students)
					{
						System.out.println(
								s.getstudentId() + " | " +
								s.getstudentName() + " | " +
								s.getage() + " | " +
								s.getcourse() + " | " +
								s.getcontact()
								);
					}
				}
				break;
			case 3:
				System.out.println("Enter Student Id to Search :");
				int searchId = sc.nextInt();
				
				Student foundStd =  service.getStudentById(searchId);
				
				if(foundStd != null)
				{
					System.out.println("Student Found !");
					System.out.println(
							foundStd.getstudentId() + " | " +
							foundStd.getstudentName() + " | " +
							foundStd.getage() + " | " +
							foundStd.getcourse() + " | " +
							foundStd.getcontact()
							);
				}
				else
				{
					System.out.println("Student Did Not Found !");
				}
				
				break;
				
			case 4:
				System.out.println("Enter Student Id to update : ");
				int updateId = sc.nextInt();
				
				sc.nextLine();
				
				System.out.println("Enter New Name : ");
				String newName = sc.nextLine();
				
				System.out.println("Enter New Age : ");
				int newAge = sc.nextInt();
				
				sc.nextLine();
				
				System.out.println("Enter New Course : ");
				String newCourse = sc.nextLine();
				
				System.out.println("Enter New Contact : ");
				String newContact = sc.nextLine();
				
				Student updateStudent = new Student(updateId, newName,newAge, newCourse, newContact);
				
				boolean updated = service.updateStudent(updateStudent);
				
				if(updated)
				{
					System.out.println("Student Updated Successfully");
				}
				else
				{
					System.out.println("Student Not Found !");
				}
				break;
				
			case 5:
				System.out.println("Enter Id to Delete : ");
				int deleteId = sc.nextInt();
				
				boolean deleted = service.deleteStudent(deleteId);
				
				if(deleted)
				{
					System.out.println("Student Data Deleted Successfully !");
				}
				else
				{
					System.out.println("Student Not Found...");
				}
				break;
				
			case 6:
				System.out.println("Exiting Application.....Have a Nice Day");
				break;
				
			default:
				System.out.println("Invalid Choice...Please try Again !");
				
			}
				
		} while(choice != 6);
		
		sc.close();
		
	}

}
