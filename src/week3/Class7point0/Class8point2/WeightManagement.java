package week3.Class7point0.Class8point2;

import java.util.Scanner;

public class WeightManagement {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your current weight: ");
    int weight1 = sc.nextInt();
        System.out.println("Please enter your ideal weight: ");
    int weight2 = sc.nextInt();
    boolean weight = weight1 == weight2;
        System.out.println("Your current weight is less than your ideal weight: " + weight);

 }
}