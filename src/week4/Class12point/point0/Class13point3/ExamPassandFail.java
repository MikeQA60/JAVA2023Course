package week4.Class12point.point0.Class13point3;

import java.util.Scanner;

public class ExamPassandFail {
    public static void main(String[] args) {

        //write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your score for exam1:");
        double exam1 = sc.nextDouble();
        System.out.println("Please enter your score for exam2:");
        double exam2 = sc.nextDouble();
        System.out.println("Please enter your score for exam3:");
        double exam3 = sc.nextDouble();

        double average = (exam1 + exam2 + exam3) / 3;

        if(average >= 70) {

            System.out.printf("Your average score is %.2f", average);
            System.out.println("\nCongratulations, you passed the exam");
        } else {
            System.out.printf("Your average score is %.2f", average);
            System.out.println("\nSorry, you failed the exam");
        }

    }
}
