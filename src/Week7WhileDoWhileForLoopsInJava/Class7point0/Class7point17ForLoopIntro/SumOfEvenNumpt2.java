package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point17ForLoopIntro;

import java.util.Scanner;

public class SumOfEvenNumpt2 {

    public static void main(String[] args) {

        //take a user input
        Scanner sc = new Scanner(System.in);

        //  Read the integer input provided by the user
        System.out.println("Enter a number:");

        // Read the integer input provided by the user
        int num = sc.nextInt();

       // Check if the entered number is non-negative
        if (num >= 0) {

           // itialize a variable to store the sum of positive numbers
            int sum = 0;

            // Loop from 0 to the entered number (inclusive) and add each value to the sum
            for (int i = 0; i <= num; i++) {
                sum += i;
            }
            // Print the sum of all positive numbers from 0 to the entered number (inclusive)
            System.out.printf("The sum of all positive numbers preceding %d inclusively is %d", num, sum);
        } else {

            // If the entered number is negative, print an error message
            System.out.println("Error! Invalid number");
        }
    }
}