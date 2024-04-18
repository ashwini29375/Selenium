package Uncodemy;

public class Program14WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<3; i++) {
			System.out.println("Outer loop count: " + i);
			System.out.print(" Inner loop count: ");
			int t = 0; 
			while(t < 25) 
			{
			if(t == 10)
			   break; // terminate loop if t is 10
			System.out.print(t + " ");
			t++;
			}
			System.out.println();
			}
			System.out.println("Loops complete.");

	}

}
