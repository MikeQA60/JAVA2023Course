package week3.Class7point0.Class7point;

import java.util.Scanner;

public class BillingAddress {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //input.next  only takes a single word string
        String streetaddress = input.nextLine();
      //  System.out.println("Please enter your street address: " + streetaddress);
        String city = input.nextLine();
        String state= input.nextLine();
        String zipcode= input.nextLine();
       // String BillingAddress = input.nextLine();


       // System.out.println("Please enter your street address: " + streetaddress);
        System.out.println("Please enter city: ");
        System.out.println("Please enter state: ");
        System.out.println("Please enter zipcode: ");
        System.out.println("Entered Billing Address:"+ streetaddress+ (",") + city + (",") + state+ (",") + zipcode);

        //     System.out.println("Please enter your street address: " + streetaddress);
        //        System.out.println("Please enter city: " + city);
        //        System.out.println("Please enter state: " + state);
        //        System.out.println("Please enter zipcode: " + zipcode);
        //        System.out.println("Entered Billing Address:" + streetaddress+ (",") + city + (",") + state +  (",") + zipcode);
        //


    }
}
