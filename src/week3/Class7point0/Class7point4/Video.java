package week3.Class7point0.Class7point4;

import java.util.Scanner;

/*
Class 7.4 - Scanner next().charAt(0)
Learn how to use the next().charAt(0) method combination of the Scanner class and the
String class in Java to read single character input from the user, including
 how to handle exceptions and errors, in this comprehensive Scanner Class next().charAt(0) tutorial.
 */
public class Video {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("What is your grade for the exam?");
        char grade = sc.nextLine().charAt(0);
        System.out.println("Your grade is: " + grade);

        System.out.println("What is your gender?");
        char gender = sc.nextLine().charAt(0);
        System.out.println("Gender: " + gender);


    }
}
