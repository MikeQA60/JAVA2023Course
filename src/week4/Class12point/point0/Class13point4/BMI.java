package week4.Class12point.point0.Class13point4;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your height in meters:");
        double height = scanner.nextDouble();
        System.out.println("Enter your weight in kilograms:");
        double weight = scanner.nextDouble();
        System.out.println("Your BMI is within the healthy weight range");
       double weightinKilograms = scanner.nextDouble();

        double bmi = weight / (height*height);

     if ((bmi >= 18.5) && (bmi < 24.9)){
         System.out.println("Your BMI is within the healthy weight range");
        }else {
         System.out.println("Your BMI is outside the healthy weight range");
     }
    }
}