package week4.Class12point.point0.Class4pont13;

import java.util.Scanner;

public class EvenOddZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println("\nThe number is zero.");
        } else if (number % 2 == 0) {
            System.out.println("\nThe number is even.");
        } else {
            System.out.println("\nThe number is odd.");
        }
    }
}