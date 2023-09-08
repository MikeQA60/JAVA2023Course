package week4.Class12point.point0.Class13point3;

import java.util.Scanner;

public class ExamPassfail2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your score for exam1:");
         double score1 = scanner.nextDouble();
        System.out.println("Please enter your score for exam2:");
         double score2 = scanner.nextDouble();
        System.out.println("Please enter your score for exam3:");
        double score3 = scanner.nextDouble();
        double scoreAverage = (score1 + score2 + score3) / 3;

  //      System.out.println("\nCongratulations, you passed the exam");
        if (scoreAverage >= 70) {
            System.out.printf("Your average score is %.2f", scoreAverage);
            System.out.println("\nCongratulations, you passed the exam");
        } else {
            System.out.printf("Your average score is %.2f", scoreAverage);
            System.out.println("\nSorry, you failed the exam");
        }
    }
}
