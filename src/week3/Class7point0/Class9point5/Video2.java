package week3.Class7point0.Class9point5;

import java.util.Scanner;

public class Video2 {
    public static void main(String[] args) {
        // "yes" , "y", "Y"
        Scanner sc = new Scanner(System.in);


        System.out.println("Do you want to proceed");
        String answer = sc.nextLine();
             //compare anwer with    //use or to compare all are true // dont use and to compare strings
        boolean proceed = answer.equals("yes") || answer.equals("y") || answer.equals("Y");

        System.out.println("Proceed? " + proceed);


    }
}
