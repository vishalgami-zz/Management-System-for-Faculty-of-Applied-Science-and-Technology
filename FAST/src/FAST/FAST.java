package FAST;

import java.util.Scanner;

public class FAST {

	static Student students[] = new Student[2];
	static Course courses[] = new Course[2];
	static Instructor instructors[] = new Instructor[2];
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		students[0] = new Student();
		students[0].studentName = "Vishal Gami";students[0].studentID = 1;students[0].studentPhoneNo = 942931961;students[0].studentAddress = "Rajkot";
		
		students[1] = new Student();
		students[1].studentName = "Harshitsinh";students[1].studentID = 2;students[1].studentPhoneNo = 454544544;students[1].studentAddress = "Baroda";
		
		courses[0] = new Course();
		courses[0].courseCode = "ITC-5102";courses[0].courseName = "Java Programming";courses[0].noOfSections = 2;
		
		courses[1] = new Course();
		courses[1].courseCode = "ITC-5105";courses[1].courseName = "Requirement Analysis and Modelling";courses[1].noOfSections = 1;
		
		System.out.println("----------------FAST System ------------------");
		System.out.println(" 1. Student Menu");
		System.out.println(" 2. Course Menu");
		System.out.println(" 3. Instructor Menu");
		System.out.println("Enter your choice(1-3): ");
		int choice = input.nextInt();
		
		switch(choice)
		{
		case 1:
			Student studentObj = new Student();
			studentObj.menu();
			break;
		case 2:
			Course courseObj = new Course();
			courseObj.menu();
			break;
		case 3:
			Instructor instructorObj = new Instructor();
			instructorObj.menu();
			break;
		}
		
	}

}
