package Week5NestedIf.Class5point18;

import java.util.Scanner;

public class WeekDayorAWeekDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day of the week:");
        String dayOfTheWeek = sc.nextLine();
       // String weekend = sc.nextLine();


       // System.out.println("Enter the time of day ():");
      //  String timeOfTheDay = sc.nextLine();
        switch (dayOfTheWeek) {
            case "weekday":

            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println(dayOfTheWeek + " is a weekday");
                break;
            //    System.out.println(dayOfTheWeek + " is a weekday");

            //    break;

         //     switch(dayOfTheWeek) {

            case "weekend":
                    case "Saturday":
                    case "Sunday":
                        System.out.println(dayOfTheWeek+ " is a weekend day");
              //  }
                break;
            default:
                System.out.println("Invalid day of week");
                break;
        }
    }
}
