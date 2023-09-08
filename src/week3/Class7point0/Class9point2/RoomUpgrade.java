package week3.Class7point0.Class9point2;

import java.util.Scanner;

public class RoomUpgrade {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean hasBalconyView = sc.nextBoolean();
        boolean hasKingBed = sc.nextBoolean();
        boolean x = hasBalconyView || hasKingBed;

        System.out.println("Does your room have a balcony view?");
        System.out.println("Does your room have a king sized bed?");
        System.out.println("You are eligible for a premium upgrade: " + x);
    }
}
