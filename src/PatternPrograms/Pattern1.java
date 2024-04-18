package PatternPrograms;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int row=5;
		for(int i=1;i<row;i++)
		{
			for(int j=row;j>=1;j--)
			{
				if(i>=j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.println(" ");
				}
				System.out.print(" ");
		          
		}
		
		}

	}

}
