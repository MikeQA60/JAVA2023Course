package week4.Class12point.point0.Class13point3;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the current hour in 24-hour format:");
        int hour = scanner.nextInt();

        System.out.println("Please enter the current minute of the hour:");
        int minute = scanner.nextInt();
        String pmOrAm;
        if ( hour >= 12) {
            pmOrAm = "PM";
            if (hour > 12){
                hour -= 12;
            }
        } else {
            pmOrAm = "AM";
            if (hour == 0) {
                hour = 12;
            }
        }
        System.out.printf("The time in 12-hour format is: %d:%02d %s", hour, minute, pmOrAm);
    }
}
