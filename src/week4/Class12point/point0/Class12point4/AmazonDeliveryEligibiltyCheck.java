package week4.Class12point.point0.Class12point4;

import java.util.Scanner;

public class AmazonDeliveryEligibiltyCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your shipment country:");
        String shipmentCountry = input.nextLine();

        System.out.println("Enter your total purchase amount:");
        double totalPurchaseAmount = input.nextDouble();

        if (shipmentCountry.equals("USA") || shipmentCountry.equals("Canada") || shipmentCountry.equals("Mexico")) {

            if (totalPurchaseAmount>= 120) {
                System.out.println("You are eligible for a free shipment");

            } else {
                totalPurchaseAmount = 120-totalPurchaseAmount;

                System.out.printf("Spend $%.1f more to be eligible for a free shipment", totalPurchaseAmount);

            }
        } else {
            System.out.printf("We currently do not support shipments to %s", shipmentCountry);
        }
    }
}
