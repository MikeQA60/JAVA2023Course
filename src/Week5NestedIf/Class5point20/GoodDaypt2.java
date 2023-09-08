package Week5NestedIf.Class5point20;

import java.util.Scanner;

public class GoodDaypt2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day of the week (Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday):");
        String dayOfTheWeek = sc.nextLine();
        System.out.println("Enter the time of day (morning, afternoon, evening):");
        String timeOfTheDay = sc.nextLine();
        switch (dayOfTheWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (timeOfTheDay) {
                    case "morning":
                    case "afternoon":
                    case "evening":

                        System.out.println("Good "+ timeOfTheDay + "! It's " + dayOfTheWeek + "!");
                        break;
                    default:
                        System.out.println("Invalid time of day");
                        break;
                }
                break;

            case "Saturday":
            case "Sunday":
                switch(timeOfTheDay) {
                    case "morning":
                    case "afternoon":
                    case  "evening":
                        System.out.println("Good "+ timeOfTheDay + "! It's the weekend!");
                }
                break;
            default:
                System.out.println("Invalid day of week");
                break;
        }
    }
}

