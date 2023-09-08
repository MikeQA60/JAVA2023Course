package week3.Class7point0.Class7point2;

import java.util.Scanner;

public class LitersTogallons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How Many liters?");
        double liters = scanner.nextDouble();



        double gallons = liters*0.264172;
        System.out.printf("%.0f liters are %.5f gallons", liters, gallons);
    }
}
