package week3.Class7point0.Class9point4;

import java.util.Scanner;

public class RealEstateShopping {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        System.out.println("Enter your desired location");
        int propertyForSale = sc.nextInt();
        System.out.println("Enter your budget: ");
        String desiredLocatation = sc.nextLine();

        boolean  propertyLocation = sc.nextBoolean();
        boolean desiredLocation = sc.nextBoolean();

        boolean x =  propertyForSale >= 15000000.00 && propertyLocation && desiredLocation;




       // boolean x = propertyforsale >= 15000000 && propertyLocation && desiredLocation1;

        System.out.println("Suitable property found: " + x);
}
}

