package week4.Class12point.point0.Class13point5;

import java.util.Scanner;

public class FerarriFuelConsumption {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the distance traveled in miles");
        double distanceTraveledinMiles = scanner.nextDouble();

        System.out.println("Enter the time taken in hours:");
        double timeInHours = scanner.nextDouble();

        double averageSpeed = distanceTraveledinMiles / timeInHours;

        System.out.printf("The average speed was %.2f miles per hour.", averageSpeed);
        double gallonsPerMile = 0;

        if(averageSpeed <= 60) {
            gallonsPerMile = 1.0 / (averageSpeed / 15);
        }else {
            gallonsPerMile = 1.0 / (averageSpeed/9);
        }

        System.out.printf("\n Ferrari used %.2f gallons of fuel per mile.", gallonsPerMile);
    }
}
