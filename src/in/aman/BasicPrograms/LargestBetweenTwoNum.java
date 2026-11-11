package in.aman.BasicPrograms;

import java.util.Scanner;

public class LargestBetweenTwoNum 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Two numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1>num2)
			System.out.println(num1+" is the largest number.");
		else
			System.out.println(num2 +" is the Largest number.");
		
		sc.close();
		
	}
	
}
