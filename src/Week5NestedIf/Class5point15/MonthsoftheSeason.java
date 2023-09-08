package Week5NestedIf.Class5point15;

import java.util.Scanner;

public class MonthsoftheSeason {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a season:");
        String season = sc.next();


        switch (season) {
            case "spring":
                System.out.println("March");
                System.out.println("April");
                System.out.println("May");
                break;
            case "summer":

                System.out.println("June");
                System.out.println("July");
                System.out.println("August");
                break;
            case "fall":

                System.out.println("September");
                System.out.println("October");
                System.out.println("November");
                break;
            case "winter":
                System.out.println("December");
                System.out.println("January");
                System.out.println("February");
                break;

        }
    }
}
