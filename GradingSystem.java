package Java;

import java.util.Scanner;
public class GradingSystem {
	public static void main (String[]args) {
		
		int grd;
		
		Scanner sc = new Scanner (System.in);
		
		while(true) {
		System.out.print("Enter your Grade: ");
		grd = sc.nextInt();
		
		if (grd >= 97) {
			System.out.println("Passed - With Highest Honors"); 
		} else if (grd >= 95) {
			System.out.println("Passed - With High Honors"); 
		} else if (grd >= 90) {
			System.out.println("Passed - With Honors"); 
		} else if (grd >= 75) {
			System.out.println("Passed"); 
		} else {
		 System.out.println("Failed");
		}
		}
	}
	} 
