package week3.Class7point0.Class10point0;

import java.util.Scanner;

public class TotalSales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the sale amount for transaction 1:");
        double total = sc.nextDouble();


        System.out.println("Enter the sale amount for transaction 2:");

        double total2 = sc.nextDouble();
        total += total2;


        System.out.println("Enter the sale amount for transaction 3:");
        double total3 = sc.nextDouble();
        total += total3;

        System.out.println("Total is " + "$" + total);
    }
}
