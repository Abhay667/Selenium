
public class NewPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		for(int i=1;i<=n;i++) // it will traverse for number rows(5)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  "); // it will print wide spaces
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+ " ");  //it will print the numbers after the spaces
			}
			
			System.out.println();   // once we print the values in a row it will move to next line
			
			
			
		}
		

	}

}
