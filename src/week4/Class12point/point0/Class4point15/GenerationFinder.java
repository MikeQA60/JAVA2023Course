package week4.Class12point.point0.Class4point15;

import java.util.Scanner;

public class GenerationFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birth year:");
        int birthYear = scanner.nextInt();

        if (birthYear >= 1946 && birthYear <= 1964) {
            System.out.println("You belong to the Baby Boomer generation.");
        } else if (birthYear >= 1965 && birthYear <= 1980) {
            System.out.println("You belong to the Generation X generation.");
        } else if (birthYear >= 1981 && birthYear <= 1996) {
            System.out.println("You belong to the Millennial generation.");
        } else if (birthYear >= 1997 && birthYear <= 2012) {
            System.out.println("You belong to the Generation Z generation.");
        } else if (birthYear >= 2013) {
            System.out.println("You belong to the Generation Alpha generation.");
        } else {
            System.out.println("Invalid input.");
        }
    }
}
