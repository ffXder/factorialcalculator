import java.util.Scanner;

public class runAmountDue {
    public static void main(String[] OOP) {
        Scanner input = new Scanner(System.in);
        AmountDue due = new AmountDue();

        System.out.println("Press any of the following then enter values separated by spaces:");
        System.out.println("1 - Price only");
        System.out.println("2 - Price and quantity");
        System.out.println("3 - Price,  quantity,  and discount amount");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Amount due is " + due.computeAmountDue(input.nextDouble()));
                break;
            case 2:
                System.out.println("Amount due is " + due.computeAmountDue(input.nextDouble(), input.nextInt()));
                break;
            case 3:
                System.out.println(
                        "Amount due is " + due.computeAmountDue(input.nextDouble(), input.nextInt(), input.nextInt()));
                System.out.println("");
                break;
            default:
                System.out.println("Invalid input! please the proper choices!");
        }
    }
}