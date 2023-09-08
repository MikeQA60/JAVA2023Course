package week3.Class7point0.Class7point1;

import java.util.Scanner;

public class UberEats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter num of existing items in the cart: ");
        int existitems = sc.nextInt();


        System.out.println("Please enter num of newly added items in the cart: ");
        int newitems = sc.nextInt();

        System.out.println("Total items: " + (existitems + newitems));
    }
}
