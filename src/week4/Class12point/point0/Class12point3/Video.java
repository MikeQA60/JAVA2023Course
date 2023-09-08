package week4.Class12point.point0.Class12point3;

import java.util.Scanner;

public class Video {
    public static void main(String[] args) {
        //write a program that checks
        //whether someone is a member of a loyalty program
        //take an input for total money spent
        //if the person is a loyalty member
        //print out the total after applying the discount of 10%

        Scanner sc = new Scanner(System.in);

        System.out.println("Are you a loyalty program member?");
        //enters true or false
        boolean isLoyal = sc.nextBoolean();
        System.out.println("Enter total amount");
        //take input from user
        double total = sc.nextDouble();

        if(isLoyal) {
            //10 percent
            //body of if statement
            //decimal has to be double
            double discountAmount = total * 0.1;
            double total2 = total - discountAmount;
            System.out.println(total2);
        }

    }
}
