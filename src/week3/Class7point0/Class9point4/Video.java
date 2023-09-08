package week3.Class7point0.Class9point4;

import java.util.Scanner;

public class Video {
    public static void main(String[] args) {

        //must be married
        //age must be between 21 and 35
        //weight must be between 70 and 80
        //height should be taller than 180

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = sc.nextInt();

        System.out.println("Please enter your height");
        double height = sc.nextDouble();

        System.out.println("Please enter your weight");
        double weight = sc.nextDouble();

        System.out.println("Are you married? true/false");
        boolean isMarried = sc.nextBoolean();

        boolean isJamesBond = age >= 21 && age <=35
                && height > 180 && weight >= 70 && weight <= 80
                && isMarried;

        System.out.println(" Is person a james Bond: " + isJamesBond);
    }
}
