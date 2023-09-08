package week2point2.Class5point4;

//example 2

/*
Hey Superstar,

Awesome job on crashing this course so far. To finish Class 5, you have 342 seconds.
Oops, our program is broken and instead of showing me minutes and seconds, it's showing non-sense seconds.
Write a program that converts 342 seconds into minutes and seconds.

___ totalSeconds = 342;
___ minutes = ____;
___ seconds = ____;


Expected Output:

Time remaining: X minutes Y seconds


where X is minutes and Y is seconds.
 */
public class RemainingRange {
    public static void main(String[] args) {

        int totalSeconds = 342;
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds%60;



        System.out.println("Time Remaining: " + minutes + " minutes "+seconds+" seconds");


    }
}
