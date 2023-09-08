package week3.Class7point0.Class8point1;

import java.util.Scanner;

public class CountriesVisited {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of countries they have visited: ");
        int firstinitial = sc.nextInt();
        System.out.println("Please enter the number of countries they plan to visit:");
        int secondinitial = sc.nextInt();
        boolean countries = firstinitial != secondinitial;
        System.out.println("You either have more or fewer countries than planned: " + countries);
    }
}
