package practice;

import java.util.Scanner;

//nested if
/*
Write a Java program that takes three integers as input and checks if they form a valid triangle.
If the sum of the two smaller integers is greater than the largest integer, print
"The three integers form a valid triangle".
Otherwise, print "The three integers do not form a valid triangle".
 */
public class March2pt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        System.out.println("Enter third number");
        int num3 = sc.nextInt();

        if((num1 + num2) > num3 && (num2 + num3) > num1 && (num1 + num3) > num2) {
            System.out.println("The three integers form a valid triangle");
        }else {
            System.out.println("The three integers do not form a valid triangle");
        }



    }
}
