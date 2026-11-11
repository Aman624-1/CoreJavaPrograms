package in.aman.BasicPrograms;

import java.util.Scanner;

public class ArmstrongNum 
{
	
	public static void main(String[] args) 
	{
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int count = 0, sum=0, rem=0;
		int temp = num;
		int p = num;
		while(num != 0) {
			count++;
			num = num/10;
		}
		
		while(temp!=0) {
			
			rem = temp%10;
			int n=1;
			
			for(int i=0; i<count; i++) {
				n=n*rem;
			}
			
			sum=sum+n;
			temp = temp/10;
		}
		
		if(sum==p) {
			System.out.println("Given number is armstrong number.");
		}
		else {
			System.out.println("Given number is not a armstrong number");
		}
		
		sc.close();
	}

}
