package week4.Class12point.point0.Class13point3;

import java.util.Scanner;

public class isDivisibleBy5 {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        if (num%5==0) {
            System.out.println("The number entered is divisible by 5");
        } else{
            System.out.println("The number entered is not divisible by 5");
        }

    }
}