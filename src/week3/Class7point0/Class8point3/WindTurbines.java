package week3.Class7point0.Class8point3;

import java.util.Scanner;

public class WindTurbines {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the average wind speed in your region: ");
//        int rainfall = 40;
//        boolean israinfall = rainfall >= 50;

        int wt = scanner.nextInt();
        int awp = 10;

        boolean map = wt >= awp;


        System.out.println("Your region should install wind turbines: " + map);
    }
}

