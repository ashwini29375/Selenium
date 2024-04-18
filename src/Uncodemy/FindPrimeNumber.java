package Uncodemy;

import java.util.Scanner;

public class FindPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {8,10,23,34,35,35,34,3,34,87};
		
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		int searchnum=sc.nextInt();
		
		boolean found = false;
		
		for(int i =1;i<=a.length-1;i++)
		{
			if(searchnum==a[i])
			{
				found =true;
				System.out.println("found at "+i);
				break;
			}
		}
		
		if(!found)
		{
			System.out.println(+searchnum+ " Number Not found");
		}
		
	}
}


