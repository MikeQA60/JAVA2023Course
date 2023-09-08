package week4.Class12point.point0.Class12point4;

import java.util.Scanner;

public class PurchaseEligibilityCheckPt2 {
    //write your code here
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
        System.out.println("Enter your payment information (credit/debit/PayPal):");
    String paymentInfo = input.nextLine();
        System.out.println("Enter your age:");
    double age = input.nextDouble();
        if(paymentInfo.equals("credit") || paymentInfo.equals("debit") || paymentInfo.equals("PayPal")){
        if(age>= 18){
            System.out.println("You are eligible to make a purchase. Thank you for your business!");
        } else{
            age = 18-age;
            System.out.printf("You will be able to make a purchase in %.0f years", age);
        }
    }else {
        System.out.println("Unsupported payment method.");
    }
}
}

