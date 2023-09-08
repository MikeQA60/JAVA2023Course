package week3.Class7point0.Class9point5;

import java.util.Scanner;

public class Video {
    public static void main(String[] args) {
        //grocery stroe

        //you want to give a 10% discount to people who are seniors(60) or more than $100 spent


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age");
        //datatype int
        int customerAge = sc.nextInt();
        System.out.println("Please enter total amount spent");
        //datatype w double
        double amountSpent = sc.nextDouble();
                               // 50 and 90 = false
                               //70 and 120 = false
        boolean shouldGiveDiscount = customerAge >= 60 || amountSpent >= 100;
        System.out.println("Should I give discount? " + shouldGiveDiscount);
    }
}
