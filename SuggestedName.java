import java.util.Scanner;
public class SuggestedName {
	public static void main (String[]args) {
		
		String name1, name2, name3;
		int num;
		
		Scanner sc = new Scanner (System.in);
		
		//it allows user to input three names
		System.out.println("Enter three first names: ");
		name1 = sc.nextLine();
		name2 = sc.nextLine();
		name3 = sc.nextLine();
		
		System.out.println("Possible names are: ");
		System.out.println("1 - "+ name1 + " " + name2);
		System.out.println("2 - "+ name1 + " " + name3);
		System.out.println("3 - "+ name2 + " " + name1);
		System.out.println("4 - "+ name2 + " " + name3);
		System.out.println("5 - "+ name3 + " " + name1);
		System.out.println("6 - "+ name3 + " " + name2);
		
		System.out.print("Enter 1-6 to select a name: ");
		num = sc.nextInt();
		
		//if the user enter a number within 1-6 it will display the given result
		// Using a string method charAt() to find the first character
		switch(num) {
		case 1:
			System.out.println("The initial for " + name1 + " " + name2 + " is: " + name1.charAt(0) + name2.charAt(0));
			System.out.print("Suggested username: " + name1.toLowerCase() + "_" + name2.toLowerCase());
			break;
			
		case 2:
			System.out.println("The initial for " + name1 + " " + name3 + " is: " + name1.charAt(0) + name3.charAt(0));
			System.out.print("Suggested username: " + name1.toLowerCase() + "_" + name3.toLowerCase());
			break;
			
		case 3:
			System.out.println("The initial for " + name2 + " " + name1 + " is: " + name2.charAt(0) + name1.charAt(0));
			System.out.print("Suggested username: " + name2.toLowerCase() + "_" + name1.toLowerCase());
			break;
		
		case 4:
			System.out.println("The initial for " + name2 + " " + name3 + " is: " + name2.charAt(0) + name3.charAt(0));
			System.out.print("Suggested username: " + name2.toLowerCase() + "_" + name3.toLowerCase());
			break;
		
		case 5:
			System.out.println("The initial for " + name3 + " " + name1 + " is: " + name3.charAt(0) + name1.charAt(0));
			System.out.print("Suggested username: " + name3.toLowerCase() + "_" + name1.toLowerCase());
			break;
		
		case 6:
			System.out.println("The initial for " + name3 + " " + name1 + " is: " + name3.charAt(0) + name1.charAt(0));
			System.out.print("Suggested username: " + name3.toLowerCase() + "_" + name1.toLowerCase());
			break;
			
		default:
			System.out.print("That's not in the choices! Program Stopped!");
		}
	}
}
