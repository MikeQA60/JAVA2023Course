package week1.Class3point6;

//ex 1
/*
Write a program that declares the below variables with the most suitable data types and assigns the values in question.
 Then prints out the values of each variable.

For example:

byte secondsInMinute = 60;
System.out.println(secondsInMinute);
 */
public class HowManySecondsInaMin {
    public static void main(String[] args) {
        // how many seconds in one minute?
        byte secondsInMinute = 60;
        System.out.println(secondsInMinute);

// how many seconds in one hour?
        short secondsInHour = 3600;
        System.out.println(secondsInHour);

// how many seconds in one day?
        int secondsInDay = 86400;
        System.out.println(secondsInDay);

// how many seconds in one week?
        long secondsInWeek = 604800;
        System.out.println(secondsInWeek);

// how many seconds in one month?
        int secondsInMonth = 2592000;
        System.out.println(secondsInMonth);

// how many seconds in one year?
        long secondsInYear = 31536000l;
        System.out.println(secondsInYear);
// how many seconds in one millisecond?
        double secondsInMillisecond = 0.001;
        System.out.println(secondsInMillisecond);

    }
}
