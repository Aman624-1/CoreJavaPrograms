package in.aman.BasicPrograms;

import java.util.Scanner;

public class SwapWithout3rdVariable 
{
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of a: ");
		int a = sc.nextInt();
		System.out.println("Enter value of b: ");
		int b = sc.nextInt();
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After swapping:");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		sc.close();
		
	}

}
