package in.aman.oops.classesAndObjects;

import java.util.Scanner;

public class Calculator {

	int a, b;

	void add() {
		int add = this.a + this.b;
		System.out.println("The Sum: " + add);
	}

	void difference() {
		int diff;
		if (a > b)
			diff = this.a - this.b;
		else
			diff = this.b - this.a;

		System.out.println("The Difference: " + diff);
	}

	void multiply() {
		int multiple = this.a * this.b;
		System.out.println("The Product: " + multiple);
	}

	void divide() {
		float result = 0.0f;
		if (this.b != 0) {
			result = (float) this.a / this.b;
			System.out.println("The Result: " + result);
		} else {
			System.out.println("Cannot divide by zero.");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int choice;

		do {
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Divide");
			System.out.println("5. Exit");

			System.out.println("Enter your choice: ");
			choice = sc.nextInt();

			Calculator cal = new Calculator();

			switch (choice) {

			case 1:
				System.out.println("Enter two numbers: ");
				cal.a = sc.nextInt();
				cal.b = sc.nextInt();
				cal.add();
				break;

			case 2:
				System.out.println("Enter two numbers: ");
				cal.a = sc.nextInt();
				cal.b = sc.nextInt();
				cal.difference();
				break;

			case 3:
				System.out.println("Enter two numbers: ");
				cal.a = sc.nextInt();
				cal.b = sc.nextInt();
				cal.multiply();
				break;

			case 4:
				System.out.println("Enter two numbers: ");
				cal.a = sc.nextInt();
				cal.b = sc.nextInt();
				cal.divide();
				break;

			case 5:
				System.out.println("Thanks for using Calculator.");
				break;

			default:
				System.out.println("Invalid Input.");
				break;
			}
		} while (choice != 5);

		sc.close();
	}

}
