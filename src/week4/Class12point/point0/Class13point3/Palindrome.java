package week4.Class12point.point0.Class13point3;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a three-digit number:");
        int num = scanner.nextInt();
        int firstDigit = num / 100;
        int lastDigit = num % 10;
        if (firstDigit == lastDigit) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num +" is not a palindrome");
        }
    }
}

