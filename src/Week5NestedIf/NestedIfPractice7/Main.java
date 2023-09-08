package Week5NestedIf.NestedIfPractice7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //scanner
        Scanner sc = new Scanner(System.in);

        //message
        System.out.println("Welcome to DevX Restaurant!\n");
        System.out.println("Please choose of the following opetions:");
        System.out.println("1. Appetizers");
        System.out.println("2. Main Course");

        String firstOption = sc.nextLine();

        //first option
        //outer if
        if(firstOption.equals("1") || firstOption.equals("Appetizers")) {
            //getting apps
            System.out.println("1. Spring Rolls");
            System.out.println("2. Egg Rolls");

            //geting
            String appetizerChoice = sc.nextLine();

            //logic for app code
            //inner
            if(appetizerChoice.equals("1") || appetizerChoice.equals("Spring Rolls")) {
                System.out.println("Your Spring Rolls are being prepared");
            } else if(appetizerChoice.equals("2") || appetizerChoice.equals("Egg Rolls"))  {
                System.out.println("Your Egg Rolls are being prepared");

            }else {
                System.out.println("Invalid Input, please try again.");
            }

        } else if (firstOption.equals("2") || firstOption.equals("Main Course")) {
            System.out.println("1. Chciken Curry");
            System.out.println("2. New York Ribe Eye");

            String mainCourseChoice = sc.nextLine();

            if (mainCourseChoice.equals("1") || mainCourseChoice.equals("Chicken Curry")) {
                System.out.println("Your chicken curry is being prepared by our Chef");
            }
            else if(mainCourseChoice.equals("2") || mainCourseChoice.equals("New York Ribe Eye")) {
                System.out.println("Your New York Rib Eye Steak is being grilled by our Chef");
            }else {
                System.out.println("Invalid Main Course Choice, Try Again");
            }
        } else {
            System.out.println("Invalid Option , only Appetizers and Main Courses are available");
        }
    }
}


