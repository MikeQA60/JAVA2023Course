package week3.Class7point0.Class8point2;

import java.util.Scanner;

public class MortgageApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sistem = sc.nextDouble();
        double zero = sc.nextDouble();

        boolean x = sistem > 50000;
        boolean y = zero > 700;

        System.out.println("You meet the minimum income requirements: " + x);
        System.out.println("You meet the minimum credit score requirements: " + y);



      //  boolean credit = minincome > mincreditscore;

//        Scanner sc = new Scanner(System.in);
//        System.out.println("You meet the minimum income requirements: ");
//        int minincome = sc.nextInt();
//        System.out.println("You meet the minimum credit score requirements: ");
//        int mincreditscore = sc.nextInt();
//        boolean credit = minincome > mincreditscore;

    }
}