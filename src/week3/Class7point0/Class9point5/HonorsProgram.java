package week3.Class7point0.Class9point5;

import java.util.Scanner;

public class HonorsProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your major?");
        String major = scanner.nextLine();

        System.out.println("What is your GPA?");
        double gpa = scanner.nextDouble();



        boolean eligbleforHonorsProgram  = (gpa >= 3.0 && major.equals("computer science"))|| (gpa >= 3.5 && major.equals("engineering"));


        System.out.println("You are eligible for the honors program" + major + ": " + eligbleforHonorsProgram);
    }
}
