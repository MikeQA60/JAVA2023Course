package week3.Class7point0.Class7point2;

import java.util.Scanner;

public class ROI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the invested amount in $: ");
        double investedmoney  = scanner.nextDouble();

        System.out.println("Please enter the ROI amount:");
        double roi  = scanner.nextDouble();

        System.out.printf("Your ROI is %.2f%%", roi/investedmoney*100);

        //(roi/investedmoney) *100.2

    }
}
