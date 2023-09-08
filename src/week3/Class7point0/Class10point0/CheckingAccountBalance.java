package week3.Class7point0.Class10point0;

import java.util.Scanner;

public class CheckingAccountBalance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       double balance = 118000;


        System.out.println("Please enter the first transaction amount:");
        double balance2 = sc.nextDouble();
        balance -= balance2;


        System.out.println("Please enter the second transaction amount:");
        double balance3 = sc.nextDouble();
        balance -= balance3;


        System.out.println("Please enter the third transaction amount:");
        double balance4 = sc.nextDouble();
        balance -= balance4 ;
        System.out.println("Your Remaining Balance" + ": " + "$" + balance);



    }
}
