package in.aman.BasicPrograms;

import java.util.Scanner;

public class FibonacciSeries 
{

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of terms: ");
		int terms = sc.nextInt();
		
		int a = 0;
		int b = 1;
		int c = a+b;
		System.out.println(a+", "+b);
		
		for(int i=0; i<terms; i++) {
			System.out.println(", "+c);
			a=b;
			b=c;
		}
		
	}
	
}
