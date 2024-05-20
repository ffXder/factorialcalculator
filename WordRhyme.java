import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class WordRhyme {
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first word: ");
        String word1 = input.nextLine();
        System.out.print("Enter second word: ");
        String word2 = input.nextLine();

        //0123
        //glam
        String sub = word1.substring(2,4);

        Pattern pattern = Pattern.compile("[a-zA-Z]{2}" + sub + "");    
        Matcher match = pattern.matcher(word2);

           if (word2.length() == 4){
                if (match.matches()) {
                    System.out.println(word2 + " rhymes with " + word1);
                } else {
                    System.out.println(word2 + " does not rhymes with " + word1);
                }
            } else {
                System.out.println("I'm not sure! Sorry!");
                System.out.println(word2 + " has more than 2 letters before '" + sub + "'");
           }
    }
}