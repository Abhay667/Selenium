
public class PrintPattern {

	public static void main(String[] args) {
		 int n = 5;
		// TODO Auto-generated method stub
		for (int i = 1; i <= n; i++) { // it will traverse for number rows(5) 
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) { // it will provide the spaces
                System.out.print("  ");
            }
            
            
            for (int j = 1; j <= i; j++) {  //it will print the numbers after the spaces
                System.out.print(j + " ");
            }
            
            System.out.println(); // once we print the values in a row it will move to next line
        }
	}

}
