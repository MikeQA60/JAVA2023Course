package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point11WordCounter;

import java.util.Scanner;

public class Video {
    public static void main(String[] args) {
       //write a program that will
       //count the number of registered users
        // the program should ask if twe want to register a new user?

        //if we say yes then the activeUser counter should become 1
        //then we should ask the user if they want to register a new user? again
        // keep repeat the cycel until the user says no
        //after the user says no we should print out total number of activeUsers

        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to register a new user?");

        String answer = sc.nextLine();
        int registeredUser = 0;


        while (answer.equalsIgnoreCase("yes")) {
            registeredUser++; //+1

            System.out.println("Do you want to register a new user?");

            answer = sc.nextLine();

        }

        System.out.println("Number of registered users: " + registeredUser);
    }
}
