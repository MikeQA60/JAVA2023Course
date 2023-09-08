package week3.Class7point0.Class8point2;

import java.util.Scanner;

public class HeightMeasurement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your current height: ");
        int curheight = sc.nextInt();
        System.out.println("Please enter the average height of their age group: ");
        int avgheight = sc.nextInt();
        boolean height = curheight > avgheight;
        System.out.println("You are taller than the average height of their age group: " + height);
    }
}
