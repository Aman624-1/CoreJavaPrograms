package in.aman.oops.classesAndObjects;

import java.util.Scanner;

public class Main 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Student Details");
		System.out.println("2. Employee Details");
		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
			Student std = new Student();
			std.sName = "Aman";
			std.roll_num= 01;
			std.marks = 94.6f;
			
			std.displayInfo();
			break;
			
		case 2:
			Employee emp = new Employee();
			emp.employeeId = 2485;
			emp.employeeName = "Rajvardhan";
			emp.employeeCity = "Jamshedpur";
			emp.salary = 48000.0f;
			
			emp.displayEmpInfo();
		
		}
		sc.close();
		
	}

}
