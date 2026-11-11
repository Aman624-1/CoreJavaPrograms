package in.aman.BasicPrograms;

import java.util.Scanner;

public class Calculator 
{
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Addition");
		System.out.println("2. subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		
		System.out.println("Enter your operation: ");
		int choice = sc.nextInt();
		
		System.out.println("Enter Two numbers:  ");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		
		switch(choice) 
		{
		
			case 1:
				System.out.println("Sum = "+(a+b));
				break;
				
			case 2:
				if(a>b) {
					System.out.println("Diffrence = "+(a-b));
				}
				else {
					System.out.println("Difference = "+(b-a));
				}
				break;
				
			case 3:
				System.out.println("Product = "+(a*b));
				break;
				
			case 4:
				System.out.println("Divide = "+(a/b));
				break;
				
				default:
					System.out.println("Invalid input.");
					break;
				
			
		}
		
	}

}
