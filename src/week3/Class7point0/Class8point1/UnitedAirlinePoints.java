package week3.Class7point0.Class8point1;

import java.util.Scanner;

public class UnitedAirlinePoints {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of miles they have traveled: ");
        char firstinitial = sc.nextLine().charAt(0);
        int num1 = 1000;
        System.out.println("Please enter the number of miles they plan to travel: ");
        char secondinitial = sc.nextLine().charAt(0);
        int num2 = 1000;
        boolean shouldIKickAlarm = firstinitial == secondinitial;
        System.out.println("You have traveled the planned miles already: " + shouldIKickAlarm);

    }
}
