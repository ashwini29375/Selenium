package Selenium;

public class ReverseStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="Indumathi";
	    String rev="";
	     for(int i=(str.length()-1);i>=0;i--)
	       {
	         rev=rev+str.charAt(i);
	       }
	     System.out.println("Reverse of String " +rev);
	}

}
