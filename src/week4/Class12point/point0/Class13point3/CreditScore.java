package week4.Class12point.point0.Class13point3;

import java.util.Scanner;

public class CreditScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your credit score?");
        int crditscore = scanner.nextInt();

        if (crditscore > 700) {
            System.out.println("Congratulations, your credit score is good");


        }else{

            System.out.println("Your credit score needs improvement");
        }
    }
}


