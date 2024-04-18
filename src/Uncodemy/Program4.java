package Uncodemy;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean p, q;
		System.out.println("P\tQ\tPANDQ\tPORQ\tPXORQ\tNOTP");
		p = true; 
		q = true;
		System.out.print(p + "\t" + q +"\t"); // true  true
		System.out.print((p&q) + "\t" + (p|q) + "\t");// TT-True ...TT-True //or at least one true value true
		System.out.println((p^q) + "\t" + (!p));// False - same boolean values ..False-oppositevalue
		p = true; 
		q = false;
		System.out.print(p + "\t" + q +"\t"); 
		System.out.print((p&q) + "\t" + (p|q) + "\t");//False..True
		System.out.println((p^q) + "\t" + (!p)); //True - different boolean value ...False-opposite value
		p = false; 
		q = true;
		System.out.print(p + "\t" + q +"\t"); 
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		p = false;
		q = false;
		System.out.print(p + "\t" + q +"\t"); 
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		
	}

}
