package in.aman.BasicPrograms;

import java.util.Scanner;

public class PalindromeNumber 
{
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int temp = num, rev=0;
		
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num=num/10;
		}
		if(temp==rev) {
			System.out.println("Given number is palindrom.");
		}
		else {
			System.out.println("Given number is not a palindrom.");
		}
		
		sc.close();
	}

}
