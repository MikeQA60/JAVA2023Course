package week3.Class7point0.Class9point4;

import java.util.Scanner;

public class Videopt2 {
    public static void main(String[] args) {
        //write a program that prints out successfully logged in true
        //if the given username and password
        //match the userName and password saved in our program

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your username");

        //take strings
        String enteredUsername = sc.nextLine();

        System.out.println("Enter your password");

        //save pass

        String enteredPasswrod = sc.nextLine();


        String storedUserName = "hello@wedevx.co";
        String storedPassword = "abc123$$";


        boolean shouldBeLoggedIn = enteredUsername.equals(storedUserName) && enteredPasswrod.equals(storedPassword);
        System.out.println("Should be logged in? " + shouldBeLoggedIn);


    }
}
