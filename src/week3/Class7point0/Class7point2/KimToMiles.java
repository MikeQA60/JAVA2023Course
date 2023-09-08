package week3.Class7point0.Class7point2;

import java.util.Scanner;

public class KimToMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the distance in kilometers: ");

        double Kilometers = scanner.nextDouble();
        double miles = Kilometers * 0.621371;

        System.out.printf("Kilometers %.1f are %%.621371 miles" , Kilometers);
    }
}
