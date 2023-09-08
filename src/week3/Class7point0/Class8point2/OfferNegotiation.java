package week3.Class7point0.Class8point2;

import java.util.Scanner;

public class OfferNegotiation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the expected salary: ");
        double expected = sc.nextDouble();

        System.out.println("Please enter the offered salary: " );
        double offered = sc.nextDouble();

        //boolean negotiation = sistem != zero;
        boolean negotiation = offered < expected;
        System.out.println("Should I negotiate? " + negotiation);





        // boolean x = sistem > 1300000;
       // boolean y = zero > 100000;
        //System.out.println("Please enter the expected salary: ");
       // System.out.println("Please enter the offered salary: " );
       // System.out.println("Should I negotiate? " );
    }
}
