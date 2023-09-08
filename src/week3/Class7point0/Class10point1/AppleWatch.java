package week3.Class7point0.Class10point1;

import java.util.Scanner;

public class AppleWatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double price = sc.nextDouble();
        price = 149.45;

        double shipping = sc.nextDouble();
        shipping = 12.50;


        double price1 = 2;
        price *= price1;

        double price2 = 7.5;
        price += price2;
        System.out.println(price);
    }
}
