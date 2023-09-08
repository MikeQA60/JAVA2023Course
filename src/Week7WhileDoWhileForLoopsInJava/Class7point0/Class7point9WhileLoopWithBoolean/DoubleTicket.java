package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point9WhileLoopWithBoolean;

import java.util.Scanner;

public class DoubleTicket {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

      //  boolean answer = scanner.nextBoolean();

        double ticketFine = 100.00;

        System.out.printf("The ticket fine is $%.2f" , ticketFine);
        System.out.println("\nDo you want to double the ticket fine?");


        while(true){
            boolean answer = scanner.nextBoolean();
           ticketFine *=2;
            System.out.printf("The ticket fine is $%.2f",ticketFine);

            System.out.println("\nDo you want to double the ticket fine?");
            answer = scanner.nextBoolean();
        }
    }
}
