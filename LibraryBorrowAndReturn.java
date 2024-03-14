package Java;
/*The code is implementing a library borrowing and returning system. 
It allows users to borrow books, return books, view the borrowing history, and exit the program. */
import java.time.LocalDate;
import java.util.Scanner;
public class LibraryBorrowAndReturn {
   //declaring variables 
   private static int maxBooks = 20;
   private static int returnDue[] = new int[maxBooks];
   private static boolean availableBooks[] = new boolean[maxBooks];
   //format (book index, title, author, year) this where the books are store in this array
   private static String books[] = 
     	{"To Kill a Mocking Bird, Harper Lee, 1960",
     	 "Clean Code, Robert Cecil Martin, 2008",
     	 "The Pragmatic Programmer, Dave Thomas, 1999",
     	 "Harry Potter and the Sorcerer's Stone, J.K Rowling, 1997",
     	 "The Merchant of Venice, William Shakespeare, 1598",
     	};
   private static String viewHistory[] = new String[maxBooks];
   private static int history = 0;
   
   public static void main (String[]args) {
    
        
		int select;
       
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        
        //The while(true) loop is an infinite loop that keeps the program running until the user chooses to exit the program.
		while(true) {
        displayMenu(); 
        select = sc.nextInt();
       
	    switch (select) {
            case 0:
            	System.out.print("Thank you for using the library! You exit the program successfully!");
            	System.exit(0);
                break;
            case 1:
                borrowBook(in,sc); 	
                break;    
            case 2:
                returnBook(in,sc);
                break;
            case 3:
                displayHistory();
            	break;  
            default:
            	System.out.println("Invalid Choice!");   
        }
     }
}
  //adding new methods and to create a function 
  //display the library menu
public static void displayMenu() {
	System.out.println("============================");
    System.out.println("  Library Borrowing System  ");
    System.out.println("============================");
		System.out.println("Press 0 to exit library");
		System.out.println("Press 1 to borrow a book");
		System.out.println("Press 2 to return a book");
		System.out.println("Press 3 to view history");
	System.out.print("Welcome to Library! Please select: "); 
	}
 //display the available books using for loop to display available books
public static void displayAvailableBooks() {
	System.out.println("---------Available Books---------");
	System.out.println("|Book Index|" + "|Title|" + "|Author|" + "|Year|");
	for (int row = 0; row < books.length; row++ ) {	
			System.out.println((row + 0 )+ ". " + books[row]);
			availableBooks[row] = true;
	}
}

/*The borrowBook method is responsible for handling the process of borrowing a book from the library. 
It takes two `Scanner` objects as parameters (`in` and `sc`) to read user input.*/
public static void borrowBook(Scanner in, Scanner sc) {
	System.out.println("***********Borrow Book***********");
    System.out.println("Enter the following information to borrow a book");
    System.out.println("STUDENT INFORMATION");
    
    System.out.print("Name: ");
    String name = in.nextLine();
    
    System.out.print("Student No: ");
    int studentNo = sc.nextInt();
    
    System.out.println("BOOK INFORMATION");
    displayAvailableBooks();
    System.out.print("Book Index: ");   
    int findBookID = sc.nextInt();
    
    
    if (findBookID >=0 && findBookID <maxBooks) {
    	if (availableBooks[findBookID]) {
    		availableBooks[findBookID] = false;
    		returnDue[findBookID] = 0;
    		
    		System.out.println("You successfully borrowed a book " + books[findBookID]);
    		
    		LocalDate issueDate = LocalDate.now();
            
    		addToHistory(issueDate + " Student No.: " + studentNo + " Name: " + name + " Borrowed book: " + books[findBookID]);
    		
    	} else {
    		System.out.println("This book is not available");
    	}
    } else {
    	System.out.println("Please enter a valid number");
    }
}

/*The returnBook method is responsible for handling the process of returning a book to the library. 
It takes two `Scanner` objects as parameters (`sc` and `in`) to read user input.*/
public static void returnBook(Scanner sc, Scanner in) {
	System.out.println("********Returning Book**********");
    
    System.out.print("Enter the index of the book you want to return: ");
    int findBookIndex = in.nextInt();
    
    if (findBookIndex >=0 && findBookIndex <maxBooks) {
    	if(!availableBooks[findBookIndex]) {
    	   int overdue = returnDue[findBookIndex];
    	   //penalty rate per day 1.25 pesos
    	   double penalty = overdue * 1.25;
    	 
    	   System.out.println("Days overdue: " + overdue);
    	   System.out.println("Penalty: Php" + penalty);
    	
    	   System.out.print("Do you want to proceed? Y/N: " );
    	   String prompt = sc.nextLine().trim();
    	
    		if(prompt.equalsIgnoreCase("y")){
    		   availableBooks[findBookIndex] = true; //book will become available 
    		   returnDue[findBookIndex] = 0;
    		   
    		   System.out.println("You have successfully returned '" + books[findBookIndex]+ "'.");
    		  
    		   LocalDate returnDate = LocalDate.now();
    		   
    		   addToHistory(returnDate + " Returned: " + books[findBookIndex] + "(Penalty: Php" + penalty + ")");
    		   
    		} else {
    		System.out.println("Cancelled! Thank you for using the library!");
    		}
    	} else {
    		System.out.println("This book is not currently borrowed");
    	}
    } else {
    	System.out.println("Invalid book index!");
   }
}

/*The displayHistory() method is responsible for displaying the borrowing history of books. 
It prints the history in a formatted table with columns for the book number, date, title, author, and year.*/
public static void displayHistory() {
	System.out.println("---------History---------");
    //display history of pending books
	System.out.println("|No.|" + "|Date|" + "|Title|" + "|Author|" + "|Year|");
    for (int row = 0; row < history; row++) {
    	System.out.println((row + 1)+ ". " + viewHistory[row]);
    }
    System.out.println(); 
}

/*The addToHistory method is responsible for adding a borrowing or returning record to the borrowing history array. 
It takes a `String` parameter `add`, which represents the record to be added.*/
public static void addToHistory(String add) {
	if (history < maxBooks) {
		viewHistory[history++] = add;
  }
}
}