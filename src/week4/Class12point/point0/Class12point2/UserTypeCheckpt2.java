package week4.Class12point.point0.Class12point2;

import java.util.Scanner;

public class UserTypeCheckpt2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your user type?");
        String userType = scanner.nextLine();

        if (userType.equals("admin")) {
            System.out.printf("Access to all features and functionalities of the platform\nAbility to create and manage user accounts\nAbility to view and analyze user data\nAbility to adjust platform settings and configurations\nAbility to generate reports and export data");
        }
        if (userType.equals("mentor")) {
            System.out.printf("Ability to view and manage the progress of assigned mentees\nAccess to resources and tools for guiding and supporting mentees\nAbility to communicate with mentees through the platform\nAbility to track and analyze mentee progress and performance");
        }
        if (userType.equals("free trail users")) {
            System.out.printf("Limited access to certain features and functionalities of the platform\nAbility to explore and experiment with the platform's basic features\nAccess to limited support and resources\nOpportunity to evaluate the platform before committing to a paid subscription");
        }
        if (userType.equals("paid users")) {
            System.out.printf("Full access to all features and functionalities of the platform\nAccess to premium support and resources\nAbility to customize and personalize their experience on the platform\nAccess to advanced tools and features for optimizing performance and productivity\nAbility to collaborate and communicate with other users on the platform");
        }
    }
}



