package week3.Class7point0.Class10point2;

import java.util.Scanner;

public class MetersToinch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter meters:");
        double lenght = scanner.nextDouble();
        lenght *= 39.37;
        System.out.println(+ lenght + " inches");
    }
}
