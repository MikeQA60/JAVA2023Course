package week4.Class12point.point0.Class12point4;

import java.util.Scanner;
public class PurchaseEligibiltyCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String payment = scanner.nextLine();
        int age = scanner.nextInt();


      //  String payment = scanner.nextLine();

        if (age>= 18 && (payment.equals("credit") || payment.equals("debit") || payment.equals("Paypal"))) {

        System.out.println("Enter your payment information (credit/debit/PayPal):");
        System.out.println("Enter your age:");
        System.out.println("You are eligible to make a purchase. Thank you for your business!");

    }
    if (age<18) {
        int newAge=18-age;
        System.out.println("Enter your payment information (credit/debit/PayPal):");
        System.out.println("Enter your age: ");
        System.out.println("You are eligible to make a purchase in "+newAge+"years");

    }

    if (!payment.equals("credit") && !payment.equals("debit") && !payment.equals("Paypal")) {
        System.out.println("Enter your payment information (credit/debit/PayPal):");
        System.out.println("Enter your age:");
        System.out.println("Unsupported payment method.");

       }
    }
}
