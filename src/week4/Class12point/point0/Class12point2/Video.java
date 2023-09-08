package week4.Class12point.point0.Class12point2;

import java.util.Scanner;

public class Video {
    public static void main(String[] args) {

        //you are eligible to drive if the age is more than or equal to 1
        //you are not eligible to driver if the age is less than 16

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if (age >= 16) {
            System.out.println("You are eligible to drive");
        }

     if(age < 16) {
         System.out.println("You are not eligible to drive");
    }



    }
}
