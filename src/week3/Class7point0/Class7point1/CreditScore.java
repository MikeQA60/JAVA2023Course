package week3.Class7point0.Class7point1;

import java.util.Scanner;

public class CreditScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // int creditscore = sc.nextInt();
        System.out.println("Please enter your credit score: ");
        int creditscore = sc.nextInt();

      //  System.out.println(850 - creditscore);
      //  int creditneed = sc.nextInt();
        System.out.println("You need " + (850 - creditscore) + " points to reach 850");

    }
}
