package Week5NestedIf.Class5point13;

import java.util.Scanner;

public class ProductPriceCalculatorAnswer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quantity of the product: ");
        int quantity = sc.nextInt();

        if(quantity > 0) {
            System.out.println("Enter the location of the customer (USA/Canada/Other): ");
            String location = sc.next();

            if(quantity < 100){
                if(location.equalsIgnoreCase("usa")){
                    double cost = 2.50;

                    System.out.println("The total cost of the product is: $"+quantity * cost);
                }else if(location.equalsIgnoreCase("canada")){
                    double cost = 3.00;

                    System.out.println("The total cost of the product is: $"+quantity * cost);
                }else if(location.equalsIgnoreCase("other")){
                    double cost = 3.50;

                    System.out.println("The total cost of the product is: $"+quantity * cost);
                }else{
                    System.out.println("Invalid location");
                }
            }else if(quantity >= 100){
                if(location.equalsIgnoreCase("usa")){
                    double cost = 2.00;
                    System.out.println("The total cost of the product is: $"+quantity * cost);
                }else if(location.equalsIgnoreCase("canada")){
                    double cost = 2.50;
                    System.out.println("The total cost of the product is: $"+quantity * cost);
                }else if(location.equalsIgnoreCase("other")){
                    double cost = 3.00;
                    System.out.println("The total cost of the product is: $"+quantity * cost);
                }else{
                    System.out.println("Invalid location");
                }
            }
        }else {
            System.out.println("Quantity cannot be 0 or less");
        }
    }
}
