package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point9WhileLoopWithBoolean;

import java.util.Scanner;

public class DTpt2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double ticketFine = 100.00;

        //true
        System.out.printf("The ticket fine is $%.2f" , ticketFine);
        System.out.println("\nDo you want to double the ticket fine?");


        boolean answer = sc.nextBoolean();

        while (answer) {
            //true
            System.out.printf("The ticket fine is $%.2f", ticketFine * 2);
            ticketFine *= 2;

            //false
            System.out.println("\nDo you want to double the ticket fine?");
            answer = sc.nextBoolean();
        }
    }
}
