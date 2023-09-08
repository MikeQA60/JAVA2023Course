package week3.Class7point0.Class7point;

import java.util.Scanner;

public class WelcomeMessage {
    public static void main(String[] args) {
        //scammer class, comes from jdk
        //variable



        //input.nextline takes the whole string
        //input.next  only takes a single word string

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String dreamcompany = input.nextLine();
       // String Welcome = input.nextLine();


        //3 inputs
        System.out.println("Please enter your full name: ");
       System.out.println("Please enter your dream company: " + dreamcompany);
        System.out.println("Welcome "+ name + " to " + dreamcompany +"!");


        //String company1 = input.nextLine();


    }
}
