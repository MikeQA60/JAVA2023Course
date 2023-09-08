package week2point2.Class4point0;
//example 5

/*

Write a program that will print out the following by:

1. declaring a meetingName1 variable with "Daily Standup" value

2. declaring a startTime1 variable with "9:15am" value

3. declaring a endTime1 variable with "9:45am" value.

4. declaring a meetingName2 variable with "Test Strategy Meeting" value

5. declaring a startTime2 variable with "14:15pm" value

6. declaring a endTime2 variable with "15:15pm" value.



Print out the values of each variable in a new line.



Daily Standup					Start time: 9:15am		End time: 9:45am
Test Strategy Meeting			         Start time: 14:15pm		End time: 15:15pm

Note: use \t escape character to give spaces - 5 times after Daily Standup and 3 times after Test Strategy Meeting, 2 times after Start time.
 */
public class Calendar {
    public static void main(String[] args) {

        //declare a datatype variable name have to go around double quotes with /t being spaces
      String meetingName1 = "Daily Standup\t\t\t\t\t";
        //declare a datatype variable name have to go around double quotes with /t being spaces
       String startTime1 = "Start time: 9:15am\t\t";
        //declare a datatype variable name have to go around double quotes with /t being spaces
       String endTime1 = "End time: 9:45am";
        //concat(add) all strings together
        System.out.println(meetingName1 + startTime1 + endTime1);

        //declare a datatype variable name have to go around double quotes with /t being spaces
        String meetingName2 = "Test Strategy Meeting\t\t\t";

        //declare a datatype variable name have to go around double quotes with /t being spaces
        String startTime2 = " Start time: 14:15pm\t\t";
        //declare a datatype variable name have to go around double quotes with /t being spaces
        String endTime2 = "End time: 15:15pm";

      //concat(add) all strings together
        System.out.println(meetingName2 + startTime2 + endTime2);

        // System.out.println("\t\t\t\t");

//        String meetname2 = "Daily Standup\t\t\t\t\tStart time: 9:15am\t\tEnd time: 9:45am\n" +
//                "Test Strategy Meeting\t\t\t         Start time: 14:15pm\t\tEnd time: 15:15pm";
//        System.out.println(meetname2);


//        String meetingname1 = "Daily Standup\t\t\t\t\tStart time: 9:15am\t\tEnd time: 9:45am\n" +
//                "Test Strategy Meeting\t\t\t Start time: 14:15pm\t\tEnd time: 15:15pm";
//
//        System.out.println(meetingname1);

//        System.out.println("Daily Standup\t\t\t\tStart time: 9:15am");
//        System.out.println("End time: 9:45am ");
//        System.out.println("Test Strategy Meeting\t\tStart time: 14:15pm");
//        System.out.println("End time: 15:15pm");

//        Daily Standup					Start time: 9:15am		End time: 9:45am
//        Test Strategy Meeting			Start time: 14:15pm		End time: 15:15pm
    }
}
