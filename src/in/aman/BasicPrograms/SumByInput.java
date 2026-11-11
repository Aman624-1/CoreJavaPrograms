package in.aman.BasicPrograms;

import java.util.Scanner;

public class SumByInput 
{
	
	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		int sum = num1 + num2;
		
		System.out.println("Sum: "+sum);
		
		scanner.close();
		
	}

}
