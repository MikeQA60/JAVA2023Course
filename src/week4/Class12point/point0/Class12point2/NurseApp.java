package week4.Class12point.point0.Class12point2;

import java.util.Scanner;

public class NurseApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Body Temperature:");
        double temperature = sc.nextDouble();

        if (temperature < 99.7) {
            System.out.println("Drink Some Hot Tea to Warm Up");

        }

        if (temperature > 99.5) {
            System.out.println("Take Tylenol to Bring Your Temperature Down");

        }
        if (temperature >= 97.5 && temperature <= 99.55) {
            System.out.println("Drink Some Hot Tea to Warm Up");

        }
    }
}
