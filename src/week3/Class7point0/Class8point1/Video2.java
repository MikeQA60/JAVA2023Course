package week3.Class7point0.Class8point1;

public class Video2 {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 20;


                          //return if both are true
        boolean areEqual = num1 == num2;

        System.out.println(areEqual);

        int currentTime = 6;
        int setTimeForAlarm = 6;
        boolean shouldIKickAlarm = currentTime == setTimeForAlarm;
        System.out.println("Kick off alarm?" + shouldIKickAlarm);

        //!= , -return true when two sides are not equal

        int num4 = 5;
        int num5 = 10;

        //returns true for both
        boolean areEqual2 = num4 != num5;
        System.out.println(areEqual2);

        int numberOfCompletedExcercisesThisWeek = 5;
        boolean shouldICloseAccessToMentors = numberOfCompletedExcercisesThisWeek !=5;
        System.out.println(shouldICloseAccessToMentors);




    }
}
