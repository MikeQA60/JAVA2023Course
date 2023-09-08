package week3.Class7point0.Class8point2;

import java.util.Scanner;

public class HeartRate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your current heart rate: ");
        double heartrate = sc.nextDouble();

        System.out.println("Please enter the average heart rate for their age group: " );
        double avgagegroup = sc.nextDouble();


        boolean  agegroup = avgagegroup < heartrate;
        System.out.println("Your heart rate is lower than the average heart rate for your age group: " + agegroup);

    }
}

