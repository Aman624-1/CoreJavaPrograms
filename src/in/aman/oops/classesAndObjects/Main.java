package in.aman.oops.classesAndObjects;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int choice;

		do {
			System.out.println("************Menu***************");
			System.out.println("-------------------------------");
			System.out.println("1. Student Details.");
			System.out.println("2. Employee Details.");
			System.out.println("3. Exit.");
			System.out.println("-------------------------------");
			
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				Student std = new Student();
				std.sName = "Aman";
				std.roll_num = 01;
				std.marks = 94.6f;

				std.displayInfo();
				System.out.println("-------------------------------");
				break;

			case 2:
				Employee emp = new Employee();
				emp.employeeId = 2485;
				emp.employeeName = "Rajvardhan";
				emp.employeeCity = "Jamshedpur";
				emp.salary = 48000.0f;

				emp.displayEmpInfo();
				System.out.println("-------------------------------");
				break;

			case 3:
				System.out.println("Thanks for fetching data.");
				System.out.println("-------------------------------");
				break;

			default:
				System.out.println("Invalid input.");
				System.out.println("-------------------------------");
				break;
				
			}

		} while (choice != 3);

		sc.close();

	}

}
