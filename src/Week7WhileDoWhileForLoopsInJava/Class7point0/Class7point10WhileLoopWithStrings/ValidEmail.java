package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point10WhileLoopWithStrings;

import java.text.ParseException;
import java.util.Scanner;

public class ValidEmail {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String domain = "";

        while(!domain.endsWith("@domain.com")) {
            System.out.println("Enter your email address: ");
            domain = scanner.nextLine().trim();

            if(!domain.endsWith("@domain.com")){
                System.out.println("Invalid input. Please enter a valid email address in the format of username@domain.com.");
            }else {
                System.out.println("Valid input. Thank you!");
            }
        }
    }
}
