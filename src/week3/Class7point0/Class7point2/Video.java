package week3.Class7point0.Class7point2;

/*
Class 7.2 - Scanner nextDouble()
Learn how to use the nextDouble() method of the Scanner class
in Java to read floating-point input from the user, including how to handle exceptions
and errors, in this comprehensive Scanner Class nextDouble() tutorial.
 */
import java.util.Scanner;

public class Video {
    //     lower case
    public static void main(String[] args) {
       // lowercase        new
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your desired salary?");

        double salary  = scanner.nextDouble();

        System.out.println("your desired salary is " + salary);

        System.out.println("What is the conversion rate from USD to GBP?");

        double usdToGBP = scanner.nextDouble();
        System.out.println("USD to GBP rate: " + usdToGBP);

        System.out.println("What is your years of experience in IT?");

        int yearsOfEx = scanner.nextInt();

        System.out.printf(" I have %d years of experience in Tech", yearsOfEx);

        //combine with string
        System.out.println("Which company do you want to work for?");
        scanner.nextLine();
        String company = scanner.nextLine();
        System.out.println("I want to work for " + company);



    }

}
