package week3.Class7point0.Class7point;

import java.util.Scanner;

/*
Write a program that asks the user to enter the country they are from using the Scanner class and prints out the following message:

Where are you from?
Im lucky to have a friend like you from X


Where X is the country the user inputs.
Note: Countries can be more than 1 word, so use nextLine();
 */
public class Whereyoufrom {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Where are you from?");
        String location = input.nextLine();
        System.out.println("Im lucky to have a friend like you from " + location);


    }
}
