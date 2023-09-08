package practice;

//nested if
/*
Write a Java program that takes two integers as input and checks which one of them is greater.
If the first integer is greater, the program should then check if it is divisible by the second integer.
 If it is divisible, print "The first integer is greater and divisible by the second integer".
 Otherwise, print "The first integer is greater but not divisible by the second integer".
 If the second integer is greater, the program should then check if it is divisible by the first integer.
  If it is divisible, print "The second integer is greater and divisible by the first integer".
   Otherwise, print "The second integer is greater but not divisible by the first integer".
 If the two integers are equal, print "The two integers are equal".
 */
import java.util.Scanner;

public class IfMarch2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first Int");
        int num1 = sc.nextInt();
        System.out.println("Enter the second Int");
        int num2 = sc.nextInt();

        // if num greater then 1
        if(num1 > num2) {
            if (num1 % num2 == 0) {
                System.out.println("The first integer is greater and divisible by the second integer");
            } else {
                System.out.println("The first integer is greater and divisible by the second integer"); }

            //greater 20 to 200
            } else if (num2 > num1) {
            if (num2 % num1 == 0) {
                System.out.println("The second integer is greater and divisible by the first integer");

                //
            } else {
                System.out.println("The second integer is greater and divisible by the first integer");
            }
        } else {
            System.out.println("The two integers are equal");

               }
            }
    }

