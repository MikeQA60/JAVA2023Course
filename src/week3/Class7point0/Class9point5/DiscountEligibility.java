package week3.Class7point0.Class9point5;

import java.util.Scanner;

public class DiscountEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your loyalty status:");
        String loyaltyStatus = scanner.nextLine();

        System.out.println("Please enter your purchase amount:");
        double purchaseAmount = scanner.nextDouble();



        boolean isEligibleForDiscount = (purchaseAmount>=100.00 && loyaltyStatus.equals("gold"))|| (purchaseAmount>=50.00 && loyaltyStatus.equals("silver"));


        System.out.println("You are eligible for a discount" + ": " + isEligibleForDiscount);
    }
}
