package Uncodemy;

public class Program13TestFor {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
		
		throws java.io.IOException {
			int i;

			System.out.println("Press S to stop.");

			for(i = 0; (char) System.in.read() != 'S'; i++)
				
				System.out.println("Pass #" + i);
			
			
			}

	}


