package week3.Class7point0.Class7point1;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Please enter the hour: ");
        int hour = sc.nextInt();

        System.out.println("Please enter the minutes: ");
        int minutes = sc.nextInt();

        System.out.println("Please enter the seconds: ");
        int seconds = sc.nextInt();

        System.out.println("The current time is " + hour+":"+ minutes+":" + seconds);
    }
}
