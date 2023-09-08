package Week5NestedIf.NestedIfPractice5;


import java.util.Scanner;

public class Video {
    public static void main(String[] args) {

        //scanner
        Scanner sc = new Scanner(System.in);

        //message
        System.out.println("Welcome to DevX Restaurant!\n");
        System.out.println("Please choose of the following opetions:");
        System.out.println("1. Appetizers");
        System.out.println("2. Main Course");

        int firstOption = sc.nextInt();

        //first option
       //outer if
        if(firstOption == 1) {
            //getting apps
            System.out.println("1. Spring Rolls");
            System.out.println("2. Egg Rolls");

            //geting
            int appetizerChoice = sc.nextInt();

            //logic for app code
            //inner
            if(appetizerChoice == 1) {
                System.out.println("Your Spring Rolls are being prepared");
            } else if(appetizerChoice == 2) {
                System.out.println("Your Egg Rolls are being prepared");

            }else {
                System.out.println("Invalid Input, please try again.");
            }

        }
    }
}
