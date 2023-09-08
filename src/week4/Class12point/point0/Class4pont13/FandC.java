package week4.Class12point.point0.Class4pont13;

import java.util.Scanner;

public class FandC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a temperature:");
        double temperatureValue = scanner.nextDouble();

        System.out.print("\nEnter 'C' for Celsius or 'F' for Fahrenheit:");
        char scale = scanner.next().charAt(0);

        double convertedTemperature = 0;

        if (scale == 'C') {
            convertedTemperature = (temperatureValue * 9 / 5) + 32;
            System.out.printf("\n%.1f Celsius is %.1f Fahrenheit", temperatureValue, convertedTemperature);
        } else if (scale == 'F') {
            convertedTemperature = (temperatureValue - 32) * 5 / 9;
            System.out.printf("\n%.1f Fahrenheit is %.1f Celsius", temperatureValue, convertedTemperature);
        } else if (!(scale == 'F' || scale == 'C')) {
            System.out.println("\nInvalid scale. Please enter 'C' or 'F'");
        }
    }
}

