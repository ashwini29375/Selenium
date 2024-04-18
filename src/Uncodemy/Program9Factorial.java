package Uncodemy;

public class Program9Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int fact = 1;
		// compute the factorial of the numbers through 5 
		for(int i = 1; i <= 5; i++) {
		sum =sum+ i; // i is known throughout the loop
		fact =fact* i;
		}
	    // but, i is not known here.
		System.out.println("Sum is " + sum);//1 2 
		System.out.println("Factorial is " + fact);//1
	}

}
