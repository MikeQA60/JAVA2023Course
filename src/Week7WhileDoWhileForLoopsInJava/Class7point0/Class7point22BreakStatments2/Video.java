package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point22BreakStatments2;

import java.util.Scanner;

public class Video {

    //write a program that takes an integer input from a user
    //and validates if the input is a positive number or not
    //if its not then users should get "invalid input message"
    //and should be prompt to enter a number again

    //if the user enter a positive number we should print that number and stop the program


    public static void main(String[] args) {

        //take user
        Scanner sc = new Scanner(System.in);

        //  System.out.println("Please enter a number");


        //   int num = sc.nextInt();
        //less than 0 and neg number
//        while(num  < 0 ) {
//            System.out.println("invalid input"); // invalid
//
//            int num = sc.nextInt(); //-1


        int num = 0;

        do {

//            System.out.println("invalid input"); // invalid

            System.out.println("Please enter a number");
            num = sc.nextInt(); //2

            if (num < 0) {
                System.out.println("Invalid number, please try again");

            }
        }while (num < 0) ;

            //printing num of while loop
            System.out.println(num);

    }
    }

