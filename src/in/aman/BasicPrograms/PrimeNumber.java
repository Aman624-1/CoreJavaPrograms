package in.aman.BasicPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		boolean isPrime = true;
		
		if(a>1)
		{
			for(int i = 2; i<=a/2; i++)
			{
				if(a%i==0) 
				{
					isPrime=false;
				}
			}
			if(isPrime) {
				System.out.println("Given number is a prime");
			}
			else {
				System.out.println("Given number is not a prime.");
			}
		}
		else 
		{
		System.out.println("Invalid number.");
		}
		
		sc.close();		
		
	}

}
