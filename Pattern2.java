public class Pattern2
 {
	public static void main(String args[])
	{
		
		for (int i = 0; i < 5; i++)
		{
			for (int j = 5; j > i; j--)
			{
				System.out.print(" ");		
			}
			for (int k = 0;	 k<=i; k++)
			{
				System.out.print("+");
			}
			System.out.println(" ");
		}
		System.out.println("Coded By: Vasu Mittal");
		System.out.println("ERP ID: 0251BCA061");
	}
}

 