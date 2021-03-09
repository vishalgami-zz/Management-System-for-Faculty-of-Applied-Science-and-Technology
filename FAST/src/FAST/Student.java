package FAST;

import java.util.Scanner;
public class Student {
	int studentID;
	String studentName, studentAddress;
	long studentPhoneNo;
	Scanner input = new Scanner(System.in);
	static FAST obj = new FAST();
	
	public void updateDetails()
	{
		System.out.println("Enter student id to update details: ");
		int stdID = input.nextInt();
		for(int i=0;i<obj.students.length;i++)
		{
			if(stdID == obj.students[i].studentID)
			{
				Scanner in = new Scanner(System.in);
				System.out.print("Enter your name: ");
				String newStudentName = in.nextLine();
				obj.students[i].studentName = newStudentName;
				
				System.out.print("Enter your Address: ");
				String newStudentAddress = in.nextLine();
				obj.students[i].studentAddress = newStudentAddress;
				
				System.out.print("Enter your Phone No(123456789): ");
				Long newStudntPhoneNo = in.nextLong();
				obj.students[i].studentPhoneNo = newStudntPhoneNo;
				System.out.println("Data Updated Successfully.");
				menu();
			}
		}
		System.out.println("ID not Found");
		updateDetails();
	}
	
	public static void listCourse()
	{
		System.out.println("Course Code\tCourse Name\t\t\t\tNo. of Sections");
		System.out.println("-----------------------------------------------------------------------");
		for(int i = 0;i<obj.courses.length;i++)
		{
			System.out.printf("%-16s%-40s%s\n",obj.courses[i].courseCode,obj.courses[i].courseName,obj.courses[i].noOfSections);	
		}
		
	}
	
	public void menu() {
		
 		System.out.println("1. View all Courses\r\n"
 				+ "2. Update Student details\r\n"
 				+ "3. Enroll in course\r\n"
 				+ "4. Withdraw from Course ");
 		System.out.print("Enter your choice(1-4): ");
 		int read =  input.nextInt();
 		switch(read)
 		{
 		case 1:
 			listCourse();
 			break;
		case 2:
			updateDetails();
			break;
		case 3:
			
		case 4:
			
			break;
 		}
 		
	}

}
