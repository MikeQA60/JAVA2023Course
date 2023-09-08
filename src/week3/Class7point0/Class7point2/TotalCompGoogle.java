package week3.Class7point0.Class7point2;

import java.util.Scanner;

public class TotalCompGoogle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your monthly income: ");
        double income  = scanner.nextDouble();

        System.out.println("Please enter the amount paid in stocks per year: " );
        double stockbonus  = scanner.nextDouble();

        System.out.printf("Please enter the bonus percentage from the base salary: ");
      //  +"%.1f ", baseSal/10);
        double percent  = scanner.nextDouble();

        System.out.printf("");
                //(160000+60000) + (10/160000));
        double totalcomp  = scanner.nextDouble();
    }
}

/*
Expected: Please enter your monthly income:
You have to save $400.00 per month which is 10% of your monthly income
In 6 months you will save $2400.00
In 12 months you will save $4800.00

Run: Please enter your annual base salary:
Please enter the amount paid in stocks per year:
 */