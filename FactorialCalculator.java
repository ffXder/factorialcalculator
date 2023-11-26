import java.util.Scanner;
public class FactorialCalculator {
	public static void main (String[]args) {
	
		Scanner f = new Scanner(System.in);
		
		//declaration of variables
		int num;
		int i;
		
		System.out.println("<-------Factorial Calculator------->");
		//while loop
		while (true) {
		System.out.print("Enter a positive integer: ");
		num = f.nextInt();
		
		if (num >= 0) {
			System.out.print(num + "! = ");
			
			//for (variable; condition; changes;)
			for (i = 1; i<= num; i++) {
			System.out.print(i + " x ");	
			//Example: n! = 1x2x3x4x5......			
			}
			int factorial = 1;
			for (int fd = 1; fd <= num; fd++)
			factorial = factorial * fd;
			
	    System.out.println("\nThe factorial of " + num + " is: " + factorial);
		} else {
			System.out.println("Invalid! Program Stopped!!");
			break;
		}
	}
  }
}
