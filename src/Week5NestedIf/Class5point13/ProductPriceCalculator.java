package Week5NestedIf.Class5point13;

import java.util.Scanner;

public class ProductPriceCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the quantity of the product:");
       double productQuantity = scanner.nextDouble();

       if(productQuantity <=0){
           System.out.println("Quantity cannot be 0 or less");
           scanner.nextLine();

           String productLocation = scanner.nextLine();
           double totalCost = 0;

           if((!productLocation.equals("USA")) && (!productLocation.equals("Canada")) && (!productLocation.equals("Other"))) {
               System.out.println("Invalid location");
           }else if (productQuantity < 100) {

           if(productLocation.equals("USA")) {
               totalCost = productQuantity * 2.50;

           }else if (productLocation.equals("Canada")) {
               totalCost = productQuantity * 3.00;

           }else if (productLocation.equals("Other")) {
               totalCost = productQuantity * 3.50;

           }System.out.printf("The total cost of the product is: $%.1f", totalCost);
               }else if (productQuantity >=100) {

         if (productLocation.equals("USA")) {
             totalCost = productQuantity * 2.00;

         }else if(productLocation.equals("Canada")) {
             totalCost = productQuantity * 2.50;

         }else if (productLocation.equals("Other")) {
             totalCost = productQuantity * 3.00;
         }
               System.out.printf("The total cost of the product is: $%f", totalCost);

           }
       }

    }
}
