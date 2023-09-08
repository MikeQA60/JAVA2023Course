package Week5NestedIf.NestedIfPractice3;

import java.util.Scanner;

public class Video {
    public static void main(String[] args) {
        //get salaray and age from user
        //1. if age is less than 18 then print you're not gligible
        //2. if age is more than or equal 18 and salary is less than 5000
        //then print 'Sortry, you need work hard to get credit card'
        //3. if age is more than or equal 18 and salary is greater than
        //or equal 5000 then print you're eligible
        //4. if age is more than or equal 18 and salary is greater than
        //or equal to 20000 then print you'll get free credit card

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Enter your Salary");

        double salary = sc.nextDouble();

        //1.
        if(age < 18) {
            System.out.println("You are not eligible for a credit card");

            //2
        }else if (age >=18 && salary < 5000) {
            System.out.println("Sorry you need to work hard to get credit card");

        }else if (age>-18 && salary >= 2000) {
            System.out.println("You are eligible for a interest free credit card");
        }

        //
    }
}
