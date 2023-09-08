package week3.Class7point0.Class7point;

import java.util.Scanner;

/*
Write a program that asks the user for the country and its capital city, then prints out the following message:



Please enter a country name:
Please enter its capital city:
The capital city of X is Y

Where X is the country entered, and Y is its capital city entered.

Note both country and the capital city could be more than 1 word.


 */
public class CountryandCapital {
    public static void main(String[] args) {
        //scammer class, comes from jdk
        //variable
        System.out.println("Please enter a country name: ");
        System.out.println("Please enter its capital city: ");

        Scanner input = new Scanner(System.in);

        //input.next  only takes a single word string
        String countryname = input.nextLine();
        String capitalcity = input.nextLine();



        System.out.println("The capital city of " + countryname + " is " + capitalcity );


    }
}
